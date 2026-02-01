package com.library.librar;
import com.library.librariann.Librarian;
import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Mainbook{
    ArrayList<Mainbook> booklist = new ArrayList<>();
    Librarian obj1 = new Librarian();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Librarian> librarianlist1 = new ArrayList<>();
    public void initialize_librarian(){
        librarianlist1.add(new Librarian("rama chary"));
        System.out.println(obj1.getName());
    }
    public void initializebooks(){
                booklist.add( new Mainbook("wings of fire","apj abdul kalam",220,40));
                booklist.add(  new Mainbook("The Alchemist", "Paulo Coelho", 299,25));
                booklist.add(new Mainbook("1984", "George Orwell", 199,15));
                booklist.add(new Mainbook("To Kill a Mockingbird", "Harper Lee", 349,3));
     }
    public Book(String bname,String aname,int price,int count){
       super(bname,aname,price,count);
     }
     public Book(String bname,int price,int count){
        super(bname,price,count);
     }
     public  Book(String bname,String aname,int count){
       super(bname, aname,count);
     }
    public Book(String bname,int count) {
        super(bname,count);
    }
    public Book() {
        super();
    }
    public void add(Mainbook mainbook) {
        booklist.add(mainbook);
    }

    public void add(Librarian librarian) {
        librarianlist1.add(librarian);
    }
   
    public void addBook(String bname, String aname, int price,int count) {
        booklist.add(new Mainbook(bname, aname, price,count));
        System.out.println("Added book: " + bname);
    }

    public void addBook(String bname, int price,int count) {
        booklist.add(new Mainbook(bname, price,count));
        System.out.println("Added book: " + bname);
    }

    public void addBook(String bname, String aname,int count) {
        booklist.add(new Mainbook(bname, aname,count));
        System.out.println("Added book: " + bname);
    }

    public void addBook(String bname,int count) {
        booklist.add(new Mainbook(bname,count));
        System.out.println("Added book: " + bname);
    }
    public void findbook(String bookname){
        Boolean found=false;
        for(Mainbook book:booklist){
            if (book.getBookname().equalsIgnoreCase(bookname)) {
                System.out.println(book.getDetails());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("book not found");
        }
    }
    public void display(){
        for(Mainbook book:booklist){
            System.out.println(book.getDetails());

        }
    }   
    public  void returnbook(String s){
        int flag=0;
        for(Mainbook book:booklist){
            if(book.getBookname().equalsIgnoreCase(s)){
                book.returnItem();
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("book returned succesfully");
        }
        else{
            System.out.println("book record not found");
        }
    }
    public void borrow(String a) {
        for(Mainbook book:booklist){
            if(book.getBookname().equals(a)){
                boolean ok = book.borrowItem();
                if(ok){
                    System.out.println("book is borrowed succesfully");
                } else {
                    System.out.println("book is unavilable");
                }
            }
        }
    }
    public void verifylibrarian12(String name1) {
        int flag=0;
        for(Librarian librarian:librarianlist1){
            if (librarian.getName().equals(name1)) {
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("login Successful");
                System.out.println("welcome : "+ name1);
                System.out.println("enter book name,auther name,price,no of copies ");
                String bname=scanner.nextLine();
                String aname=scanner.nextLine();
                int price=scanner.nextInt();
                scanner.nextLine();
                int count=scanner.nextInt();
                scanner.nextLine();
                booklist.add(new Mainbook(bname, aname, price, count));
        }
        else{
            System.out.println("accesss denied");
        }

    }
    public void verifylibrarian(String admin) {
        
        for(Librarian librarian:librarianlist1){
            if (librarian.getName().equals(admin)) {
                
                System.out.println("login Successful");
                System.out.println("welcome : "+ admin);
                Boolean run=true;
                while(run){
                    System.out.println("\n\n");
                System.out.println("please select your operation");
                System.out.println("1.add member");
                System.out.println("2.add book");
                System.out.println("3.add librarians");
                System.out.println("4.remove member");
                System.out.println("5.display members");
                System.out.println("6.get librarian details");
                System.out.println("7.remove librarians");
                System.out.println("8.logout");
                int n=scanner.nextInt();
                scanner.nextLine();
                switch (n) {
                    case 1:
                    System.out.println("enter name of member");
                    String mem=scanner.nextLine();
                    String id=obj1.generate_id();
                        obj1.addmember(mem,id);
                        break;
                    case 2:
                        System.out.println("not implemented");
                        break;
                    case 3:
                    System.out.println("enter name of librarian");
                    String admn = scanner.nextLine();
                        librarianlist1.add(new Librarian(admn));
                    System.out.println("librarian details added successfully"+admn);
                    break;
                    case 4:
                    System.out.println("enter member name to remove");
                    String remvname=scanner.nextLine();
                    obj1.removemember(remvname);
                    System.out.println("member removed");
                    break;
                    case 5:
                    obj1.displaymembers();

                    break;
                    case 6:
                    obj1.getdetails(librarianlist1);
                    break;
                    case 7:
                    System.out.println("enter name to remove");
                    String librarian2=scanner.nextLine();
                    obj1.removelibraians(librarianlist1,librarian2);
                    break;
                    case 8:
                    System.out.println("loggingout");
                    return;
                    default:
                    System.out.println("enter valid choice");
                        break;
                }
                }
            }
            else{
                System.out.println("enter valid details");
                System.out.println("plese try again");
                return;
                
                
            }
        }
        scanner.close();
    }
  
     
   

}
