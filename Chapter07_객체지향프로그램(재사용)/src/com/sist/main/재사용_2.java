package com.sist.main;
class 사람
{
	String 이름;
	String 주소;
	String 나이;
	String 전화;
	// 반드시 중복되는 변수/메소드 => 공통점 저장 => 반복 제거 
}
class 교직원 extends 사람{
	int 사번;
	
	String 입사일;
	String 부서;
}
class 학생 extends 사람{
	int 학번;
	
	String 학년;
	String 학과;
}
class 교수 extends 사람{
	int 교번;
	
	String 입사일;
	String 담당학과;
}
public class 재사용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
