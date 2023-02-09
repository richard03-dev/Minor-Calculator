package minor;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.*;

public class MinorCalculator {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> classes = new ArrayList<String>();
		
		System.out.println("Enter the filename for your classes: ");
		String filename = scanner.nextLine();
		File f = new File("C:\\eclipse\\eclipse\\minor app\\src\\minor\\" + filename);
		Scanner scan = new Scanner(f);
		while (scan.hasNextLine()) {
			String c = scan.nextLine();
			classes.add(c);
		}
		
		
		
		
		

	}

}
