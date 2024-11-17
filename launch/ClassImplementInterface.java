package launch;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ClassImplementInterface implements InterfaceToDeclareMethods {
    String str, s;
    String temp;
    int counter, i =1,j = 1;
	@Override
	public <T> void fileWriter(String fileName, boolean bool, T... data) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, bool));
			for(T item:data) {
				writer.append(item.toString());
				writer.append(',');
			}
			writer.append('\n');
			writer.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public String[] singleDataFileReader(String fileName, String username) throws IOException {
		String[] item;
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		s = reader.readLine();
		item = new String[s.split(",").length];
		item = s.split(",");
		while(s!= null) {
			item = s.split(",");
			if(item[0].equals(username)) {
				break;
			}
			s = reader.readLine();
		}
		reader.close();
		return item;
	}
	@Override
	public String[][] allDataFileReader(String fileName) {
		String[][] item = new String[amountOfRecordesInAFile(fileName)][];
		int i = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			s = reader.readLine();
			while(s!= null) {
				System.out.println("correct");
				item[i] = s.split(",");
				s = reader.readLine();
				i++;
			}
			reader.close();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return item;
	}
	
	@Override
	public int usernameAutoGenerateMethod(String fileName){
		String str, temp = "";
		int counter=0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((str = reader.readLine())!=null) {
				temp = str.split(",")[0];
			}
			reader.close();
			counter = Integer.parseInt(temp.substring(4, temp.length()-3));
			counter++;
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
	}
	@Override
	public boolean checkUsernameAndPassword(String fileName, String username, String password) {
		boolean b = false;
		String str, items[];
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((str = reader.readLine())!=null){
				items = str.split(",");
				if(items[0].equals(username)&&items[1].equals(password)) {
					b = true;
					break;
				}
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return b;
	}
	@Override
	public int section(String filename) {
		String str, temp ,items[],s1,s2;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while(reader.readLine()!=null) {
				counter++;
				if(counter==30) {
					j++;
					counter = 1;
				}
			}
			reader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return j;
	}
	@Override
	public int amountOfRecordesInAFile(String filename) {
		int i = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			while(reader.readLine()!=null) {
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public void componentappired(JLabel... component) {
		for(JLabel l:component) 
			l.setVisible(true);}
	@Override
	public void componentappired(JButton... component) {
		for(JButton b:component) 
			b.setVisible(true);}
	@Override
	public void componentappired(JTextField... component) {
		for(JTextField t:component) 
			t.setVisible(true);}
	@Override
	public void componentDisappired(JLabel... component) {
		for(JLabel l:component)
			l.setVisible(false);}
	@Override
	public void componentDisappired(JButton... component) {
		for(JButton b:component)
			b.setVisible(false);}
	@Override
	public void componentDisappired(JTextField... component) {
		for(JTextField t:component) 
			t.setVisible(false);}
	@Override
	public void addComponentToFrame(JFrame frame, JLabel... component) {
		for(JLabel l:component)
			frame.add(l);}
	@Override
	public void addComponentToFrame(JFrame frame, JButton... component) {
		for(JButton l:component)
			frame.add(l);}
	@Override
	public void addComponentToFrame(JFrame frame, JTextField... component) {
		for(JTextField l:component)
			frame.add(l);}
	@Override
	public void addComponentToFrame(JFrame frame, JComboBox... component) {
		for(JComboBox l:component)
			frame.add(l);}
	@Override
	public void disappiedTextFromTextfield(JTextField... component) {
		for(JTextField t:component)
			t.setText("");}
	@Override
	public void componentappired(JComboBox... component) {
		for(JComboBox t:component) 
			t.setVisible(true);}
	@Override
	public void componentDisappired(JComboBox... component) {
		for(JComboBox t:component) 
			t.setVisible(false);}
	@Override
	public JLabel createLabel(JLabel label, Color color, Font font, int x, int y, int Width, int height) {
		label.setBounds(x, y, Width, height);
		label.setForeground(color);
		label.setFont(font);
		return label;
	}
}
