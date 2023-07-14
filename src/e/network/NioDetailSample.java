package e.network;

import java.nio.IntBuffer;
import java.util.StringTokenizer;

public class NioDetailSample {

	public static void main(String[] args) {
		NioDetailSample sample = new NioDetailSample();
		//sample.checkBuffer();
		//sample.checkBufferStatus();
	}
	
	public void checkBuffer() {
		
		try {
			IntBuffer buffer = IntBuffer.allocate(1024);
			
			for(int i = 0; i<100; i++) {
				buffer.put(i);
			}
			System.out.println("buffer capacity" + buffer.capacity());
			System.out.println("buffer limit" + buffer.limit());
			System.out.println("buffer position" + buffer.position());
			buffer.flip();
			System.out.println("buffer flip");
			System.out.println("buffer limit" + buffer.limit());
			System.out.println("buffer position" + buffer.position());
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printBufferStatus(String job, IntBuffer buffer) {
		System.out.println("Buffer " + job + "!!!");
		System.out.format("Buffer position = %d remaining = %d limit = %d \n", buffer.position(), buffer.remaining(), buffer.limit());
		
	}
	
	public void checkBufferStatus() {
		
		try {
			IntBuffer buffer = IntBuffer.allocate(1024);
			printBufferStatus("init", buffer);
			buffer.get();
			printBufferStatus("get", buffer);
			buffer.mark();
			printBufferStatus("mark", buffer);
			buffer.reset();
			printBufferStatus("reset", buffer);
			buffer.get();
			printBufferStatus("get", buffer);
			buffer.reset();
			printBufferStatus("reset", buffer);
			buffer.get();
			printBufferStatus("get", buffer);
			buffer.reset();
			printBufferStatus("reset", buffer);
			buffer.rewind();
			printBufferStatus("rewind", buffer);
			buffer.get();
			printBufferStatus("get", buffer);
			buffer.mark();
			printBufferStatus("mark", buffer);
			buffer.get();
			printBufferStatus("get", buffer);
			buffer.reset();
			printBufferStatus("reset", buffer);
			buffer.clear();
			printBufferStatus("clear", buffer);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
