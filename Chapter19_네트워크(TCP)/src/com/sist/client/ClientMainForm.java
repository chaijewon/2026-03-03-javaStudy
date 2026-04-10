package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class ClientMainForm extends JFrame{
    JTextArea ta;
    JTextField tf;
    JTable table;
    DefaultTableModel model;
    JButton b1,b2,b3;
    LoginForm login=new LoginForm();
    public ClientMainForm()
    {
    	ta=new JTextArea();
    	JScrollPane js1=new JScrollPane(ta);
    	ta.setEditable(false);
    	
    	tf=new JTextField();
    	b1=new JButton("쪽지보내기");
    	b2=new JButton("정보 보기");
    	b3=new JButton("나가기");
    	
    	String[] col={"아이디","이름","성별"};
    	String[][] row=new String[0][3];
    	// 한번만 사용 (재사용은 할 수 없다)
    	model=new DefaultTableModel(row,col)
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    	   	
    	}; // 익명의 클래스 : 윈도우 / 빅데이터 
    	table=new JTable(model);
    	JScrollPane js2=new JScrollPane(table);
    	
    	////// 배치 
    	setLayout(null);
    	js1.setBounds(10, 15, 500, 450);
    	tf.setBounds(10, 470, 500, 30);
    	
    	js2.setBounds(515, 15, 250, 300);
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(3, 1,5,5));
    	p.add(b1);p.add(b2);p.add(b3);
    	p.setBounds(515, 320, 250, 130);
    	
    	// 윈도우 추가
    	add(js1);
    	add(tf);
    	add(js2);
    	add(p);
    	
    	setSize(790, 550);
    	//setVisible(true);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
        new ClientMainForm();
	}

}
