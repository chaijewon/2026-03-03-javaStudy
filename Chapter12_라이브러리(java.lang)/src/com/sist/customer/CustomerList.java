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
    TableColumn column;
    /// 데이터 제어 
    int curpage=1;
    int totalpage=0;
    CustomerDataCollection cdc=new CustomerDataCollection();
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
    	table.setRowHeight(40);
    	table.getTableHeader().setReorderingAllowed(false);
    	// 배치 
    	setLayout(null);
    	la.setFont(new Font("굴림체",Font.BOLD,50));
    	la.setBounds(10, 15, 920, 60);
    	add(la);
    	
    	js.setBounds(10, 90, 920, 500);
    	add(js);
    	
    	JPanel p=new JPanel();
    	p.add(b1);p.add(la1);p.add(b2);
    	
    	p.setBounds(10, 600, 920, 35);
    	add(p);
    	
    	for(int i=0;i<col.length;i++)
    	{
    		column=table.getColumnModel().getColumn(i);
    		if(i==0)
    			column.setPreferredWidth(100);
    		else if(i==1)
    			column.setPreferredWidth(100);
    		else if(i==2)
    			column.setPreferredWidth(400);
    		else if(i==3)
    			column.setPreferredWidth(120);
    		else if(i==4)
    			column.setPreferredWidth(80);
    		
    	}
    	print();
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
    public void print()
    {
    	// 테이블 지우기 
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	
    	CustomerVO[] cust=cdc.customerListData(curpage);
    	totalpage=cdc.customerTotalPage();
    	
    	for(CustomerVO vo:cust)
    	{
    		String[] data= {
    				vo.getLogin_id(),
    				vo.getName(),
    				vo.getEmail(),
    				vo.getLoc(),
    				vo.getGrade()
    		};
    		model.addRow(data);
    	}
    	
    	la1.setText(curpage+" page/ "+totalpage+" pages");
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			if(curpage>1)
			{
				curpage--;
				print();
			}
		}
		else if(e.getSource()==b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				print();
			}
		}
	}

}
