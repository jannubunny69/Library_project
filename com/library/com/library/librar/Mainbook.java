package com.library.librar;
public class Mainbook implements Borrowable {
   private String bookname;
   private String authername;
   private int price;
   private int count;
   private boolean isborrow;

   public Mainbook(String bname, String aname, int price, int count) {
      this.bookname = bname;
      this.authername = aname;
      this.price = price;
      this.count = count;
      this.isborrow = false;
   }

   public Mainbook(String bname, int price, int count) {
      this.bookname = bname;
      this.price = price;
      this.isborrow = false;
      this.count = count;
   }

   public Mainbook(String bname, int count) {
      this.bookname = bname;
      this.isborrow = false;
      this.count = count;
   }

   public Mainbook(String bname, String aname, int count) {
      this.bookname = bname;
      this.authername = aname;
      this.isborrow = false;
      this.count = count;
   }

   public Mainbook() {
   }

   public String getBookname() {
      return bookname;
   }

   public void setBookname(String bookname) {
      this.bookname = bookname;
   }

   public String getAuthername() {
      return authername;
   }

   public void setAuthername(String authername) {
      this.authername = authername;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public int getCount() {
      return count;
   }

   public void setCount(int count) {
      this.count = count;
   }

   public boolean isBorrowed() {
      return isborrow;
   }

   public void setBorrowed(boolean borrowed) {
      this.isborrow = borrowed;
   }

  
   public String getDetails() {
      return "Book name: " + getBookname() + "\nauthor: " + getAuthername() + ", price: " + getPrice() + ", count: " + getCount();
   }

   @Override
   public boolean borrowItem() {
      if (count > 0 && !isborrow) {
         isborrow = true;
         count--;
         return true;
      }
      return false;
   }

   @Override
   public void returnItem() {
      if (isborrow) {
         isborrow = false;
         count++;
      }
   }
}
