public class 제어문_다중조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor=(int)(Math.random()*50)+51; //0~100
        //            0.0 ~ 0.99 * 102  ==> 0.0 ~ 100.98 => 0~100
        int eng=(int)(Math.random()*50)+51;
        int math=(int)(Math.random()*50)+51;
        
        System.out.println("국어 점수:"+kor);
        System.out.println("영어 점수:"+eng);
        System.out.println("수학 점수:"+math);
        
        // 총점
        int total=kor+eng+math;
        // 평균
        int avg=total/3;
        // 학점  >=97 A+ 94>= A0  A-
        
        char score='A';
        char op='+'; // ''
        
        if(avg>=90)
        {
        	score='A';
        	if(avg>=97) op='+';
        	else if(avg>=94) op='0';
        	else op='-';
        }
        else if(avg>=80)
        {
        	score='B';
        	if(avg>=87) op='+';
        	else if(avg>=84) op='0';
        	else op='-';
        }
        else if(avg>=70)
        {
        	score='C';
        	if(avg>=77) op='+';
        	else if(avg>=74) op='0';
        	else op='-';
        }
        else if(avg>=60)
        {
        	score='D';
        	if(avg>=67) op='+';
        	else if(avg>=64) op='0';
        	else op='-';
        }
        else
        {
        	score='F';
        	op=' ';
        }
        
        System.out.println("======= 결과 =======");
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        System.out.println("학점:"+score+op);
        
        if(false)
        {
        	System.out.println("Hello");
        }
        
	}

}
