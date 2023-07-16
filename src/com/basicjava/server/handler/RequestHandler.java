package com.basicjava.server.handler;

import java.net.Socket;

import com.basicjava.server.dto.RequestDTO;
import com.basicjava.server.manager.RequestManager;
import com.basicjava.server.manager.ResponseManager;

public class RequestHandler extends Thread {
	
	public Socket socket;
	
	@Override
	public void run() {
		RequestManager request = new RequestManager(socket);
		RequestDTO RequestDTO = request.readRequest();
		
		ResponseManager response = new ResponseManager(socket, RequestDTO);
		response.writeResponse();
	
	}
	
	public RequestHandler(Socket socket) {
		this.socket = socket;
	}
}
