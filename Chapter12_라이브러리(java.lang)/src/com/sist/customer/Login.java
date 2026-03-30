package com.sist.customer;
import java.awt.*;
import javax.swing.*;
/*
 *     윈도우 
 *       ***= JFrame : 일반 윈도우 
 *       = JWindow 
 *       ***= JPanel => 단독으로 사용할 수 없다 
 *       = JDialog : JFrame위에 다른 윈도우 
 *     컴포넌트 
 *       = 버튼 종류 
 *         JButton 
 *         JCheckBox , JRadioButton 
 *         JMenu 
 *       = 입력 종류 
 *         JTextField => 한줄 입력 / ID,이름 , 검색어 
 *         JTextArea => 여러줄 입력
 *         JPasswordField => 암호화 
 *       = 목록 종류 
 *         **JTable / JTree / JList 
 *       = 기타 
 *         JLabel =>  이미지 / 입력 내용 ...
 *         
 */
public class Login extends JFrame{
    JLabel la1,la2;
    JTextField tf; // 일반 문자열 
    JPasswordField pf; // 비밀번호 입력 
    JButton b1,b2; // b1:로그인 , b2:취소
    
    // 시작 => UI => 생성자 
    public Login()
    {
    	// 레이아웃 => 화면 배치 
    	setLayout(null); // 사용자 정의 => 직접 배치 
    	la1=new JLabel("아이디");
    	la2=new JLabel("비밀번호");
    	
    	tf=new JTextField();
    	pf=new JPasswordField();
    	
    	b1=new JButton("로그인");
    	b2=new JButton("취소");
    	
    	// 배치
    	la1.setBounds(10, 15, 80, 30);
    	tf.setBounds(95, 15, 150, 30);
    	
    	la2.setBounds(10, 50, 80, 30);
    	pf.setBounds(95, 50, 150, 30);
    	
    	add(la1);add(tf);
    	add(la2);add(pf);
    	
    	JPanel p=new JPanel();
    	p.add(b1);p.add(b2);
    	p.setBounds(10, 90, 235, 35);
    	add(p);
    	
    	setBounds(400,270,265, 175);
    	setVisible(true);
    }
    
}
