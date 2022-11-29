package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class rading {
	
	public static void main(String[] args) throws IOException {
		
		//File             :    reach that file       :   pass path of the file 
		//FileReader       :    fetch that file       :    pass file object as input 
		//BufferedReader   :    read the content      :    pass filereader object as input
		
		File f= new File("C:\\Users\\hp\\eclipse-workspace\\joTHI5PM\\src\\filehandling\\jothi.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		/*
		 *first    line=hello        line!-null =>  print line
		 *second   line=welcome      welcome!=null-> print welcome
		 *third    line=bye          bye!=null   -> print   bye
		 *fourth   line=null         null!=null   => loop terminate 
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
	}

}
