package e.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class SocketServerSample {

	public static void main(String[] args) {
		SocketServerSample sample = new SocketServerSample();
		//sample.startServer();
		sample.startReplyServer();

	}
	
	public void startServer() {
		Socket client = null;
		
		try (ServerSocket server = new ServerSocket(9999)){
			while(true) {
				System.out.println("Server:Waiting for request.");
				client = server.accept();
				System.out.println("Server:accept");
				InputStream stream = client.getInputStream();
				BufferedReader in = new BufferedReader(new InputStreamReader(stream));
				String data = null;
				StringBuilder receivedData = new StringBuilder();
				while((data = in.readLine()) != null ) {
					receivedData.append(data);
				}
				System.out.println("Received data : " + receivedData);
				in.close();
				stream.close();
				client.close();
				if(receivedData != null && "EXIT".equals(receivedData.toString())) {
					System.out.println("Stop SocketServer");
					break;
				}
				System.out.println("---------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void startReplyServer() {
		Socket client = null;
		
		try (ServerSocket server = new ServerSocket(9999)){
			while(true) {
				System.out.println("Server:Waiting for request.");
				client = server.accept();
				System.out.println("Server:accept");
				OutputStream outStream = client.getOutputStream();
				OutputStreamWriter outWriter = new OutputStreamWriter(outStream);
				BufferedWriter out = new BufferedWriter(outWriter);
				out.write("ok");
				out.close();
				outWriter.close();
				outStream.close();
				
				System.out.println("---------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
