package myPackage;
import java.io.*;

public class Files {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		//FileInput
		File file = new File("C:\\train\\file1.txt");
		File file1 = new File("C:\\train\\out.txt");
		System.out.println(file.createNewFile());
//		System.out.println(file1.createNewFile());
		FileInputStream fis= new FileInputStream(file1);
		
		String s="Welcome to Banglore."; 
		FileOutputStream out = new FileOutputStream("C:\\train\\out.txt");
		out.write(s.getBytes());
		
		int i =0;
		while((i=fis.read())!=-1){
			System.out.print((char)i);	
			
		}
		fis.close();
		out.close();
		///objectInput
		 ObjectInputStream obji = new ObjectInputStream(new FileInputStream("out.txt")); 
		 System.out.println("" + (String) obji.readObject());
		 obji.close();

	}

}
