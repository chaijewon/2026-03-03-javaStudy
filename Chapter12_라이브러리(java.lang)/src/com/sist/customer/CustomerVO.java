package com.sist.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// C001,user001,pw001,김민수,minsu.kim1@test.com,010-1000-0001,서울,2023-01-02,VIP
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@ToString
//@EqualsAndHashCode
public class CustomerVO {
  private String customer_id;
  private String login_id;
  private String pwd;
  private String name;
  private String email;
  private String phone;
  private String loc;
  private String regdate;
  private String grade;
}
