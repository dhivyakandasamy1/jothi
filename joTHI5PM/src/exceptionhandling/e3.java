package exceptionhandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class e3 {
public static void main(String[] args) throws IOException {

	File f= new File("C:\\Users\\hp\\eclipse-workspace\\joTHI5PM\\src\\filehandling\\jothi.txt");
	FileWriter fw= new FileWriter(f);
	BufferedWriter bw= new BufferedWriter(fw);
}
}
