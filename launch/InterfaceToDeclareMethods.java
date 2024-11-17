package launch;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public interface InterfaceToDeclareMethods {
	
	<T> void fileWriter(String fileName,boolean bool, T...data);
	String[] singleDataFileReader(String fileName,String username) throws IOException;
	String[][] allDataFileReader(String fileName);
	void componentappired(JLabel...component);
	void componentappired(JButton...component);
	void componentappired(JTextField...component);
	void componentappired(JComboBox...component);
	JLabel createLabel(JLabel label, Color color,Font font ,int x,int y, int Width, int height);
	void componentDisappired(JLabel...component);
	void componentDisappired(JButton...component);
	void componentDisappired(JTextField...component);
	void componentDisappired(JComboBox...component);
	void addComponentToFrame(JFrame frame,JLabel...component);
	void addComponentToFrame(JFrame frame,JButton...component);
	void addComponentToFrame(JFrame frame,JTextField...component);
	void addComponentToFrame(JFrame frame,JComboBox...component);
	void disappiedTextFromTextfield(JTextField...component);
	int usernameAutoGenerateMethod(String fileName);
	boolean checkUsernameAndPassword(String fileName, String username,String password);
	int section(String filename);
	int amountOfRecordesInAFile(String filename);
}
