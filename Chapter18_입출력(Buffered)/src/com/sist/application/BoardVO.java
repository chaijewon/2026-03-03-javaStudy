package com.sist.application;

import java.io.Serializable;
// 객체 단위로 저장 
import java.util.Date;
// CRUD 
public class BoardVO implements Serializable{
    private int no; // 고유 번호 => 게시물 구분자 : 중복없어야 된다
    private String name; // 글쓴이 
    private String subject; // 제목 
    private String content; // 내용
    private String pwd; // 삭제 , 수정 => 본인 여부 확인 
    private Date regdate; // 등록일 
    private int hit; // 조회수 
}
