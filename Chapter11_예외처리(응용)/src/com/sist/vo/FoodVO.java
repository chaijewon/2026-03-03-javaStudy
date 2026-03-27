package com.sist.vo;

import lombok.Data;

/*
 *   FoodVO vo=new FoodVO();
        		   vo.setName(strName.trim());
        		   vo.setType(type.text());
        		   vo.setPhone(phone.text());
        		   vo.setAddress(address.text());
        		   vo.setScore(Double.parseDouble(score.text()));
        		   vo.setParking(parking.text());
        		   vo.setPoster(poster.attr("src"));
        		   vo.setImages(images);
        		   vo.setTime(time.text());
        		   vo.setContent(content.text());
        		   vo.setTheme(theme.text());
        		   vo.setPrice(price.text());
 */
@Data
public class FoodVO {
   private int no;
   private String name,type,phone,address,parking,poster,images,
           time,content,theme,price;
   private double score;
}
