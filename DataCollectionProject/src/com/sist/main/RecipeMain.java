package com.sist.main;
import java.util.*;

import org.json.simple.parser.JSONParser;
import org.json.simple.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.sist.dao.*;
public class RecipeMain {

	public void recipeAllData()
	{
	     
	     int k=1;
	     RecipeDAO dao=RecipeDAO.newInstance();
	     try
	     {
	    	 for(int i=1;i<=6859;i++)
	    	 {
	    		 Document doc=Jsoup.connect("http://www.10000recipe.com/recipe/list.html?order=accuracy&page="+i).get();
	    		 Elements title=doc.select("div.common_sp_caption div.common_sp_caption_tit");
	    		 Elements poster=doc.select("img[src*=/recipe/]");
	    		 Elements chef=doc.select("div.common_sp_caption_rv_name");
	    		 Elements link=doc.select("div.common_sp_thumb a.common_sp_link");
	    		 
	    		 for(int j=0;j<title.size();j++)
	    		 {
	    			try
	    			{
		    			 RecipeVO vo=new RecipeVO();
		    			 vo.setTitle(title.get(j).text());
		    			 vo.setPoster(poster.get(j).attr("src"));
		    			 vo.setChef(chef.get(j).text());
		    			 vo.setLink(link.get(j).attr("href"));
		    			 System.out.println("번호:"+k);
		    			 System.out.println("Title:"+vo.getTitle());
		    			 System.out.println("Chef:"+vo.getChef());
		    			 System.out.println("Poster:"+vo.getPoster());
		    			 System.out.println("Link:"+vo.getLink());
		    			 System.out.println("k="+k);
		    			 dao.recipeInsert(vo);
		    			 k++;
		    			 
		    			 
	    			}catch(Exception e) {e.printStackTrace();}
	    		 }
	    	 }
	    	 System.out.println("End...");
	     }catch(Exception ex){ex.printStackTrace();}
	    
	}
	public ArrayList<ChefVO> chefAllData()
	{
		ArrayList<ChefVO> list=new ArrayList<ChefVO>();
		RecipeDAO dao=RecipeDAO.newInstance();
		try
		{
			int k=1;
			for(int i=1;i<=53;i++)
			{
				// https://www.10000recipe.com/chef/chef_list.html?order=chef_no_follower&term=all&page=2
				Document doc=Jsoup.connect("http://www.10000recipe.com/chef/chef_list.html?order=chef_no_follower&term=all&page="+i).get();
				Elements poster=doc.select("div.list_mem3 a.mem_pic img");
				Elements chef=doc.select("div.list_cont4 a");
				Elements mem_cont1=doc.select("span.mem_cont1");
				Elements mem_cont3=doc.select("span.mem_cont3");
				Elements mem_cont7=doc.select("span.mem_cont7");
				Elements mem_cont2=doc.select("span.mem_cont2");
				
				for(int j=0;j<poster.size();j++)
				{
					try
					{
						ChefVO vo=new ChefVO();
						vo.setPoster(poster.get(j).attr("src"));
						vo.setChef(chef.get(j).text());
						vo.setMem_cont1(mem_cont1.get(j).text());
						vo.setMem_cont3(mem_cont3.get(j).text());
						vo.setMem_cont7(mem_cont7.get(j).text());
						vo.setMem_cont2(mem_cont2.get(j).text());
						System.out.println("Poster:"+vo.getPoster());
						System.out.println("Chef:"+vo.getChef());
						System.out.println("Mem-cont1:"+vo.getMem_cont1());
						System.out.println("Mem-cont3:"+vo.getMem_cont3());
						System.out.println("Mem-cont7:"+vo.getMem_cont7());
						System.out.println("Mem-cont2:"+vo.getMem_cont2());
						System.out.println("k="+k);
						System.out.println("---------------------------------------------------------");
						dao.chefInsert(vo);
					    k++;
					}catch(Exception ex){}
					//list.add(vo);
				}
			}
		}catch(Exception ex){ex.printStackTrace();}
		return list;
		// https://try.jsoup.org/
	}
	public RecipeDetailVO recipeDetailData(String url,int no)
    {
		
    	RecipeDetailVO vo=new RecipeDetailVO();
    	// http://www.10000recipe.com/recipe/6907454
    	//RecipeDAO dao=RecipeDAO.newInstance();
    	int k=1;
    	try
    	{
    		System.out.println("http://www.10000recipe.com"+url);
    		Document doc=Jsoup.connect("http://www.10000recipe.com"+url).get();
    		Element poster=doc.selectFirst("div.centeredcrop img");
    		Element title=doc.selectFirst("div.st3 h3");
    		Element chef=doc.selectFirst("span.user_info2_name");
    		Element chef_poster=
    			doc.selectFirst("div.user_info2 a.user_info2_pic img");
    		try
    		{
    		  String chef_profile=doc.select("div.view_profile div.profile_cont p.cont_name + p").text();
    		  vo.setChef_profile(chef_profile);
    		  
    		}catch(Exception ex) {vo.setChef_profile("없음");}
    		Element content=doc.selectFirst("div.view2_summary_in");
    		Element info1=doc.selectFirst("span.view2_summary_info1");
    		Element info2=doc.selectFirst("span.view2_summary_info2");
    		Element info3=doc.selectFirst("span.view2_summary_info3");
    		Elements foodmake=doc.select("div.view_step_cont");
    		Elements foodimg=doc.select("div[id*=stepimg] img[src*=/recipe/]");
    		String food="";
    		for(int i=0;i<foodmake.size();i++)
    		{
    			food+=(i+1)+"."+foodmake.get(i).text()+"^"+foodimg.get(i).attr("src")+"\n";
    		}
    		
    		vo.setPoster(poster.attr("src"));
    		vo.setTitle(title.text());
    		vo.setChef(chef.text());
    		vo.setChef_poster(chef_poster.attr("src"));
    		vo.setContent(content.text());
    		vo.setInfo1(info1.text());
    		vo.setInfo2(info2.text());
    		vo.setInfo3(info3.text());
    		vo.setFoodmake(food);
    		System.out.println("Poster:"+vo.getPoster());
    		System.out.println("제목:"+vo.getTitle());
    		System.out.println("쉐프:"+vo.getChef());
    		System.out.println("Chef:Poster:"+vo.getChef_poster());
    		System.out.println("Chef:Profile:"+vo.getChef_profile());
    		System.out.println("내용:"+vo.getContent());
    		System.out.println("조리법:"+vo.getFoodmake());
    		System.out.println("정보1:"+vo.getInfo1());
    		System.out.println("정보2:"+vo.getInfo2());
    		System.out.println("정보3:"+vo.getInfo3());
    		
    		
    		System.out.println("k="+k);
    		k++;
    	}catch(Exception ex){}
    	return vo;
    }
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		RecipeMain rm=new RecipeMain();
		//rm.recipeAllData();
		RecipeDAO dao=RecipeDAO.newInstance();
		//rm.chefAllData();
		//rm.recipeAllData();
		List<RecipeVO> list=dao.recipeListData();
		for(RecipeVO vo:list)
		{
			System.out.println(vo.getLink()+":"+vo.getNo());
			RecipeDetailVO rvo=rm.recipeDetailData(vo.getLink(), vo.getNo());
			//dao.recipeDetailInsert(rvo);
		}
		
		//rm.recipeDetailData("/recipe/6940325", 1);
	}
	

}
