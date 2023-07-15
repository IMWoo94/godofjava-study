package e.network;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.stream.IntStream;

public class SocekClientSample {

	public static void main(String[] args) {
		SocekClientSample sample = new SocekClientSample();
		sample.sendSocketSample();

	}
	public void sendSocketSample() {
		for(int i = 0; i<3; i++) {
			//sendSocketData("I liked java at" + new Date());
			sendAndReceiveSocketData("I liked java at" + new Date());
		}
		//sendSocketData("EXIT");
		sendAndReceiveSocketData("EXIT");
	}
	
	public void sendSocketData(String data) {
		try (Socket socket = new Socket("127.0.0.1", 9999)){
			System.out.println("Client : Connecting");
			System.out.println("Client : connect status = " + socket.isConnected());
			Thread.sleep(1000);
			OutputStream stream = socket.getOutputStream();
			BufferedOutputStream out = new BufferedOutputStream(stream);
			byte[] bytes = data.getBytes();
			out.write(bytes);
			System.out.println("Client : Sent data");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendAndReceiveSocketData(String data) {
		try (Socket socket = new Socket("127.0.0.1", 9999)){
			System.out.println("Client : Connecting");
			System.out.println("Client : connect status = " + socket.isConnected());
			Thread.sleep(1000);
			
			InputStream inStream = socket.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(inStream));
			StringBuilder receivedData = new StringBuilder();
			while((data = in.readLine()) != null ) {
				receivedData.append(data);
			}
			System.out.println("Received data : " + receivedData);
			in.close();
			inStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
