package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   </th>
                            <th scope="col" class="hd-number">순위</th>
                            <th scope="col" class="hd-album"><span class="hide">앨범이미지</span></th>
                            <th scope="col" class="hd-link"><span class="hide">곡정보 이동 링크</span></th>
                            <th scope="col" class="hd-info">곡정보</th>
                            <th scope="col" class="hd-btns">듣기</th>
                            <th scope="col" class="hd-btns">추가</th>
                            <th scope="col" class="hd-btns">담기</th>
                            <th scope="col" class="hd-btns">다운</th>
                            <th scope="col" class="hd-btns">뮤비</th>
                            <th scope="col" class="hd-more">더보기</th>
                        </tr>
                        </thead>

                        <tbody>
                        
                            <tr class="list" songid="113791695">
                                <td class="check"><input type="checkbox" class="select-check" title="BANG BANG"></td>
                                <td class="number">1
                                        
                                    <span class="rank">
                                        
                                            
                                            
                                                <span class="rank"><span class="rank-none"><span class="hide">유지</span></span></span>
                                            
                                            
                                            
                                        
                                    </span>
                                </td>
                                <td><a href="#" class="cover" onclick="fnViewAlbumLayer('87233225');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/087/233/225/87233225_1771579384466_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="REVIVE＋"></a></td>
                                <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('113791695');return false;">곡 제목 정보 페이지</a></td>
                                <td class="info">
                                    
                                    
                                    <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('113791695','1');return false;">
                                        
                                            
                                        
                                        
                                        
                                        
                                            
                                                BANG BANG</a>

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('81271496');return false;">IVE (아이브)</a>
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('87233225');return false;">REVIVE＋</a>
 */
// 사용자 요청 => 기능 => 메소드
public class GenieMusicSystem {
   // 공개 =>  공유 
   public static Music[] music=new Music[50];
   // 초기화 => 객체 생성없이 초기화 
   static  // 자동으로 호출 => 상속 예외 
   {
	   try
	   {
		   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		   Elements title=doc.select("table.list-wrap a.title");
		   Elements singer=doc.select("table.list-wrap a.artist");
		   Elements album=doc.select("table.list-wrap a.albumtitle");
		   //System.out.println(title);
		   Elements etc=doc.select("table.list-wrap span.rank");
		   
		   for(int i=0;i<title.size();i++)
		   {
			   System.out.println(i+1);
			   System.out.println(title.get(i).text());
			   System.out.println(singer.get(i).text());
			   System.out.println(album.get(i).text());
			   //System.out.println(etc.get(i).text());
			   String temp=etc.get(i).text();
			   String state="";
			   String id="";
			   if(temp.equals("유지"))
			   {
				   state="유지";
				   id="0";
			   }
			   else
			   {
				   state=temp.replaceAll("[^가-힣]", "");
				   id=temp.replaceAll("[^0-9]", "");
			   }
			   System.out.println("상태:"+state);
			   System.out.println("등폭:"+id);
			   System.out.println("============================");
		   }
	   }catch(Exception ex){}
   }
   
   // 기능 메소드  
   // 1. 목록 출력 
   // 2. 상세보기 
   // 3. 검색 => 가수,곡명 
   // 4. 동영상 
}
