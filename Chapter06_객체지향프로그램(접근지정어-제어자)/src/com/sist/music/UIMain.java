package com.sist.music;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class UIMain extends JFrame{
    JTextField tf;
    JButton btn;
    JTable table;
    DefaultTableModel model;
    JComboBox box=new JComboBox();
    GenieMusicSystem gs=new GenieMusicSystem();
    public UIMain()
    {
    	box.addItem("곡명");
    	box.addItem("가수명");
    	tf=new JTextField(20);
    	btn=new JButton("검색");
    	String[] col={"순위","곡명","가수명","앨범"};
    	String[][] row=new String[0][4];
    	model=new DefaultTableModel(row,col);
    	table=new JTable(model);
    	JScrollPane js=new JScrollPane(table);
    	
    	JPanel p=new JPanel();
    	p.add(box);p.add(tf);p.add(btn);
    	add("North",p);
    	add("Center",js);
    	init();
    	setSize(800, 600);
    	setVisible(true);
    }
    public void init()
    {
    	for(int i=model.getRowCount()-1;i>=0;i--)
    		model.removeRow(i);
    	for(Music m:gs.musicList())
    	{
    		String[] data= {
    			String.valueOf(m.getNo()),
    			m.getTitle(),
    			m.getSinger(),
    			m.getAlbum()
    		};
    		model.addRow(data);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new UIMain();
	}

}
