package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fw {
public static void main(String[] args) throws IOException {
	//File           :   reach the path       :  pass path of the file as input
	//FileWriter     :   create a file        :  pass file object as input
	//BufferedWriter :   write the contnent   :  pass file writer object as input
	
	// non static in nature
	
	File f= new File("C:\\Users\\hp\\eclipse-workspace\\joTHI5PM\\src\\filehandling\\jothi.txt");
	FileWriter fw= new FileWriter(f);
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("hello");
	bw.newLine();
	bw.write("welcome");
	bw.newLine();
	bw.write("bye");
	bw.close();
	
}
}
