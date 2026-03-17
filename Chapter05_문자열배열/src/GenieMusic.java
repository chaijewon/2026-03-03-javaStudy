// 데이터 수집 

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic {
   // 1기능 
   // 목록 읽기 => 노래명 
   // 가수 읽기 
   // 앨범 읽기 
   static String[] getTitle() throws Exception
   {
	   String[] title=new String[200];
	   int index=0;
	   for(int i=1;i<=4;i++)
	   {
		   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=14&rtm=Y&pg="+i).get();
		   Elements t=doc.select("table.list-wrap a.title");
		   for(int j=0;j<t.size();j++)
		   {
			   String s=t.get(j).text();
			   title[index]=s;
			   index++;
		   }
		   
	   }
	   return title;
   }
}
