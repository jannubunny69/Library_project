package com.library.librariann;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Iterator;
public class Librarian {  
    public  String name;
    public Librarian(String name) {
    this.name=name;
}
    public Librarian() {
    }
   
    HashMap<String,String>members=new HashMap<>();
    public void addmember(String member,String id){
        members.put(member,id);
        System.out.println("member added successfully name: "+ id+ " "+ member);
    }
    public String generate_id() {
        int length = 8;
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        String digits = "0123456789";
        String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String special="@#$";
        
        // Generating an 8-digit number
        for (int i = 0; i < (length/2)-1; i++) {
            int index = random.nextInt(digits.length());
            sb.append(digits.charAt(index));
        }
        for (int i = 0; i < (length/2)-1; i++) {
            int index = random.nextInt(letters.length());
            sb.append(letters.charAt(index));
        }
        for (int i = 0; i < (length/2); i++) {
            int index = random.nextInt(special.length());
            sb.append(special.charAt(index));
        }
        
        // Converting to an integer
        return sb.toString();
    }
    
  
     public void removemember(String remvname) {
        
        // boolean removed = members.entrySet().removeIf(entry -> entry.getValue().equalsIgnoreCase(members.get(remvname)));
        // boolean removed = members.entrySet().removeIf(entry -> entry.getValue().equalsIgnoreCase(remvname));

        if (members.containsKey(remvname)) {
            members.remove(remvname);
            System.out.println("Member " + remvname + " removed successfully.");
        } else {
            System.out.println("Member " + remvname + " not found.");
        }
    }
    
    
    public void displaymembers() {
    
        for(String key:members.keySet()){
            System.out.println("Name :"+key+" Id :"+members.get(key));
        }
    }
    public void getdetails(ArrayList<Librarian> librarianlist1) {
        for(Librarian list1:librarianlist1){
            System.out.println("Name : "+list1.name);
            }
              

    }
    public ArrayList<Librarian> removelibraians(ArrayList<Librarian> librarianlist1, String librarian2) {
        Boolean found=false;
        Iterator<Librarian> iterator = librarianlist1.iterator();

    while (iterator.hasNext()) {
        Librarian lib = iterator.next();
        if (lib.name.equalsIgnoreCase(librarian2)) {
            iterator.remove(); 
                found=true;
                System.out.println("librarian removed : "+librarian2);
                break;
        }
    }
        if(!found){
            System.out.println("librarian not found");
        }
        return librarianlist1;
    }
   
}

