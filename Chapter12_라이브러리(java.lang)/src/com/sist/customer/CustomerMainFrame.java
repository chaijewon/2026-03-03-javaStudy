package com.sist.customer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CustomerMainFrame extends JFrame
implements ActionListener
{
    Login login=new Login();
    CustomerDataCollection cdc=new CustomerDataCollection();
	public CustomerMainFrame()
	{
		setSize(950, 700);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex) {}
		new CustomerMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			JOptionPane.showMessageDialog(this, "프로그램을 종료합니다!!");
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			// 로그인 버튼 클릭 
			String id=login.tf.getText();
			// trim() : 좌우의 공백을 제거 
			// length() : 문자의 갯수 
			if(id.trim().length()<1) // 입력이 안되었다면 
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf.requestFocus();
				return; // 메소드 종료 => 처음부터 다시 입력 요청 
			}
			
			String pwd=String.valueOf(login.pf.getPassword());
			// char[] => 문자열로 변환 => valueOf()
			//String pwd=login.pf.getPassword().toString();
			if(pwd.trim().length()<1) // 입력이 안되었다면 
			{
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
				login.pf.requestFocus();
				return; // 메소드 종료 => 처음부터 다시 입력 요청 
			}
			
			// 로그인 처리 
			String res=cdc.isLogin(id, pwd);
			if(res.equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(res.equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				
				login.pf.setText("");
				login.pf.requestFocus();
			}
			else
			{
				login.setVisible(false);
				// OK|홍길동
				String name=res.substring(res.indexOf("|")+1);
				setTitle(name+"님 로그인되었습니다");
				setVisible(true);
			}
			/*
			 *   1. equals 
			 *   2. split 
			 *   3. substring
			 *   4. trim
			 *   5. length 
			 *   6. indexOf 
			 *   7. valueOf 
			 *   ----------------
			 *   검색 
			 *   contains / startsWith / toUpperCase 
			 *   => compare 
			 */
		}
	}

}
