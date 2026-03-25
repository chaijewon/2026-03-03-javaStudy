import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface Rand{
	public void rand(int[] com);
}
// 다중 상속 
public class 숫자야구게임 extends JFrame implements ActionListener,Rand{
    // 힌트 
	JTextArea ta=new JTextArea();
	JTextField tf=new JTextField(10);
	JButton start=new JButton("시작");
	JButton end=new JButton("종료");
	/////// 게임에 필요한 변수  
	private int[] com=new int[3];
	private int[] user=new int[3];
	private int s,b; // 0
	// 화면 UI
	public 숫자야구게임()
	{
		JScrollPane js=new JScrollPane(ta);
		JPanel p=new JPanel();
		p.add(tf);p.add(start);p.add(end);
		ta.setEditable(false);//편집 방지 
		tf.setEnabled(false);//비활성화 
		add("Center",js);
		add("South",p);
		setSize(350, 400);
		setVisible(true);
		
		start.addActionListener(this);
		//  ==> this (actionPerformed 어디있는지?)
		end.addActionListener(this);
		tf.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new 숫자야구게임();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==end)
		{
			JOptionPane.showMessageDialog(this, "프로그램 종료!!");
			System.exit(0); //0 정상 종료 
		}
		else if(e.getSource()==start)
		{
			JOptionPane.showMessageDialog(this, "야구게임을 시작합니다!!");
			// 난수 발생 
			rand(com);// Call By Reference
			// 객체 / 배열 => 주소값 => 자체에 처리 요청 
			tf.setEnabled(true);
			tf.requestFocus();
			start.setEnabled(false);
		}
		else if(e.getSource()==tf)
		{
			// 입력값 읽기 
			String strInput=tf.getText();
			int input=0;
			try
			{
				input=Integer.parseInt(strInput);
				// 문자열을 정수형으로 변경
			}catch(NumberFormatException ex)
			{
				// 복구
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다");
				// this => 어느 윈도우 위에 보여 줄지?
				tf.setText("");
				tf.requestFocus();
				return;// 메소드는 return이 있는 곳에서 종료
			}
			// 정상적 입력이 된 상태 
			if(input<99 || input>999)
			{
				JOptionPane.showMessageDialog(this, 
						  "세자리 정수만 입력해야 됩니다");
				tf.setText("");
				tf.requestFocus();
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 중복된 수는 사용(X)
			if(user[0]==user[1] || 
					user[1]==user[2]|| user[0]==user[2])
			{
				JOptionPane.showMessageDialog(this, 
						  "중복된 수는 사용할 수 없습니다");
				tf.setText("");
				tf.requestFocus();
			}
			
			// 0을 입력하면 안된다 
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				JOptionPane.showMessageDialog(this, 
						  "0은 사용할 수 없습니다");
				tf.setText("");
				tf.requestFocus();
			}
			
			// 비교 
			s=0;
			b=0;
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					if(com[i]==user[j]) // 같은 수가 있는지
					{
						if(i==j) // 같은 자리에 있는지 
							s++;
						else
							b++;
					}
				}
			}
			// 힌트 
			String hit=String.
			  format("Input Number:%d,Result:%dS-%dB\n",
					input,s,b);
			ta.append(hit);
			
			// 종료
			if(s==3)
			{
				JOptionPane.showMessageDialog(this, 
						"Game Over!!");
				System.exit(0);
			}
			tf.setText("");
			tf.requestFocus();
		}
	}
	@Override
	public void rand(int[] com) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1;//1~9
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
	}

}
