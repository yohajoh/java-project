package launch;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InstructorRegistration implements ActionListener {
	JFrame frame;
	JButton back,submitButton;
	JLabel label1 = new JLabel("Full Name: ");
	JLabel label2 = new JLabel("Gender: ");
	JLabel label3 = new JLabel("Data Of Birth: ");
	JLabel label4 = new JLabel("Salary: ");
	JLabel label5 = new JLabel("Teaching Course: ");
	JLabel label6 = new JLabel("Create Password: ");
	
	JTextField textField1 = new JTextField();
	JTextField textField2 = new JTextField();
	JTextField textField3 = new JTextField();
	JTextField textField4 = new JTextField();
	JTextField textField5 = new JTextField();
	String course[] = {"Java", "Python","C++","Logic","mathematics","Database","Data Structure","Design And Algorithm","Gneral Physics","Gneral Chemistry","Psychology","Digital Logic"};
	JComboBox comboBox1;
	int counter;
	
	ClassImplementInterface imp = new ClassImplementInterface();
	InstructorRegistration(JFrame frame){
		this.frame = frame;
		back = new JButton("<<Back");
		back.setBounds(50,600, 90,20);
		back.setFocusable(false);
		back.addActionListener(this);
		
		submitButton = new JButton("submitButton");
		submitButton.setBounds(350,340, 150,30);
		submitButton.setFocusable(false);
		submitButton.addActionListener(this);
		
		comboBox1 = new JComboBox(course);
		comboBox1.setBounds(300,260,200,30);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.add(back);
		frame.add(createLabel(label1,new Font("Consolas",Font.PLAIN,15), Color.cyan, 100,100,200,40));
		frame.add(createLabel(label2,new Font("Consolas",Font.PLAIN,15),Color.cyan, 100,140,200,40));
		frame.add(createLabel(label3,new Font("Consolas",Font.PLAIN,15),  Color.cyan,100,180,200,40));
		frame.add(createLabel(label4,new Font("Consolas",Font.PLAIN,15),  Color.cyan,100,220,200,40));
		frame.add(createLabel(label5,new Font("Consolas",Font.PLAIN,15), Color.cyan, 100,260,200,40));
		frame.add(createLabel(label6,new Font("Consolas",Font.PLAIN,15), Color.cyan, 100,300,200,40));
		
		frame.add(createTextField(textField1, 300,100,200,30));
		frame.add(createTextField(textField2, 300,140,200,30));
		frame.add(createTextField(textField3,300,180,200,30));
		frame.add(createTextField(textField4,300,220,200,30));
		frame.add(comboBox1);
		frame.add(createTextField(textField5,300,300,200,30));
		frame.add(submitButton);
		frame.setVisible(true);
		
		counter = imp.usernameAutoGenerateMethod("text_3");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back) {
			imp.componentDisappired(label1,label2,label3,label4,label5,label6);
			imp.componentDisappired(textField1,textField2,textField3,textField4,textField5);
			imp.componentDisappired(back,submitButton);
			comboBox1.setVisible(false);
			textField5.setVisible(false);
			new LaunchPage(frame);
		}
		if(e.getSource()==submitButton) {
			boolean bool = true;
			imp.fileWriter("text_3", true, "ins/"+counter+"/au",textField5.getText(), textField1.getText(),textField2.getText(),textField3.getText(),textField4.getText());
			imp.fileWriter("text_5", true, "ins/"+counter+"/au",comboBox1.getSelectedItem());
			String [][] data = imp.allDataFileReader("text_6");
			for(int j = 0; j<data.length;j++) {
				if(data[j][0].equals(comboBox1.getSelectedItem())) {
					bool=false;
					break;
				}
			}
			if(bool!=false)
				imp.fileWriter("text_6", true, comboBox1.getSelectedItem(),0,0,0,0,0,0);
			JOptionPane.showMessageDialog(null, "Successfully Submitted!!!\n\nUsername: "+"ins/"+counter+"/au\nPassword: "+textField5.getText(), "", JOptionPane.INFORMATION_MESSAGE);
			imp.disappiedTextFromTextfield(textField1,textField2,textField3,textField4,textField5);
			counter++;
		}
	}
	
	public JLabel createLabel(JLabel label, Font font, Color color, int x,int y,int width,int height) {
		label.setBounds(x, y, width, height);
		label.setFont(font);
		label.setForeground(color);
		return label;
	}
	public JTextField createTextField(JTextField textFeild1, int x,int y,int width,int height) {
		textFeild1.setBounds(x, y, width, height);
		return textFeild1;
	}
}
