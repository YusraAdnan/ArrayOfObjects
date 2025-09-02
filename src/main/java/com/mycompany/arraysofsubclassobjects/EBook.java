package com.mycompany.arraysofsubclassobjects;

public class EBook extends Book 
{
    double fileSizeMB;

    public EBook(String title, String author, double fileSizeMB)
    {
        super(title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public String isLargeFile() 
    {
       if (fileSizeMB > 5.0)
       {
           return "File is large";
       }
       else
       {
           return "File is small";
       }
    }
     @Override
    public void displayInfo() 
    {
        System.out.println("[eBook] " + title + " by " + author + " (" + fileSizeMB + " MB)"
                + "/n" + isLargeFile());
    }
}
