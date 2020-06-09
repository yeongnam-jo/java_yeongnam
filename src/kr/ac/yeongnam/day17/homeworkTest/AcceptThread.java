package kr.ac.yeongnam.day17.homeworkTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptThread extends Thread {
	
	private ServerSocket socket;
	
	AcceptThread(ServerSocket socket){
		this.socket = socket;
	}
	
	@Override
	public void run() {
		IOThread iot = new IOThread(socket);
		iot.start();
		
	}

}
