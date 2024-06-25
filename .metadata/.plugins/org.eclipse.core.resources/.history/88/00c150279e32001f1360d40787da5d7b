package thread4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	
	public static void main(String[] args) {
		Socket sock = null;
		
		try {
			sock = new Socket("192.168.0.244", 9999);
			System.out.println(sock + " : connected");
			
			OutputStream toServer = sock.getOutputStream();
			
			ServerHandler chandler = new ServerHandler(sock);
			chandler.start();
			
			byte[] buffer = new byte[1024];
			int count;
			
			while((count = System.in.read(buffer)) != -1) {
				toServer.write(buffer, 0, count);
				toServer.flush();
			}
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
