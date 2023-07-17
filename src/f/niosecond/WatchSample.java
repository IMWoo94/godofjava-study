package f.niosecond;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchSample extends Thread{
	String dirName;
	
	public static void main(String[] args) throws Exception  {
		String dirName = "D:\\IM_Woo\\godofjava";
		String fileName = "WatchSample.txt";
		WatchSample sample = new WatchSample(dirName);
		sample.setDaemon(true);
		sample.start();
		Thread.sleep(1000);
		for(int i = 0; i<10; i++) {
			System.out.println("fileWriteDelete " + i );
			sample.fileWriteDelete(dirName, fileName+i);
		}
	}
	
	public WatchSample(String dirName) {
		this.dirName = dirName;
	}
	
	@Override
	public void run() {
		System.out.println("watcher thread is started");
		System.out.format("Dir =%s\n", dirName);
		addWatcher();
	}
	
	public void addWatcher() {
		try {
			Path dir = Paths.get(dirName);
			System.out.println("addWatcher" + dir.toString());
			
			WatchService ws = FileSystems.getDefault().newWatchService();
			WatchKey key = dir.register(ws, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
			while(true) {
				key = ws.take();
				System.out.println("addWatcher take");
				List<WatchEvent<?>> eventList = key.pollEvents();
				for(WatchEvent<?> event : eventList) {
					Path name = (Path) event.context();
					if(event.kind() == ENTRY_CREATE) {
						System.out.format("%s ENTRY_CREATE %n", name);
					}else if(event.kind() == ENTRY_DELETE) {
						System.out.format("%s ENTRY_DELETE %n", name);
					}else if(event.kind() == ENTRY_MODIFY) {
						System.out.format("%s ENTRY_MODIFY %n", name);
					}
				}
				key.reset();
			}
			
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileWriteDelete(String dirName, String fileName) {
		Path path = Paths.get(dirName, fileName);
		String contents = "Watcher sample";
		StandardOpenOption openOption = StandardOpenOption.CREATE;
		try {
			System.out.println("write " + fileName);
			Files.write(path, contents.getBytes(), openOption);
			Files.delete(path);
			Thread.sleep(1000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
