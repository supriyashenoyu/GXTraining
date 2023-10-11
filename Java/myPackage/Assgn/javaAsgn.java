package myPackage;
import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.nio.file.Files;

public class javaAsgn {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\train\\file.txt");
		File file1 = new File("C:\\train\\file1.txt");

		Scanner fs = new Scanner(file);

		String s;
	    String s1;

		HashSet<String> uniqueWords = new HashSet<String>();
		
		while(fs.hasNext()){
			String st=fs.next();

			int flag=0;
			Scanner fs1 = new Scanner(file1); 
			int count =0;
            while(fs1.hasNext()){
                String st1=fs1.next();

               
                if(st.equals(st1)){ System.out.print(st+"->");count++;System.out.println(count);flag=1;}
            
            }
           
            fs1.close();
            if(flag==0){
            	uniqueWords.add(st);
            	 }
           
		}
		/////////////////////////////////////////
HashSet<String> uniqueWords1 = new HashSet<String>();
        Scanner fs1 = new Scanner(file1); 
		
		while(fs1.hasNext()){
			String st=fs1.next();
			int f=0;
			Scanner fs2 = new Scanner(file); 
            while(fs2.hasNext()){
                String st1=fs2.next();               
                if(st1.equals(st)){f=1;} 
            }
            fs2.close();
            if(f==0){
            	uniqueWords1.add(st);
            	 }
          
		}
		Scanner fs3 = new Scanner(file);
		Scanner fs4 = new Scanner(file1); 
		 System.out.println("unique words from file 1"+uniqueWords);
		 System.out.println("unique words from file 2"+uniqueWords1);
		 FileOutputStream out = new FileOutputStream("C:\\train\\file3.txt");
		 while(fs3.hasNextLine()||fs4.hasNextLine()) {
			 if(fs3.hasNextLine()) {
			 String string=fs3.nextLine();
			 out.write(string.getBytes());out.write("\n".getBytes());}
			 if(fs4.hasNextLine()) {
			 String string1=fs4.nextLine();
			 out.write(string1.getBytes());out.write("\n".getBytes());}
			 
			 
		 }
		 out.close();
		  

    
        


		}

}
