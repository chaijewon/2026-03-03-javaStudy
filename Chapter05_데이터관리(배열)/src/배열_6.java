// 배열 => 일반 변수 여러개 보다 => 이름 1개를 이용 => 데이터 관리 
// => 순차적으로 인덱스번호를 가지고 있어서 => 반복문 수행 
// => 고정적이다 : 한번 지정하면 변경이 불가능 하다
/*
 *   복사 
 *    = 얕은 복사 
 *    = 깊은 복사 
 *    
 *   ---------------------- 라이브러리 이용 
 */

import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr={100,200,300,400,500};
        int[] copy=arr;
        // Call By Reference : 주소 참조 
        copy[0]=1000;
        System.out.println(arr[0]);
        System.out.println("arr="+arr);
        System.out.println("copy="+copy);
        // 같은 메모리 주소 사용
        int[] copy2=arr.clone(); // 깊은 복사 
        // 값을 복사해서 새로운 메모리 저장 
        System.out.println("copy2="+copy2);
        copy2[0]=5000;
        
        System.out.println("===== arr 값 =====");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("===== copy 값 =====");
        System.out.println(Arrays.toString(copy));
        
        System.out.println("===== copy2 값 =====");
        System.out.println(Arrays.toString(copy2));
	}

}
