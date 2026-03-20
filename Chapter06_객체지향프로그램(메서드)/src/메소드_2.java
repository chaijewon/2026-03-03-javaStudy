// 매개변수 
// 전송 ===> 전송법 
// Call by Value / Call by Reference
//    복사본             원본 
//    => 일반         => 가끔 
/*
 *    int[] arr={1,2}
 *    int[] copy=arr;
 *    int[] copy=arr.clone() 
 *    
 *         
 */
class Value
{
	int a;
	int b;
}
// 같은 메모리 주소를 이용하면 => 값을 같이 제어 
// ------------ 배열 / 클래스 (String=>Call By Value)
// CallByValue ==> 값을 전송하면 메소드에서 새로운 메모리를 만들어서 
// 값을 저장후 제어 
class CallByValue
{
	void swap(int a, int b)
	{
		System.out.println("변경전:a="+a+",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경후:a="+a+",b="+b);
	}
	void swap2(String s1,String s2)
	{
		System.out.println("변경전:s1="+s1+",s2="+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("변경후:s1="+s1+",s2="+s2);
	}
}
class CallByReference
{
	void swap(int[] arr)
	{
		System.out.println("수행전 arr[0]="
	             +arr[0]+",arr[1]="+arr[1]);
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		System.out.println("수행후 arr[0]="
	             +arr[0]+",arr[1]="+arr[1]);
	}
	void swap2(Value v)
	{
		System.out.println("swap2:v="+v);
		System.out.println("수행전 v.a="
	             +v.a+",v.b="+v.b);
		int temp=v.a;
		v.a=v.b;
		v.b=temp;
		System.out.println("수행후 v.a="
	             +v.a+",v.b="+v.b);
	}
	
	/*
	 *    int[] rand(int[] arr)
	 *    {
	 *       변경 
	 *       return arr;
	 *    }
	 *    
	 *    void rand(int[] arr)
	 *    {
	 *       변경 
	 *    }
	 */
}
class Test
{
	int a=10;
	void display() {
		System.out.println("Test:display Call...");
		System.out.println("a="+a);
		a++;
	}
}
public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CallByValue call=new CallByValue();
        int a=10;
        int b=20;
        call.swap(a, b);
        System.out.println("수행후 원본:a="+a+",b="+b);
        // 모든 클래스와 배열 ==> Call By Reference 
        // String => Call By Value수행 
        String s1="홍길동";
        String s2="심청이";
        call.swap2(s1, s2);
        System.out.println("수행후 원본:s1="+s1+",s2="+s2);
        
        CallByReference cr=new CallByReference();
        int[] arr={10,20};
        cr.swap(arr);
        System.out.println("수행후 원본:arr[0]="
	             +arr[0]+",arr[1]="+arr[1]); 
        
        int[] data={10,20};
        int[] copy=data;
        System.out.println("copy="+copy);
        System.out.println("data="+data);
        copy[0]=100;
        System.out.println("data[0]="+data[0]);
        
        int[] copy2=data.clone();
        System.out.println("copy2="+copy2);//[100,20]
        System.out.println("data="+data);
        copy2[0]=1000;
        System.out.println("data[0]="+data[0]);
        
        Value v=new Value();
        System.out.println("main:v="+v);
        v.a=100;
        v.b=200;
        cr.swap2(v);
        System.out.println("수행후 원본 v.a="
	             +v.a+",v.b="+v.b);
        
        // 호출만 한다면 
        /*
         *  Test t=new Test()
         *  t.display()
         */
        new Test().display(); // 한번 사용
        new Test().display();
        new Test().display();
        
        Test t=new Test();// 연속해서 사용 => 객체 주소 저장
        t.display();
        t.display();
        t.display();
        
        // 생성자는 반드시 => new 동반 
        String s="Hello";
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println("Hello".length());
        
	}

}
