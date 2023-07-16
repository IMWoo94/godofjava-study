package com.basicjava.server.manager;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;

import com.basicjava.server.dto.RequestDTO;

public class ResponseManager {
	public RequestDTO RequestDTO;
	public Socket socket;
	
	public ResponseManager(Socket socket, RequestDTO RequestDTO) {
		this.socket = socket;
		this.RequestDTO = RequestDTO;
	}
	
	public void writeResponse() {
		try {
			// make response data and response
			PrintStream response = new PrintStream(socket.getOutputStream());
			response.println("HTTP/1.1 200 OK");
			response.println("Content-type: text/html");
			response.println();
			if(RequestDTO.getUri().equals("/today")) {
				response.print(new Date());
			}else {
				response.print("It is working");
			}
			response.flush();
			response.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
