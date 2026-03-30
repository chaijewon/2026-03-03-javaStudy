package com.sist.customer;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
/*
 *   vo.getCustomer_id()+" "
			 +vo.getLogin_id()+" "
			 +vo.getName()+" "
			 +vo.getEmail()+" "
			 +vo.getPhone()+" "
			 +vo.getLoc()+" "
			 +vo.getGrade()
 */
public class CustomerList extends JPanel 
implements ActionListener
{
    JLabel la,la1;
    JTable table;
    DefaultTableModel model;
    JButton b1,b2;
    
    public CustomerList()
    {
    	la=new JLabel("사원 목록",JLabel.CENTER);
    	la1=new JLabel("0 page / 0 pages",JLabel.CENTER);
    	b1=new JButton("이전");
    	b2=new JButton("다음");
    	String[] col={"아이디","이름","이메일","지역","등급"};
    	String[][] row=new String[0][5];
    	// 9장 => 내부클래스 => 오버라이딩 
    	// 공통사용되는 메소드 , 변수 
    	// Thread / 네트워크 => 서버 (웹서버) 
    	model=new DefaultTableModel(row,col) {
            // 편집 방지
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		// 익명의 클래스 => 상속없이 오버라이딩이 가능 
    		// 생성자안에서 처리 => 오버라이딩+추가 
    	};
    	
    	table=new JTable(model);
    	JScrollPane js=new JScrollPane(table);
    	
    	// 배치 
    	setLayout(null);
    	la.setFont(new Font("굴림체",Font.BOLD,50));
    	la.setBounds(10, 15, 920, 60);
    	add(la);
    	
    	
    	
    	
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
