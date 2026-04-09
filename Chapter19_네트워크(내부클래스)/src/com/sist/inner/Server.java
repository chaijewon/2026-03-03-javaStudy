package com.sist.inner;

import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
    private ServerSocket ss;
    
    public Server()
    {
    	try
    	{
    	   ss=new ServerSocket(3355);
    	   System.out.println("서버 구동!!");
    	}catch(Exception ex) {System.out.println(ex.getMessage());}
    }
    public void run()
    {
    	try
    	{
    		while(true)
    		{
    			Socket s=ss.accept();
    		}
    	}catch(Exception ex) {}
    }
    class Client extends Thread
    {
    	// 통신 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server s=new Server();
        new Thread(s).start();
	}

}
