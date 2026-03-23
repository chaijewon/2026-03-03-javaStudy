package com.sist.manager;
// 데이터 설정 => 캡슐화 
public class Music {
   private int mno;
   private String title;
   private String singer;
   private String album;
   private String state;
   private String poster;
   private int idcrement;
   // 데이터 변경 , 손실 방지 => 은닉화 
   // 필요한 경우에 사용이 가능하게 => 읽기/쓰기 => getter/setter
   // 변수+메소드 => 하나로 묶어서 처리 
   public int getMno() {
	return mno;
   }
   public void setMno(int mno) {
	this.mno = mno;
   }
   public String getTitle() {
	   //String title="";
	   return title; // this.생략
	
   }
   public void setTitle(String title) {
	 this.title = title;
	// 인스턴스 변수 매개변수 => 
	// => 지역변수 , 매개변수 => 없는 경우 인스턴스변수에서 찾는다 
	 // this는 => 지역변수 / 멤버변수의 구분 
   }
   public String getSinger() {
	return singer;
   }
   public void setSinger(String singer) {
	this.singer = singer;
   }
   public String getAlbum() {
	return album;
   }
   public void setAlbum(String album) {
	this.album = album;
   }
   public String getState() {
	return state;
   }
   public void setState(String state) {
	this.state = state;
   }
   public String getPoster() {
	return poster;
   }
   public void setPoster(String poster) {
	this.poster = poster;
   }
   public int getIdcrement() {
	return idcrement;
   }
   public void setIdcrement(int idcrement) {
	this.idcrement = idcrement;
   }
   
}
