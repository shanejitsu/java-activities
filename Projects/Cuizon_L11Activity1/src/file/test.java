package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		File f = new File("D:\\Cuizon\\Java Activities\\java-activities\\Projects\\Cuizon_L11Activity1\\Files\\file.txt");

		ObjectInputStream oiStream;
		ObjectOutputStream ooStream;


		try {
			ooStream = new ObjectOutputStream(new FileOutputStream(f));//output->writes, input->reads
			ooStream.writeInt(0);
			ooStream.close();
			oiStream  = new ObjectInputStream(new FileInputStream(f));
			System.out.println("Integer data :" + oiStream.readInt());
			oiStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
