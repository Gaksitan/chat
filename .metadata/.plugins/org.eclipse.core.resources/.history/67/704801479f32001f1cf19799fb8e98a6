package client;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerHandler extends Thread{
	
	Socket sock = null;
	
	public ServerHandler(Socket socket) {
		this.sock = socket;
	}
	
	@Override
	public void run() {
		InputStream fromServer = null;
		try {
			fromServer = sock.getInputStream();
			byte[] buffer = new byte[1024];
			int count;
			
			while((count = fromServer.read(buffer)) != -1) {
				System.out.println(count);
				System.out.write(buffer, 0, count);
			}
		}catch (IOException e) {
			System.out.println("connection closed!! (" + e + ")");
		}finally {
			try {
				if(fromServer != null) {
					fromServer.close();
				}
				if(sock != null) {
					sock.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
}
