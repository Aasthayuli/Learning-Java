/*Example that reads the data from two files and writes into another file */

import java.io.*;    
class Input1{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("testin1.txt");    
   FileInputStream fin2=new FileInputStream("testin2.txt");    
   FileOutputStream fout=new FileOutputStream("testout.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);//Notice: 'fout.write()' (fout is an object of 'FileOutputStream') is used to write into the 'testout.txt' file.     
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}    