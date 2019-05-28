package com.my;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class HttpServer extends Thread{
	
	Socket s;
	
	public HttpServer(Socket ss) {
		this.s = ss;
	}
	@Override
	public void run() {
		BufferedReader br = null;
		OutputStream os = null;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream(), "utf-8"));
			os = s.getOutputStream();
			StringBuilder sb = new StringBuilder();
			String str = null;
			while((str = br.readLine()) !=null) {
				sb.append(str).append("\r\n");
				if("".equals(str)) {//读到空字符串  停止读取
					break;
				}
				
			}

			System.out.println(sb.toString());
			sb = null;
			StringBuilder response =new StringBuilder(); 
			response.append("HTTP /1.1 200 ok \r\n");
			response.append("Content-Type:text/html \r\n");
			response.append("\r\n");
//			response.append("Content-Length:"/r/n");
			response.append("hello");
			os.write(response.toString().getBytes());
			os.flush();
			os.close();
			s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
		}
	}
}
