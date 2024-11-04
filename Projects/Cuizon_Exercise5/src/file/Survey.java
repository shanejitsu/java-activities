package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Survey {
	private static String path = "D:\\Cuizon\\Java Activities\\java-activities\\Projects\\Cuizon_Exercise5\\Files\\";
	private static String inputFile = "numbers.txt";
	private static String outputFile = "output.txt";
	static Scanner scn;
	static Formatter f = null;
	static File out;

	/**
	 * Writes the file numbers.txt
	 * 
	 * stores inputed survey responses to numbers.txt
	 * @return No return value.
	 * */
	private static void getResponse() {
		scn = new Scanner(System.in);
		int input = 1;
		
		try {
			f = new Formatter(path + inputFile);
			while (true) {
				System.out.println("Enter survey responses (scale from 1 to 10).");
	            System.out.println("Input a number greater than 10 or less than or equal to 0 to stop:");
	            input = scn.nextInt();
	            if(input > 0 && input <= 10) {
	            	f.format("%d%n", input);
	            	f.flush();
	            }else {
	            	break;
	            }   
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		f.close();
		scn.close();
		
	}
	
	/**
	 * Reads the file numbers.txt
	 * 
	 * stores the read integer survey responses to output.txt
	 * @return No return value.
	 * */
	private static void outputResponse() {
		;
		try {
			scn = new Scanner(new File(path + inputFile));
			out = new File(path+outputFile);
			FileWriter fw = new FileWriter(out);
			while (scn.hasNextInt()) {
	            int response = scn.nextInt();
	            fw.write(response+"\n");
	        }
			fw.close();
			scn.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getResponse();
		outputResponse();
	}

}
