package com.example.protect;
import com.example.encap.Student;
class Privated extends Student {

    
    public Privated(int id,String name) {
        super(id,name);
    }

    public static void main(String[] args) {
       
        Privated obj1 = new Privated(24,"bunny");
         System.out.println("ID from Protected12: " + obj1.getId());
        // obj1.printDetails();

    }
}