package com.sist.commons;
// 프로토콜 : 약속 => 구분자 => 웹 (파일) => 내부 프로토콜
/*
 *   => 0~65535 
 *      FTP : 22 , SMTP : 25 , Telnet : 23 
 *      ... 8080 : 프록시 ... 4000 : 머드 서버 ...
 *      80 : http
 *       
 */
public class Function {
   public static final int LOGIN=100;
   public static final int MYLOG=110;
   public static final int CHAT=200;
   public static final int EXIT=300;
}
