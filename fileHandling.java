
/**
 *File : TO store data permanently file is used.
 *Types of Stream :
 * (1)Output Stream : Data flowing from variable(stored in RAM) to file(Stored in HDD).
 * (2)Input Stream : Data flowing from file(Stored in HDD) to variable(Stored in RAM).
 * (3)Byte Stream : Data would be in the form of raw sequence of 0 and 1 (8-bit unicode).
 * (4)Character Stream : Data would be in the form of sequence of few 0 and 1 collectively corresponding to a character(16-bit unicode).
 * (5)Byte Stream Classes : 1.FileInputStream     2.FileOuputStream
 * (6)Character Stream CLasses : 1.FileWriter      2.FileReader 
 * 
 * */

import java.util.*;

import javax.swing.text.PlainDocument;

import java.io.*;

class fileHandling {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		/*System.out.print("Enter the name : ");
		String name = scanner.nextLine();
		FileWriter fr = new FileWriter("output.txt");
		fr.write(name);
		System.out.println("Succesfully written");
		System.out.println("--------------------------------------------");
		*/
		System.out.print("The contents in file are : ");
		FileReader fd = new FileReader("output.txt");
		int i;
		while((i = fd.read()) != -1){
			System.out.print((char)i);
		}
		fd.close();
		System.out.println();
		System.out.println("--------------------------------------------");

	}
}
