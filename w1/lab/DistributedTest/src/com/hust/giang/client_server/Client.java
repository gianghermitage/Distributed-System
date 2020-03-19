package com.hust.giang.client_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
        try
        { 
        	Socket socket = new Socket("127.0.0.1", 5000);

			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

			String msgServer,msgClient;
			Scanner scanner = new Scanner(System.in);
		
			msgClient = " ";
			msgServer = in.readLine();
		    System.out.println("Server: " + msgServer);

			while (msgClient != null) {
			    msgClient = scanner.nextLine();
			        System.out.println("Client: " + msgClient);
			        out.println(msgClient);
					msgServer = in.readLine();
				    System.out.println("Server: " + msgServer);
			}
			
	        socket.close();
	        scanner.close();
		} catch (UnknownHostException u) {
            System.out.println(u); 
        } 
        catch(IOException i) 
        { 
            System.out.println(i); 
        } 
        

  
		

	}

}
