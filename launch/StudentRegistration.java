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

public class StudentRegistration implements ActionListener{
	JFrame frame;
	JButton backButton1, submitButton;
	JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13, label14,label15,label16,label17,label18, label19, label20, label21, label22, label23,label24;
	JTextField textField1, textField2, textField3,textField4,textField5,textField6, textField7, textField8, textField9,textField10,textField11,textField12,textField13,textField14,textField15,textField16,textField17,textField18,textField19;
	JComboBox comboBox1, comboBox2, comboBox3, comboBox4;
	
	String[] array2 = {"Ethiopia", "United State", "Britsh", "Japan", "China","America"};
	String[] array3 = {"Amhara", "Oromia", "Tygray", "Harari","Benishangulgumuze", "South Ethiopia","Gambella","Somalia","Sidama","Afar", };
	int counter = 1;
	
	ClassImplementInterface imp = new ClassImplementInterface();
	public StudentRegistration(JFrame frame){
		this.frame = frame;
		frame.setSize(1000, 700);
		
		label1 = new JLabel("First Name: ");
		label1.setBounds(50, 50, 150, 40);
		label1.setForeground(Color.cyan);
		label1.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label2 = new JLabel("Middle Name: ");
		label2.setBounds(50, 90, 150, 40);
		label2.setForeground(Color.cyan);
		label2.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label3 = new JLabel("Last Name: ");
		label3.setBounds(50, 130, 150, 40);
		label3.setForeground(Color.cyan);
		label3.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label4 = new JLabel("Genger: ");
		label4.setBounds(50, 170, 150, 40);
		label4.setForeground(Color.cyan);
		label4.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label5 = new JLabel("Nationality: ");
		label5.setBounds(50, 210, 150, 40);
		label5.setForeground(Color.cyan);
		label5.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label6 = new JLabel("Region: ");
		label6.setBounds(50, 250, 150, 40);
		label6.setForeground(Color.cyan);
		label6.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label7= new JLabel("Marital Status: ");
		label7.setBounds(50, 290, 150, 40);
		label7.setForeground(Color.cyan);
		label7.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label8 = new JLabel("Date_Of_Birth: ");
		label8.setBounds(50, 330, 150, 40);
		label8.setForeground(Color.cyan);
		label8.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label9 = new JLabel("Place_Of_Birth: ");
		label9.setBounds(50, 370, 150, 40);
		label9.setForeground(Color.cyan);
		label9.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label10 = new JLabel("Disability: ");
		label10.setBounds(50, 410, 150, 40);
		label10.setForeground(Color.cyan);
		label10.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label11 = new JLabel("Academic Year: ");
		label11.setBounds(50, 450, 150, 40);
		label11.setForeground(Color.cyan);
		label11.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label12= new JLabel("Registration Number: ");
		label12.setBounds(50, 490, 150, 40);
		label12.setForeground(Color.cyan);
		label12.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label13 = new JLabel("Matriculation Result: ");
		label13.setBounds(50, 530, 150, 40);
		label13.setForeground(Color.cyan);
		label13.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label14 = new JLabel("Mobile: ");
		label14.setBounds(500, 50, 150, 40);
		label14.setForeground(Color.cyan);
		label14.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label15 = new JLabel("Email: ");
		label15.setBounds(500, 90, 150, 40);
		label15.setForeground(Color.cyan);
		label15.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label16 = new JLabel("Zone: ");
		label16.setBounds(500, 130, 150, 40);
		label16.setForeground(Color.cyan);
		label16.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label17 = new JLabel("Wereda: ");
		label17.setBounds(500, 170, 150, 40);
		label17.setForeground(Color.cyan);
		label17.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label18 = new JLabel("Kebele: ");
		label18.setBounds(500, 210, 150, 40);
		label18.setForeground(Color.cyan);
		label18.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label19 = new JLabel("Emergency Contact");
		label19.setBounds(600, 250, 300, 40);
		label19.setForeground(Color.cyan);
		label19.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label20 = new JLabel("Full Name: ");
		label20.setBounds(500, 290, 300, 40);
		label20.setForeground(Color.cyan);
		label20.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label21 = new JLabel("Relationship: ");
		label21.setBounds(500, 330, 300, 40);
		label21.setForeground(Color.cyan);
		label21.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label22 = new JLabel("Mobile: ");
		label22.setBounds(500, 370, 300, 40);
		label22.setForeground(Color.cyan);
		label22.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label23 = new JLabel("Date Of Birth: ");
		label23.setBounds(500, 410, 300, 40);
		label23.setForeground(Color.cyan);
		label23.setFont(new Font("Consolas", Font.BOLD, 20));
		
		label24 = new JLabel("Create Password: ");
		label24.setBounds(500, 530, 200, 40);
		label24.setForeground(Color.cyan);
		label24.setFont(new Font("Consolas", Font.BOLD, 20));
		
		textField1 = new JTextField();
		textField1.setBounds(220, 50, 200, 30);
		textField1.setFont(new Font("Consolas",Font.BOLD,15));

		textField2 = new JTextField();
		textField2.setBounds(220, 90, 200, 30);
		textField2.setFont(new Font("Consolas",Font.BOLD,15));

		textField3 = new JTextField();
		textField3.setBounds(220, 130, 200, 30);
		textField3.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField4 = new JTextField();
		textField4.setBounds(220, 290, 200, 30);
		textField4.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField5 = new JTextField();
		textField5.setBounds(220, 330, 200, 30);
		textField5.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField6 = new JTextField();
		textField6.setBounds(220, 370, 200, 30);
		textField6.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField7 = new JTextField();
		textField7.setBounds(220, 450, 200, 30);
		textField7.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField8 = new JTextField();
		textField8.setBounds(220, 490, 200, 30);
		textField8.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField9 = new JTextField();
		textField9.setBounds(220, 530, 200, 30);
		textField9.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField10 = new JTextField();
		textField10.setBounds(700, 50, 200, 30);
		textField10.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField11 = new JTextField();
		textField11.setBounds(700, 90, 200, 30);
		textField11.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField12 = new JTextField();
		textField12.setBounds(700, 130, 200, 30);
		textField12.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField13 = new JTextField();
		textField13.setBounds(700, 170, 200, 30);
		textField13.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField14 = new JTextField();
		textField14.setBounds(700, 210, 200, 30);
		textField14.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField15 = new JTextField();
		textField15.setBounds(700, 290, 200, 30);
		textField15.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField16 = new JTextField();
		textField16.setBounds(700, 330, 200, 30);
		textField16.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField17 = new JTextField();
		textField17.setBounds(700, 370, 200, 30);
		textField17.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField18 = new JTextField();
		textField18.setBounds(700, 410, 200, 30);
		textField18.setFont(new Font("Consolas",Font.BOLD,15));
		
		textField19 = new JTextField();
		textField19.setBounds(700, 530, 200, 30);
		textField19.setFont(new Font("Consolas",Font.BOLD,15));
		
		comboBox1 = new JComboBox(Constants1.values());
		comboBox1.setBounds(220, 170, 200, 30);
		comboBox1.setEditable(true);
		
		comboBox2 = new JComboBox(array2);
		comboBox2.setBounds(220, 210, 200, 30);
		comboBox2.setEditable(true);
		
		comboBox3 = new JComboBox(array3);
		comboBox3.setBounds(220, 250, 200, 30);
		comboBox3.setEditable(true);
		
		comboBox4 = new JComboBox(Constants2.values());
		comboBox4.setBounds(220, 410, 200, 30);
		comboBox4.setEditable(true);
		
		backButton1 = new JButton("<<Back");
		backButton1.setBounds(50,630, 90,20);
		backButton1.setFocusable(false);
		backButton1.setForeground(Color.darkGray);
		backButton1.setFont(new Font("Consolas",Font.BOLD,15));
		backButton1.addActionListener(this);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(700,590, 120,30);
		submitButton.setFocusable(false);
		submitButton.setForeground(Color.darkGray);
		submitButton.setFont(new Font("Consolas",Font.BOLD,20));
		submitButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,700);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		imp.addComponentToFrame(frame, label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,
										label15,label16,label17,label18,label19,label20,label21,label22,label23,label24);
		imp.addComponentToFrame(frame, textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10,
										textField11,textField12,textField13,textField14,textField15,textField16,textField17,textField18,textField19);
		imp.addComponentToFrame(frame, comboBox1,comboBox2,comboBox3,comboBox4);
		imp.addComponentToFrame(frame, backButton1,submitButton);
		
