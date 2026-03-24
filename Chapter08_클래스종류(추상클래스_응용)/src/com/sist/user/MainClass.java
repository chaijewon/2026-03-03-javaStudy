package com.sist.user;
import com.sist.back.*;
import com.sist.vo.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CommonsMusic cm=new GenieMusic();
        cm.init();
        for(Music m:cm.musics)
        {
        	System.out.println("순위:"+m.getMno());
        	System.out.println("곡명:"+m.getTitle());
        	System.out.println("가수명:"+m.getSinger());
        	System.out.println("앨범:"+m.getAlbum());
        	System.out.println("이미지:"+m.getPoster());
        	System.out.println("상태:"+m.getState());
        	System.out.println("등폭:"+m.getIdcrement());
        	System.out.println("==============================");
        	
        }
	}

}
