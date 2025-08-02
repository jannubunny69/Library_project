package com.example.encap;

public class Encapsulation {
    public static void main(String[] args){
       Student obj=new Student(21,"sai");
       obj.printdetails();
       int c=obj.getId();
       System.out.println(c);
       
   }
}