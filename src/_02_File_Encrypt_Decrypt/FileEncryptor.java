package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("what would you like to write in the file?");
	
		String a = s.replace('a','b' );
		String e = a.replace('e','f' );
		String i = e.replace('i','j' );
		String o = i.replace('o','p' );
		String u = o.replace('u','v' );
		
		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/test.txt");
			
			fw.write(u);
				
			fw.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	
}