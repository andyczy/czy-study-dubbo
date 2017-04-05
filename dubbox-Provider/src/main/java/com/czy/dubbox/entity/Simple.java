package com.czy.dubbox.entity;

import java.io.Serializable;
import java.util.Map;

/**
 * @auther     陈郑游
 * @create     2017/4/5 0005
 * @功能       implements Serializable
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
public class Simple {
     private static final long serialVersionUID = -4914434736682797743L;  
     private String name;  
     private int age;  
     private Map<String,Integer> map;  
     public Simple(){  
  
     }  
     public Simple(String name,int age,Map<String,Integer> map){  
         this.name = name;  
         this.age = age;  
         this.map = map;  
     }  
  
     public String getName() {  
       return name;  
     }  
  
     public void setName(String name) {  
        this.name = name;  
     }  
  
     public int getAge() {  
        return age;  
     }  
  
     public void setAge(int age) {  
        this.age = age;  
     }  
  
     public Map<String, Integer> getMap() {  
        return map;  
     }  
  
     public void setMap(Map<String, Integer> map) {  
        this.map = map;  
     }  
  
  
}  
