package com.mycompany.arraysofsubclassobjects;

public class EBook extends Book 
{
    double fileSizeMB;

    public EBook(String title, String author, double fileSizeMB)
    {
        super(title, author);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("[eBook] " + title + " by " + author + " (" + fileSizeMB + " MB)");
    }
}
