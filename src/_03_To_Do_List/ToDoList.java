package _03_To_Do_List;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	JFrame tdl;
	JPanel jp;
	JButton at;
	JButton vt;
	JButton rt;
	JButton sl;
	JButton ll;
	ArrayList<String> arr;
	public static void main(String[] args) {
		ToDoList t = new ToDoList();
		
		t.createUI();
	} 
	public void createUI()
	{
		tdl= new JFrame("To Do List");
		 jp = new JPanel();
		at = new JButton("add task");
		vt = new JButton("view tasks");
		rt = new JButton("remove task");
		 sl = new JButton("save list");
		 ll = new JButton("load list");
		 arr = new ArrayList<String>();
		tdl.add(jp);
		jp.add(at);
		jp.add(vt);
		jp.add(rt);
		jp.add(sl);
		jp.add(ll);
		tdl.setVisible(true);
		jp.setVisible(true);
		at.addActionListener(this);
		vt.addActionListener(this);
		rt.addActionListener(this);
		sl.addActionListener(this);
		ll.addActionListener(this);
		tdl.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == at)
		{
			
			arr.add(JOptionPane.showInputDialog("Give A task"));
			
		}
		if (e.getSource() == vt);
		{
			System.out.println("vt called");
			for(int i =0; i < arr.size();i++)
			{
				System.out.println(arr.get(i));
			}
		}
		if (e.getSource()  == rt)
		{
			arr.remove(JOptionPane.showInputDialog("Give A task to remove"));
		}
		if(e.getSource() == sl)
		{
			System.out.println("sl called");
			try {
				FileWriter fw = new FileWriter("src/_03_To_Do_List/text.txt");
				
			
				for(int i =0; arr.size() > i;i++)
				{
					fw.write(arr.get(i));
					fw.write("\n");
				}
					
				fw.close();
			} catch (IOException s) {
				s.printStackTrace();
			}
		}
		if(e.getSource() == ll)
		{
			System.out.println("ll called");
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/_03_To_Do_List/text.txt"));
//				ArrayList<String> saveL = new ArrayList<String>();
//				saveL.size() = arr.size();
				for(int i =0; i<arr.size();i++)
				{
					String line = br.readLine();
					arr.add(line);
				
					while(line != null){
						System.out.println(line);
						line = br.readLine();
						}
				}
				for(int i =0;i < arr.size();i++)
				{
					System.out.println(arr.get(i)); 
				}
				
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException l) {
				// TODO Auto-generated catch block
				l.printStackTrace();
			}
		}
	}
}