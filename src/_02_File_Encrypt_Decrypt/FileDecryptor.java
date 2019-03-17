package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/League/git/level5-00-file-io-theonak4/src/_02_File_Encrypt_Decrypt/test.txt"));
			
			line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String decryptedString = AES.decrypt(line, "RED033493711");
		JOptionPane.showMessageDialog(null, decryptedString);
	}
}
