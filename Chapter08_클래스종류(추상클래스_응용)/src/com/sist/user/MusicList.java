package com.sist.user;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

import javax.swing.table.*;
import com.sist.vo.*;
import com.sist.back.*;
import com.sist.commons.ImageChange;
// HTML <table> <label> <hr> <span> <ul> 
public class MusicList extends JPanel{
    JLabel titleLa=new JLabel("지니뮤직 Top 50",JLabel.CENTER);
    JTable table; // 테이블 모양
    DefaultTableModel model; // 테이블 데이터 관리
    JComboBox box=new JComboBox();
    JTextField tf;
    JButton findBtn;
    public MusicList()
    {
    	setLayout(null);// 직접 배치 
    	titleLa.setBounds(10, 15, 980, 60);
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	add(titleLa);
    	
    	box.addItem("제목");
    	box.addItem("가수명");
    	box.addItem("앨범");
    	tf=new JTextField();
    	findBtn=new JButton("검색");
    	
    	box.setBounds(10,80, 80, 30);
    	tf.setBounds(95, 80, 200, 30);
    	findBtn.setBounds(300, 80, 100, 30);
    	add(box);add(tf);add(findBtn);
    	// - ▲ 1  ▼ 5  이미지 
    	String[] col={"순위","등폭","","곡명","가수명"};
    	Object[][] row=new Object[0][5];
    	model=new DefaultTableModel(row,col)
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
    		
    	};
    	table=new JTable(model);
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setRowHeight(40);
    	JScrollPane js=new JScrollPane(table);
    	js.setBounds(10,120 , 980, 600);
    	dataPrint();
    	add(js);
    	
    }
    public void dataPrint()
    {
    	CommonsMusic cm=new GenieMusic();
        cm.init();
        for(Music m:cm.musics)
        {
        	String s="";
        	if(m.getState().equals("유지"))
        	{
        		s="-";
        	}
        	else if(m.getState().equals("상승"))
        	{
        		s="▲ "+m.getIdcrement();
        	}
        	else if(m.getState().equals("하강"))
        	{
        		s="▼ "+m.getIdcrement();
        	}
        	Image img=null;
        	try
        	{
        		URL url=new URL("https:"+m.getPoster());
        		img=ImageChange.getImage(new ImageIcon(url),30,30);
        	}catch(Exception ex) {}
        	Object[] data={
        		m.getMno(),
        		s,
        		new ImageIcon(img),
        		m.getTitle(),
        		m.getSinger()
        	};
        	model.addRow(data);
        }
    }
}
