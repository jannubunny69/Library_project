package com.library.lib;
import com.library.librar.Book;
import java.util.Scanner;
class MAIN{
    public static void main(String[] args){
                Scanner scan=new Scanner(System.in);
                Book obj=new Book();
                obj.initializebooks();
                obj.initialize_librarian();
        Boolean running=true;
        while(running){
            System.out.println("\n");
            System.out.println("Welcome to Library Management System");
            System.out.println("please select your choice:");
            System.out.println("1.BORROW BOOK");
            System.out.println("2.RETURN BOOK");
            System.out.println("3.display books");
            System.out.println("4.add books");
            System.out.println("5.search book");
            System.out.println("6.librarian login");
            System.out.println("7.exit");
            int choice=scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1:
                System.out.println("enter book to borrow");
                String a=scan.nextLine();
                obj.borrow(a);
                break;
                case 2:
                System.out.println("enter book to return");
                String m=scan.nextLine();
                obj.returnbook(m);
                break;
                case 3:
                obj.display();
                break;
                case 4:
                System.out.println("only librarians can add or remove books \n if you are a librarian press to continue :");
                int librarian11=scan.nextInt();
                scan.nextLine();
                if(librarian11==1){
                    System.out.println("enter your name / details");
                    String name1=scan.nextLine();
                    obj.verifylibrarian12(name1);  
                }
                else{
                    System.out.println("access denied");
                    continue;
                }
                
                break;
                case 5:
                System.out.println("enter bookname to find");
                String b=scan.nextLine();
                obj.findbook(b);
                break;
                case 6:
                System.out.println("please enter your name");
                String admin=scan.nextLine();
                obj.verifylibrarian(admin);
                break;
                case 7:
                System.out.println("exiting");
                running=false;
                default:
                System.out.println("please enter valid choice");

            }
        }
        scan.close();
    }
}