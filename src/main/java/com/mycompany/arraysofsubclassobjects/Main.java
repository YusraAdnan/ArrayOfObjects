package com.mycompany.arraysofsubclassobjects;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
    {
//        /* Every array has a data type link int[] number = new number[9];
//        Here the data type of the array is of the Book class 
//        Meaning this array will hold objects "real occurence" of every Book child */
//        
//        Book[] library = new Book[3];
//
//        //In the first index of the Book array we have an object of PrintedBook from the parent Book class 
//        library[0] = new PrintedBook("1984", "George Orwell", 328);
//        
//        //in the second index of the Book array we have an object of EBook which is another child of Book
//        library[1] = new EBook("Java Basics", "John Smith", 2.5);
//        
//        library[2] = new PrintedBook("Pride and Prejudice", "Jane Austen", 432);
//
//        /*We can then automatically run just 4 lines of code to iterate over each object 
//        stored in the Book Array and automatically call the correct method as the loop iterated over each object of Book */
//        System.out.println("Library Collection:");
//        for (Book b : library)
//        {
//            b.displayInfo(); // dynamic binding → calls correct version
//        } 
        Scanner scan = new Scanner(System.in);

        System.out.print("How many books do you want to enter details for? ");
        int n = scan.nextInt();
        scan.nextLine(); // consume newline

        Book[] library = new Book[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter type (printed/ebook): ");
            String type = scan.nextLine();

            System.out.print("Enter title: ");
            String title = scan.nextLine();

            System.out.print("Enter author: ");
            String author = scan.nextLine();

            if (type.equalsIgnoreCase("printed")) 
            {
                System.out.print("Enter number of pages: ");
                int pages = scan.nextInt();
                scan.nextLine();
                library[i] = new PrintedBook(title, author, pages);
            } 
            else
            {
                System.out.print("Enter file size (MB): ");
                double size = scan.nextDouble();
                scan.nextLine();
                
                library[i] = new EBook(title, author, size);
            }
            System.out.println("------------------------------------------------------");
        }

        System.out.println("\nLibrary Collection:");
        for (int i = 0; i < library.length; i++) 
        {
            library[i].displayInfo(); // dynamic binding
        }
    }
}
