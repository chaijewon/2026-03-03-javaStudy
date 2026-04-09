package com.sist.inner;
// => 데이터형 => 메모리에 읽기 / 쓰기 
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/*
 *   [] = List 
 *   {} = 객체 Movie
 *   searchMainDailyBoxOffice.do
 *   searchMainRealTicket.do
 *   searchMainDailySeatTicket.do
 *   [{"startDate":"2026년 04월 08일(수)",
 *   "endDate":"2026년 04월 08일(수)",
 *   "totcnt":99,"watchGradeNm":"15세이상관람가",
 *   "movieCd":"20254121",
 *   "showDt":"20260408",
 *   "fileSaveLoct":"/common/mast/movie/2026/02/",
 *   "orgnFileNm":"[????]1st_po_02.jpg",
 *   "sysFileNm":"0cead0eb683341f5810aecbaa2d0dded.jpg",
 *   "movieNm":"살목지",
 *   "movieNmEn":"Salmokji : Whispering Water",
 *   "openDt":"20260408","totSeatCntRatio":" 29.0",
 *   "totSeatAmtRatio":" 17.6","totSeatCnt":511267,
 *   "rank":1,"repNationCd":"한국",
 *   "movieType":"장편","moviePrdtStat":"개봉",
 *   "genre":"공포(호러),스릴러","thumbUrl":"/common/mast/movie/2026/02/thumb/thn_0cead0eb683341f5810aecbaa2d0dded.jpg","showTm":"95","showTs":"14","prdtYear":"2025","indieYn":null,
 *   "artmovieYn":null,"multmovieYn":null,
 *   "director":"이상민","prNm":"더램프(주)",
 *   "dtNm":"(주)쇼박스","rankInten":36,
 *   "rankOldAndNew":"OLD","rownum":1}
 */
class Movie
{
	private String name;
	private String director;
	private String genre;
	private String grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
class DataCollection
{   
	private static List<Movie> mList=
			      new ArrayList<Movie>();
	static
	{
		// 초기화 
		try
		{
			Document doc=Jsoup.connect("https://www.kobis.or.kr/kobis/business/main/searchMainDailyBoxOffice.do").get();
			//System.out.println(doc.toString());
			String data=doc.toString();
			data=data.substring(data.indexOf("["),
					data.lastIndexOf("]")+1);
			//System.out.println(data);
			JSONParser jp=new JSONParser();
			JSONArray arr=(JSONArray)jp.parse(data);
			//System.out.println(arr.toJSONString());
			// Jackson 
			for(int i=0;i<arr.size();i++)
			{
				//{}
				JSONObject obj=(JSONObject)arr.get(i);
				Movie m=new Movie();
				m.setName((String)obj.get("movieNm"));
				
				m.setDirector((String)obj.get("director"));
				m.setGenre((String)obj.get("genre"));
				m.setGrade((String)obj.get("watchGradeNm"));
				mList.add(m);
			}
		}catch(Exception ex){}
	}
	class DataManager
    {
	   // 기능 수행 
	   public void movieList()
	   {
		   mList.stream()
		        .forEach(m->System.out.println(
		           m.getName()+" "
		           +m.getDirector()+" "
		           +m.getGenre()+" "
		           +m.getGrade()
		        ));
		   
	   }
	   // 영화 정보 
    }
	public void movieList()
	{
		DataManager dm=new DataManager();
		dm.movieList();
	}
}

public class 내부클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         DataCollection dc=
        		 new DataCollection();
         dc.movieList();
	}

}
