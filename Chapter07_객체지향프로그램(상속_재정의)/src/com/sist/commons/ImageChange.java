package com.sist.commons;
import java.awt.*;
import javax.swing.*;
/*
 *   1. class 멤버변수 사용 
 *      => 기본형 
 *      ----------
 *      => 클래스 
 *      => 배열   => 참조 데이터형 
 *      -------- 데이터형 
 *      
 *   2. class 
 *      = 데이터형의 사용 : 필요한 변수를 모아서 저장 
 *        ~VO / ~DTO / ~Bean  / ~Entity 
 *                     -- JSP   -- JPA
 *             -- MyBatis 
 *        --- Spring (*******) 
 *        캡슐화 : private + getter/setter 
 *      = 메소드만 모아서 저장 : 액션 클래스 
 *        ~DAO / ~Manager / ~Service
 *                          | 웹.윈도우 값 전송  
 *               | 크롤링 
 *        | DB연동 
 *      --------------------------------------
 *       공통으로 사용 => static 
 *      
 */
public class ImageChange {
  // 축소 / 확대 
  // 리턴형 => 클래스 
  public static Image getImage(ImageIcon icon,int w,int h)
  {
	  return icon.getImage().getScaledInstance(w, h, 
			 Image.SCALE_SMOOTH);
  }
}
