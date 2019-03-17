package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What would you like to add to the file?");
		String encryptedString = AES.encrypt(input, "RED033493711");
		try {
			FileWriter fw = new FileWriter("/Users/League/git/level5-00-file-io-theonak4/src/_02_File_Encrypt_Decrypt/test.txt");
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
			*/
			
			fw.write(encryptedString);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