		counter = new ClassImplementInterface().usernameAutoGenerateMethod("text_1");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==backButton1) {
			imp.componentDisappired(label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,
					label15,label16,label17,label18,label19,label20,label21,label22,label23,label24);
			imp.componentDisappired( textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10,
					textField11,textField12,textField13,textField14,textField15,textField16,textField17,textField18,textField19);
			imp.componentDisappired( comboBox1,comboBox2,comboBox3,comboBox4);
			imp.componentDisappired( backButton1,submitButton);
			frame.setSize(800, 450);
			new LaunchPage(frame);
		}
		if(e.getSource()==submitButton) {
			
			ClassImplementInterface imp = new ClassImplementInterface();
			imp.fileWriter("text_1",true, "ugr/"+counter+"/15",textField19.getText(),textField1.getText(),textField2.getText(),textField3.getText(),
					comboBox1.getSelectedItem(),comboBox2.getSelectedItem(),comboBox3.getSelectedItem(),
					textField4.getText(),textField5.getText(),textField6.getText(),comboBox4.getSelectedItem(),
					textField7.getText(),textField8.getText(),textField9.getText(),textField10.getText(),
					textField11.getText(),textField12.getText(),textField13.getText(),textField14.getText(),"section"+imp.section("text_1"));
			
			JOptionPane.showMessageDialog(null, "Successfully Submitted!!!\n\nUsername: "+"ugr/"+counter+"/15\nPassword: "+textField19.getText(), "", JOptionPane.INFORMATION_MESSAGE);
			
			imp.fileWriter("text_2", true,  "ugr/"+counter+"/15",textField15.getText(),textField16.getText(),textField17.getText(),textField18.getText());
			imp.disappiedTextFromTextfield(textField1,textField2,textField3,textField4,textField5,textField6,textField7,textField8,textField9,textField10,
										textField11,textField12,textField13,textField14,textField15,textField16,textField17,textField18,textField19);
			counter++;
		}
	}
}

enum Constants1{
	Male, Female
}
enum Constants2{
	Distability, No_Disability
}


