package sPR;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SerializeChallenge {
	
	static String age;
	static String name;
	static String gender;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Age?");
		age = input.nextLine();
		
		System.out.println("Name?");
		name = input.nextLine();
		
		System.out.println("Gender?");
		gender = input.nextLine();
		
		File file = new File(name + age + ".txt");
		
		try { makefile("File.txt");
			printFileContents("File.txt");
		} catch (IOException ioe) {
			System.out.println("Exception: " + ioe.getMessage());
			ioe.printStackTrace();
		} {
			
		}
		
	}
	public static void makefile(String filename) throws IOException {
		FileWriter fw = new FileWriter(filename);
		fw.write(age + "\n");
		fw.write(name + "\n");
		fw.write(gender + "\n");
		fw.close();
		}
	public static void printFileContents(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		char[] buffer = new char[50];
		fr.read(buffer);
		System.out.println(buffer);
		fr.close();
	}
}
