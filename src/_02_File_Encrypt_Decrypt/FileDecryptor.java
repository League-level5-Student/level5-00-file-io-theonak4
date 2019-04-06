package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
		public static void main(String[] args) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/test.txt"));
				
				String r = br.readLine();
				
				String a = r.replace('b','a');
				String e = a.replace('f','e');
				String i = e.replace('j','i');
				String o = i.replace('p','o');
				String u = o.replace('v','u');
				
				
				System.out.println(u);
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
		
		
		
	}

}