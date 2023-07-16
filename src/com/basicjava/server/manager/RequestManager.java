package com.basicjava.server.manager;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.Socket;

import com.basicjava.server.dto.RequestDTO;

public class RequestManager {
	
	public RequestDTO RequestDTO;
	public Socket socket;
	private final int BUFFER_SIZE = 2048;
	
	public RequestManager(Socket socket) {
		this.socket = socket;
	}
	
	public RequestDTO readRequest() {
		RequestDTO = new RequestDTO();
		try{
			// Request Read.
			InputStream request = new BufferedInputStream(socket.getInputStream());
			byte[] bytes = new byte[BUFFER_SIZE];
			request.read(bytes);
			String data = new String(bytes).trim();
			System.out.println("RequestData = \n" + data);
			if(data.contains("today")) {
				RequestDTO.setUri("/today");
			}
			System.out.println("----------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return RequestDTO;
	}
	
	

}
