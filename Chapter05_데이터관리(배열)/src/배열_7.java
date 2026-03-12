// 배열은 메모리 주소를 이용하는 프로그램 
// ==> 주소에 있는 데이터가 손상이 될 수 있다 
// ==> 배열 / 클래스 
/*
 *   char[] op={'+','-','*','/'}
 *   
 *   op     100  102  104  106
 *   ---    -------------------
 *   100----> +   -    *    /
 *   ---    -------------------
 *   => 첫번째 값이 있는 주소값 
 *   op[0] ==> 100번지 
 *   op[1] ==> 102번지
 *   op[2] ==> 104  ==> op[3] ==> 106
 *   ==> 배열은 연속적인 메모리 구조를 가지고 있다 => 같은 데이터형만 사용
 */
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10];
        
        // 1. 배열의 저장 갯수 
        System.out.println("생성된 메모리 갯수:"+alpha.length);
        // 2. 배열의 초기값 
        for(int i=0;i<alpha.length;i++)
        {
        	alpha[i]=(char)((int)(Math.random()*26)+65);
        	//       ----4  ---2 ---------------1 --- 3
        	//                    0~25 + 65 ==> 65~90
        	// A~Z
        }
        // 3. 출력 ==> for-each를 사용한다 
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
        
        // 변경 
        alpha[0]='X'; 
        // 한번에 변경 
        int i=0;
        for(char c='A';c<='J';c++)
        {
        	alpha[i]=c;
        	i++;
        }
        System.out.println("변경후...");
        for(char c:alpha)
        {
        	System.out.print(c+" ");
        }
        // 다른 클래스에서 사용 => 자체 변경 / 새로운 메모리
        //                    ----- 대입 -------- clone
        // char[] a=alpha char[] b=alpha.clone()
        // ===> 메소드 매개변수 전송 
        // => 데이터를 모아서 편리하게 관리 => 도구 (구분자=인덱스)
        
        
	}

}
