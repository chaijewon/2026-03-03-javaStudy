// 다중 조건문 가요POPOST트롯JAZZCLASSIC
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 제어문_다중조건문_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("메뉴 선택(가요(1) POP(2) OST(3) 트롯(4) JAZZ(5) CLASSIC(6)):");
        int menu=scan.nextInt();
        String baseurl="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260305&genrecode=";
        String url="";
        if(menu==1) url="M0100";
        else if(menu==2) url="M0200";
        else if(menu==3) url="M0300";
        else if(menu==4) url="M0107";
        else if(menu==5) url="M0500";
        else if(menu==6) url="M0600";
        else System.out.println("없는 메뉴입니다!!");
        
        System.out.println(baseurl+url);
        
        Document doc=Jsoup.connect(baseurl+url).get();
        //System.out.println(doc.toString());
        // list-wrap title
        Elements title=doc.select("table.list-wrap a.title");
        for(int i=0;i<title.size();i++)
        {
        	System.out.println((i+1)+"."+title.get(i).text());
        }
	}

}
