package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	
	
	public static void main(String[] args)
	{
	// Create a program that takes a message from the user and saves it to a file.
	try {
		FileWriter fw = new FileWriter("src/_01_File_Recorder/usertext.txt");
		String j = JOptionPane.showInputDialog("what would you like to write in the file?");
	/*	NOTE: To append to a file that already exists, add true as a second parameter when calling the
		      FileWriter constructor.
		      (e.g. FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/test2.txt", true);)
		*/
		
		fw.write(j);
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
