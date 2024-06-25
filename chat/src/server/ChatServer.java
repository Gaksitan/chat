package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{
	
	private Socket sock;
	private static ArrayList<Socket> clients = new ArrayList<>();
	
	public ChatServer(Socket socket) {
		this.sock = socket;
	}
	
	@Override
	public void run() {
		
		InputStream fromClient = null;
		OutputStream toClient = null;
		
		try {
			System.out.println(sock + " : connected");
			fromClient = sock.getInputStream();
			
			byte[] buffer = new byte[1024];
			int count;
			
			while((count = fromClient.read(buffer)) != -1) {
				for(Socket s : clients) {
					if(sock != s) {
						System.out.println(sock + " vs " + s);
						toClient = s.getOutputStream();
						toClient.write(buffer, 0, count);
						toClient.flush();
					}
				}
				System.out.write(buffer, 0, count);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sock != null) {
					sock.close();
					remove(sock);
				}else {
					
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void remove(Socket socket) {
		for(Socket s : ChatServer.clients) {
			if(socket == s) {
				ChatServer.clients.remove(socket);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(9999)){
			System.out.println(serverSocket + " : 서버소켓 생성");
			
			while(true) {
				Socket client = serverSocket.accept();
				clients.add(client);
				
				ChatServer myServer = new ChatServer(client);
				myServer.start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
