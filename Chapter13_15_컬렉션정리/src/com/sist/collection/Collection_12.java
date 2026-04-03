package com.sist.collection;
import java.util.*;
public class Collection_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String text="java and java jsp html java jsp oracle java jsp";
        Map<String,Integer> count=
        		new HashMap<String, Integer>();
        String[] words=text.split(" ");
        for(String word:words)
        {
        	if(count.containsKey(word))
        	{
        		count.put(word, count.get(word)+1);
        	}
        	else
        	{
        		count.put(word, 1);
        	}
        }
        System.out.println("[단어 빈도수]");
        for(Map.Entry<String, Integer> e:count.entrySet())
        {
        	System.out.println(e.getKey()+":"+e.getValue());
        }
	}

}
