package com.sist.anno;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*
 *    @RequestMapping("aaa")
 *    aaa()
 *    @RequestMapping("bbb")
 *    bbb()
 *    @RequestMapping("ccc")
 *    ccc()
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface RequstMapping {
    public String value(); // 구분자 
}
