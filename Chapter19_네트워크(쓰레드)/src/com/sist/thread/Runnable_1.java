package com.sist.thread;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Runnable_1 extends JFrame
implements Runnable,ActionListener
{
    JProgressBar[] bar=new JProgressBar[5];
    JButton b1,b2;
    public Runnable_1()
    {
    	b1=new JButton("시작");
    	b2=new JButton("종료");
    	
    	Color[] color={Color.yellow,Color.pink,
    			Color.orange,Color.green,Color.cyan};
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(5,1,5,5));
    	for(int i=0;i<5;i++)
    	{
    		bar[i]=new JProgressBar();
    		bar[i].setMaximum(100);
    		bar[i].setMinimum(0);
    		bar[i].setStringPainted(true);
    		bar[i].setBackground(Color.white);
    		bar[i].setForeground(color[i]);
    		p.add(bar[i]);
    	}
    	JPanel p1=new JPanel();
    	p1.add(b1);p1.add(b2);
    	
    	add("Center",p);
    	add("South",p1);
    	setSize(500, 450);
    	setVisible(true);
    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Runnable_1();
	}
    public void go()
    {
    	try
    	{
    		int a=(int)(Math.random()*101);
    		for(int i=0;i<=a;i++)
    		{
    			bar[0].setValue(i);
    			Thread.sleep(50);
    		}
    		int b=(int)(Math.random()*101);
    		for(int i=0;i<=b;i++)
    		{
    			bar[1].setValue(i);
    			Thread.sleep(50);
    		}
    		int c=(int)(Math.random()*101);
    		for(int i=0;i<=c;i++)
    		{
    			bar[2].setValue(i);
    			Thread.sleep(50);
    		}
    		int d=(int)(Math.random()*101);
    		for(int i=0;i<=d;i++)
    		{
    			bar[3].setValue(i);
    			Thread.sleep(50);
    		}
    		int e=(int)(Math.random()*101);
    		for(int i=0;i<=e;i++)
    		{
    			bar[4].setValue(i);
    			Thread.sleep(50);
    		}
    	}catch(Exception ex) {}
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    go();	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			new Thread(this).start();
		}
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
	}

}
