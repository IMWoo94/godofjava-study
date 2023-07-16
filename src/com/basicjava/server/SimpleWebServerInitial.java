package com.basicjava.server;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerInitial {

	public static void main(String[] args) {
		SimpleWebServerInitial server = new SimpleWebServerInitial();
		int port = 9000;
		server.start(port);
	}
	
	private final int BUFFER_SIZE = 2048;
	
	public void start(int port) {
		try (ServerSocket server = new ServerSocket(port)){
			while(true) {
				Socket socket = server.accept();
				
				// Request Read.
				InputStream request = new BufferedInputStream(socket.getInputStream());
				byte[] bytes = new byte[BUFFER_SIZE];
				request.read(bytes);
				String data = new String(bytes).trim();
				System.out.println("RequestData = \n" + data);
				System.out.println("----------------");
				
				// make response data and response
				PrintStream response = new PrintStream(socket.getOutputStream());
				response.println("HTTP/1.1 200 OK");
				response.println("Content-type: text/html");
				response.println();
				response.print("It is working");
				response.flush();
				response.close();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
