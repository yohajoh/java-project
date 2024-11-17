package student;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Practic {
	static JTextArea text1, text2;static String str = "";static String str1 = "";
	Practic(){
		text1 = new JTextArea();text2 = new JTextArea();
		JScrollPane pan1 = new JScrollPane(text1);pan1.setBounds(0, 0, 250, 265);
		JScrollPane pan2 = new JScrollPane(text2);pan2.setBounds(250, 0, 235, 265);
		JFrame frame = new JFrame();frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame.setSize(500, 300);frame.setLayout(null);frame.setLocationRelativeTo(null);frame.add(pan1);frame.add(pan2);frame.setVisible(true);
	}
	public static void main(String[] args) throws InterruptedException{
		new Practic();
		Runnable obj1 = () -> {for(int i = 0; i < 500; i++) {str = str + "\n" + "yohannes";text1.setText(str);try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}}};
		Runnable obj2 = () -> {for(int i = 0; i < 500; i++) {str1 = str1 + "\n" + "john";text2.setText(str1);try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}}};
		Thread t1 = new Thread(obj1);Thread t2 = new Thread(obj2);
		t1.start();t2.start();
	}
}
