package com.mycompany.arraysofsubclassobjects;

class PrintedBook extends Book 
{
   
    int pages;

    public PrintedBook(String title, String author, int pages)
    {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("[Printed] " + title + " by " + author + " (" + pages + " pages)");
    }
}
