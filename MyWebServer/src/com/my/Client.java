package com.my;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	
	
	public Socket connect(String ip , int port) {
		try {
			return new Socket(ip, port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		Client clt = new Client();
		Socket s = clt.connect("127.0.0.1", 80);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(), "utf-8"));
		if(s.isConnected()) {
			bw.write("adass");
			bw.flush();
		}
		s.close();
		
		
	
		
	}
}
