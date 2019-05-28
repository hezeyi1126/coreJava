package com.my;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private static ServerSocket ss;

	static {
		try {
			ss = new ServerSocket(80);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void start() {
		System.out.println("port 80  success");
		while(true){
			try {
				Socket s = ss.accept();
				if(s != null) {
					new HttpServer(s).start();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
