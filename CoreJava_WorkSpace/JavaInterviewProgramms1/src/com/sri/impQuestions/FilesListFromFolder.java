package com.sri.impQuestions;
import java.io.File;
 
public class FilesListFromFolder {
     
    public static void main(String a[]){
        File file = new File("D://Resumes//Doc Resumes");
        File[] files = file.listFiles();
        for(File f: files){
        	if(f.toString().endsWith(".xml")||f.toString().endsWith(".XML"))
        	{
        	System.out.println(f);
        	}
           // System.out.println(f.getName());
        }
    }
}