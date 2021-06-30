package com.sri.interviewPrograms;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 
/**
 * This program demonstrates how to write characters to a text file using
 * a specified charset.
 * @author www.codejava.net
 *
 */
public class TextFileWritingExample3 {
 
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("MyFile.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
             
            bufferedWriter.write("Xin ch�o");
            bufferedWriter.newLine();
            bufferedWriter.write("H?n g?p l?i!");
             
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}