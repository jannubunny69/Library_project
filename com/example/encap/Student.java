package com.example.encap;
public class Student{
    private int id;
    private String name;
    private int batch;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
        this.batch=2004;
    }
   public void setName(String name){
        this.name=name;
    }
   public String getName(){
        return name;
    }
   public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void printdetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(batch);
    }
}
