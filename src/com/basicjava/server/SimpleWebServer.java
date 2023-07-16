package com.basicjava.server;

import java.net.ServerSocket;
import java.net.Socket;

import com.basicjava.server.handler.RequestHandler;

public class SimpleWebServer {

	public static void main(String[] args) {
		SimpleWebServer server = new SimpleWebServer();
		server.run();

	}
	
	public void run() {
		try {
			ServerSocket server = new ServerSocket(9000);
			while(true) {
				Socket socket = server.accept();
				
				RequestHandler handler = new RequestHandler(socket);
				handler.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
