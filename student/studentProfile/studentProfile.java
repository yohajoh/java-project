package student.studentProfile;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

import launch.ClassImplementInterface;
import launch.LaunchPage;

public class studentProfile implements ActionListener{
	JFrame frame;
	String[][] items;
	String username,header[], array1[]= {"Profile","Logout"}, array2[] = {"Student Profile","Enrollment","Academic History","Dormitory"};
	JLabel label1, label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16;
	JPanel panel3, panel4,panel1, panel2, panel5, panel6,panel7;
	JComboBox comboBox1, comboBox2, comboBox3;
	JButton button1,button2,button3,button4,button5,button6,button7,button8, enrollButton, transcriptButton, showBoton;
	JButton studentProfile,courseEnrollment,academicHistory,dormitory;
	JRadioButton radioButton1, radioButton2, radioButton3,radioButton4,radioButton5,radioButton6;
	ClassImplementInterface imp;
	String data[] = new String[7];
	String singleData[] = new String[9];
	public studentProfile(JFrame frame, String username){
		this.frame = frame;
		this.username = username;
		imp = new ClassImplementInterface();
		
		comboBox1 = new JComboBox(array1);
		comboBox1.setBounds(1220,0,50,30);
		comboBox1.addActionListener(this);
		
		Border border1 = BorderFactory.createLineBorder(new Color(100,200,255), 1);
		label1 = new JLabel("Photo: ");
		label1.setBounds(20,120,200,260);
		label1.setBorder(border1);
		
		radioButton1 = new JRadioButton("Java");
		radioButton1.setBounds(20, 20, 700, 30);
		radioButton1.setBackground(new Color(240,255,255));
		radioButton2 = new JRadioButton("Python");
		radioButton2.setBounds(20, 60, 700, 30);
		radioButton2.setBackground(new Color(240,255,255));
		radioButton3 = new JRadioButton("C++");
		radioButton3.setBounds(20, 100, 700, 30);
		radioButton3.setBackground(new Color(240,255,255));
		radioButton4 = new JRadioButton("Logic");
		radioButton4.setBounds(20, 140, 700, 30);
		radioButton4.setBackground(new Color(240,255,255));
		radioButton5 = new JRadioButton("Mathematics");
		radioButton5.setBounds(20, 180, 700, 30);
		radioButton5.setBackground(new Color(240,255,255));
		radioButton6 = new JRadioButton("Database");
		radioButton6.setBounds(20, 220, 700, 30);
		radioButton6.setBackground(new Color(240,255,255));
		
		button1 = createButton(new JButton("Personal"),0, 50, 130, 30);
		button2 = createButton(new JButton("Applicant"),130, 50, 130, 30);
		button3 = createButton(new JButton("Contact Address"),260, 50, 130, 30);
		button4 = createButton(new JButton("Emergency Contact"),390, 50, 130, 30);
		button5 = createButton(new JButton("Family Background"),520, 50, 130, 30);
		button6 = createButton(new JButton("Education"),650, 50, 130, 30);
		button7 = createButton(new JButton("Experience"),780, 50, 130, 30);
		button8 = createButton(new JButton("Program Preference"),910, 50, 90, 30);
		enrollButton = createButton(new JButton("Enroll"),600, 260, 100, 30);
		enrollButton.addActionListener(this);
		
		transcriptButton = createButton(new JButton("Transcript"),0, 50, 500, 30);
		transcriptButton.addActionListener(this);
		showBoton = createButton(new JButton("Show Result"),500, 50, 500, 30);
		showBoton.addActionListener(this);
		
		panel1 = new JPanel();
		panel1.setBounds(0, 30, 250, 730);
		panel1.setBackground(new Color(240,255,255));
		panel1.setBorder(BorderFactory.createLineBorder(new Color(100,200,255),1));
		panel1.setLayout(null);		
		
		panel2 = new JPanel();
		panel2.setBounds(0, 0, 1400, 30);
		panel2.setBackground(new Color(100,170,255));
		panel2.setLayout(null);
		panel2.add(comboBox1);
		
		panel3 = new JPanel();
		panel3.setBounds(0, 0, 1000, 50);
		panel3.setBackground(new Color(100,170,255));
		
		panel4 = new JPanel();
		panel4.setBounds(260, 50, 1000, 500);
		panel4.setLayout(null);
		panel4.setVisible(false);
		panel4.add(panel3);
		panel4.add(button1);
		panel4.add(button2);
		panel4.add(button3);
		panel4.add(button4);
		panel4.add(button5);
		panel4.add(button6);
		panel4.add(button7);
		panel4.add(button8);
		panel4.add(label1);
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),270,120,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),270,160,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),270,200,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),270,240,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),270,280,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),270,320,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),470,120,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),470,160,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),470,200,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),470,240,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),470,280,300,40));
		panel4.add(imp.createLabel(new JLabel("User: "+this.username), Color.black, new Font("Consolas",Font.BOLD,15),470,320,300,40));
		panel4.setBorder(BorderFactory.createLineBorder(new Color(200,200,200), 1));
		
		panel5 = new JPanel();
		panel5.setBounds(300, 150, 800, 300);
		panel5.setBackground(new Color(240,255,255));
		panel5.setBorder(BorderFactory.createLineBorder(new Color(100,200,255), 1));
		panel5.setLayout(null);
		panel5.setVisible(false);
		panel5.add(radioButton1);
		panel5.add(radioButton2);
		panel5.add(radioButton3);
		panel5.add(radioButton4);
		panel5.add(radioButton5);
		panel5.add(radioButton6);
		panel5.add(enrollButton);
		
		panel7 = new JPanel();
		panel7.setBounds(0, 0, 1000, 50);
		panel7.setBackground(new Color(100,170,255));
		
		try {
			data = imp.singleDataFileReader("text_7", this.username);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		label14 = new JLabel("Course");
		label14.setBounds(100,100,200,40);
		label14.setFont(new Font("Consolas",Font.BOLD,20));
		label14.setVisible(false);
		label15 = new JLabel("Total");
		label15.setBounds(300,100,200,40);
		label15.setFont(new Font("Consolas",Font.BOLD,20));
		label15.setVisible(false);
		label16 = new JLabel("Grade");
		label16.setBounds(500,100,200,40);
		label16.setFont(new Font("Consolas",Font.BOLD,20));
		label16.setVisible(false);
		label8 = new JLabel(data[1]);
		label8.setBounds(100,160,200,40);
		label8.setFont(new Font("Consolas",Font.BOLD,20));
		label8.setVisible(false);
		label9 = new JLabel(data[2]);
		label9.setBounds(100,200,200,40);
		label9.setFont(new Font("Consolas",Font.BOLD,20));
		label9.setVisible(false);
		label10 = new JLabel(data[3]);
		label10.setBounds(100,240,200,40);
		label10.setFont(new Font("Consolas",Font.BOLD,20));
		label10.setVisible(false);
		label11 = new JLabel(data[4]);
		label11.setBounds(100,280,200,40);
		label11.setFont(new Font("Consolas",Font.BOLD,20));
		label11.setVisible(false);
		label12 = new JLabel(data[5]);
		label12.setBounds(100,320,200,40);
		label12.setFont(new Font("Consolas",Font.BOLD,20));
		label12.setVisible(false);
		label13 = new JLabel(data[6]);
		label13.setBounds(100,360,200,40);
		label13.setFont(new Font("Consolas",Font.BOLD,20));
		label13.setVisible(false);
		
		panel6 = new JPanel();
		panel6.setBounds(260, 50, 1000, 500);
		panel6.setLayout(null);
		panel6.setVisible(false);
		panel6.add(panel7);
		panel6.add(transcriptButton);
		panel6.add(showBoton);
		panel6.setBorder(BorderFactory.createLineBorder(new Color(200,200,200), 1));
		panel6.add(label8);
		panel6.add(label9);
		panel6.add(label10);
		panel6.add(label11);
		panel6.add(label12);
		panel6.add(label13);
		panel6.add(label14);
		panel6.add(label15);
		panel6.add(label16);

		studentProfile = createButton(new JButton("StudentProfile"),0, 100, 250, 30);
		studentProfile.addActionListener(this);
		courseEnrollment = createButton(new JButton("CourseEnrollment"),0, 150, 250, 30);
		courseEnrollment.addActionListener(this);
		academicHistory  = createButton(new JButton("AcademicHistory"),0, 200, 250, 30);
		academicHistory.addActionListener(this);
		dormitory = createButton(new JButton("Dormitory"),0, 250, 250, 30);
		dormitory.addActionListener(this);
		panel1.add(studentProfile);
		panel1.add(courseEnrollment);
		panel1.add(academicHistory);
		panel1.add(dormitory);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(1400, 730);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel4);
		frame.add(panel5);
		frame.add(panel6);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox1) {
			if(comboBox1.getSelectedItem().equals("Logout")) {
				panel1.setVisible(false);
				panel2.setVisible(false);
				panel4.setVisible(false);
				label1.setVisible(false);
				new LaunchPage(frame);
			}
			if(comboBox1.getSelectedItem().equals("Profile")) {
				System.out.println("gdsjfsdsjkhjkasjhas");	
			}
		}
		if(e.getSource()==studentProfile) {
			panel5.setVisible(false);
			panel4.setVisible(true);
			panel6.setVisible(false);
		}
		if(e.getSource()==courseEnrollment) {
			panel4.setVisible(false);
			panel5.setVisible(true);
			panel6.setVisible(false);
		}
		if(e.getSource()==academicHistory) {
			panel4.setVisible(false);
			panel5.setVisible(false);
			panel6.setVisible(true);
		}
		if(e.getSource()==dormitory) {
	
		}
		if(e.getSource()==enrollButton) {
			String text1 = "",text2 = "",text3 = "",text4 = "",text5 = "",text6 = "";
			if(radioButton1.isSelected()) {
				text1 = radioButton1.getText();
			}
			if(radioButton2.isSelected()) {
				text2 = radioButton2.getText();
			}
			if(radioButton3.isSelected()) {
				text3 = radioButton3.getText();
			}
			if(radioButton4.isSelected()) {
				text4 = radioButton4.getText();
			}
			if(radioButton5.isSelected()) {
				text5 = radioButton5.getText();
			}
			if(radioButton6.isSelected()) {
				text6 = radioButton6.getText();
			}
			imp.fileWriter("text_7",true, this.username,text1,text2,text3,text4,text5,text6);
			JOptionPane.showMessageDialog(null, "Successfully Registered The Courses!!!", "Course Registration", JOptionPane.INFORMATION_MESSAGE);
			
		}
		if(e.getSource()==transcriptButton) {

			label8.setVisible(true);
			label9.setVisible(true);
			label10.setVisible(true);
			label11.setVisible(true);
			label12.setVisible(true);
			label13.setVisible(true);
			label14.setVisible(true);
			label15.setVisible(true);
			label16.setVisible(true);
			
		}
		if(e.getSource()==showBoton) {
			label8.setVisible(false);
			label9.setVisible(false);
			label10.setVisible(false);
			label11.setVisible(false);
			label12.setVisible(false);
			label13.setVisible(false);
			label14.setVisible(false);
			label15.setVisible(false);
			label16.setVisible(false);
			System.out.println("kkkkkkkkkkkkkk");
		}
	}
	public JButton createButton(JButton button,int x, int y, int width, int height) {
		button.setBounds(x, y, width, height);
		button.setFocusable(false);
		return button;
	}
}
