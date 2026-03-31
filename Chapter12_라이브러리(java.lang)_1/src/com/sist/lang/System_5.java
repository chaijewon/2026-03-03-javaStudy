package com.sist.lang;
/*
 *   운영체제 + 자바 => getProperty(key)
 *   --------------------------------
 *   종료 : exit(0)
 *   가비지컬렉션 : gc()
 *   걸린 시간 측정 : currentTimeMillis()
 *   출력 / 입력 : System.out/System.in
 */
// 520page
public class System_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String osName=System.getProperty("os.name");
        System.out.println(osName);
        String userName=System.getProperty("user.name");
        System.out.println(userName);
        String userHome=System.getProperty("user.home");
        System.out.println(userHome);
        // 버전 호환 
        String javaHome=System.getProperty("java.version");
        System.out.println(javaHome);
        // 시스템 환경 정보 
	}

}
