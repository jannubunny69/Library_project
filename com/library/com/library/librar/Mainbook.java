package com.library.librar;
public class Mainbook {
    String bookname;
    String authername;
    int price;
    int count;
    Boolean isborrow;
    
    public Mainbook(String bname,String aname,int price,int count){
       this.bookname=bname;
       this.authername=aname;
       this.price=price;
       this.count=count;
       this.isborrow=false;
    }
    public Mainbook(String bname,int price,int count){
        this.bookname=bname;
        this.price=price;
        this.isborrow=false;
        this.count=count;
     }
     public Mainbook(String bname,int count){
        this.bookname=bname;
        this.isborrow=false;
        this.count=count;
     }
     public Mainbook(String bname,String aname,int count){
        this.bookname=bname;
        this.authername=aname;
        this.isborrow=false;
        this.count=count;
     }
   public Mainbook() {
   }

   
}
