package com.sist.lang;
// 수학연산과 관련된 클래스 
// Math => ceil() , random() , round()
//                             반올림 
//                  double => 0.0~0.99
//         올림  => 총페이지
// 오라클에도 존재 => SELECT CEIL(COUNT(*)/10) FROM emp
// Math => only static => 
// 라이브러리 => 메소드 (기능) 
// => 원형 / 예외처리 
// => 리턴형 메소드명(매개변수) => 예외처리여부 
// double random()  => Math.random()
public class Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names= {
        	"aaa","bbb","ccc","ddd",
        	"eee","fff","iii","jjj",
        	"kkk","mmm","nnn","ppp",
        	"www","xxx","yyy"
        };
        // 5개씩 나눠서 출력 => 총페이지 
        System.out.println((int)Math.ceil(names.length/5.0));
        // 원형 => double ceil(double a)
        
        int rand=(int)(Math.random()*100); //0~99
        System.out.println(rand);
        
        double d=Math.round(10.5);// 반올림 
        System.out.println(d);
	}

}
