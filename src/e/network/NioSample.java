package e.network;

import static java.io.File.separator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {

	public static void main(String[] args) {
		NioSample sample = new NioSample();
		sample.basicWriteAndRead();
	}
	
	public void basicWriteAndRead() {
		String fileName = "D:"+separator+"IM_woo"+separator+"godofjava"+separator+"src"+separator+"text"+separator+"nio.txt";
		try {
			writeFile(fileName, "My First NIO sample");
			readFile(fileName);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeFile(String fileName, String data) throws Exception {
		FileChannel channel = new FileOutputStream(fileName).getChannel();
		byte[] byteData = data.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(byteData);
		channel.write(buffer);
		channel.close();
	}
	
	public void readFile(String fileName) throws Exception {
		FileChannel channel = new FileInputStream(fileName).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		channel.read(buffer);
		buffer.flip();
		while(buffer.hasRemaining()) {
			System.out.print((char)buffer.get());
		}
		channel.close();
		
	}

}
