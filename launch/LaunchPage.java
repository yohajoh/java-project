package launch;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import instructor.Instructor;
import student.studentProfile.studentProfile;

public class LaunchPage implements ActionListener{
	JFrame frame;
	ImageIcon icon1,icon2,icon3;
	JButton registerButton,loginButton,back,registerStudentButton,instructorRegisterButton,studentLoginButton,instructorLoginButton,backButton, studentSigninButton, instructorSigninButton;
	JLabel label1,label2,label3,label4,label5, userNameLabel1,userNameLabel2;
	JTextField userNameTextField;
	JPasswordField passwordField;
	
	ClassImplementInterface imp = new ClassImplementInterface();

	public LaunchPage(JFrame frame){
		this.frame = frame;
		
		label1 = new JLabel("wellcom to");
		label1.setBounds(220,0, 400,50);
		label1.setForeground(Color.cyan);
		label1.setFont(new Font("Consolas", Font.ITALIC,50));
		
		label2 = new JLabel("Adama Science And Technology");
		label2.setBounds(0,60, 900,50);
		label2.setForeground(Color.cyan);
		label2.setFont(new Font("Consolas", Font.ITALIC,50));
		
		label3 = new JLabel("University");
		label3.setForeground(Color.cyan);
		label3.setBounds(220,110, 400,50);
		label3.setFont(new Font("Consolas", Font.ITALIC,50));
		
		icon2 = new ImageIcon("C:\\desktop\\ASTU_Portal_System\\download.jpeg");
		label4 = new JLabel();
		label4.setBounds(250,100, 300,300);
		label4.setIcon(icon2);
		
		userNameLabel1 = new JLabel("User Name: ");
		userNameLabel1.setBounds(100,100, 200,40);
		userNameLabel1.setForeground(Color.cyan);
		userNameLabel1.setFont(new Font("Consolas", Font.ITALIC,30));
		userNameLabel1.setVisible(false);
		
		userNameLabel2 = new JLabel("Password: ");
		userNameLabel2.setBounds(115,140, 200,40);
		userNameLabel2.setForeground(Color.cyan);
		userNameLabel2.setFont(new Font("Consolas", Font.ITALIC,30));
		userNameLabel2.setVisible(false);
		
		registerButton = new JButton("Register");
		registerButton.setBounds(100,350, 150,40);
		registerButton.setFocusable(false);
		registerButton.setForeground(Color.darkGray);
		registerButton.setFont(new Font("Consolas",Font.BOLD,20));
		registerButton.addActionListener(this);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(500,350, 150,40);
		loginButton.setFocusable(false);
		loginButton.setForeground(Color.darkGray);
		loginButton.setFont(new Font("Consolas",Font.BOLD,20));
		loginButton.addActionListener(this);
		
		back = new JButton("<<Back");
		back.setBounds(50,370, 90,20);
		back.setFocusable(false);
		back.setForeground(Color.darkGray);
		back.setFont(new Font("Consolas",Font.BOLD,15));
		back.addActionListener(this);
		back.setVisible(false);
		
		registerStudentButton = new JButton("Student");
		registerStudentButton.setBounds(100,250, 150,40);
		registerStudentButton.setFocusable(false);
		registerStudentButton.setForeground(Color.darkGray);
		registerStudentButton.setFont(new Font("Consolas",Font.BOLD,20));
		registerStudentButton.addActionListener(this);
		registerStudentButton.setVisible(false);
		
		instructorRegisterButton = new JButton("Instructor");
		instructorRegisterButton.setBounds(500,250, 150,40);
		instructorRegisterButton.setFocusable(false);
		instructorRegisterButton.setForeground(Color.darkGray);
		instructorRegisterButton.setFont(new Font("Consolas",Font.BOLD,20));
		instructorRegisterButton.addActionListener(this);
		instructorRegisterButton.setVisible(false);
		
		studentLoginButton = new JButton("Student");
		studentLoginButton.setBounds(100,250, 150,40);
		studentLoginButton.setFocusable(false);
		studentLoginButton.setForeground(Color.darkGray);
		studentLoginButton.setFont(new Font("Consolas",Font.BOLD,20));
		studentLoginButton.addActionListener(this);
		studentLoginButton.setVisible(false);
		
		instructorLoginButton = new JButton("Instructor");
		instructorLoginButton.setBounds(500,250, 150,40);
		instructorLoginButton.setFocusable(false);
		instructorLoginButton.setForeground(Color.darkGray);
		instructorLoginButton.setFont(new Font("Consolas",Font.BOLD,20));
		instructorLoginButton.addActionListener(this);
		instructorLoginButton.setVisible(false);
		
		userNameTextField = new JTextField();
		userNameTextField.setBounds(300, 100, 200, 30);
		userNameTextField.setVisible(false);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(300, 140, 200, 30);
		passwordField.setVisible(false);
		
		studentSigninButton = new JButton("sign in");
		studentSigninButton.setBounds(400,200, 100,30);
		studentSigninButton.setFocusable(false);
		studentSigninButton.setForeground(Color.darkGray);
		studentSigninButton.setFont(new Font("Consolas",Font.BOLD,15));
		studentSigninButton.addActionListener(this);
		studentSigninButton.setVisible(false);
		
		instructorSigninButton = new JButton("sign in");
		instructorSigninButton.setBounds(400,200, 100,30);
		instructorSigninButton.setFocusable(false);
		instructorSigninButton.setForeground(Color.darkGray);
		instructorSigninButton.setFont(new Font("Consolas",Font.BOLD,15));
		instructorSigninButton.addActionListener(this);
		instructorSigninButton.setVisible(false);
		
		backButton = new JButton("<<Back");
		backButton.setBounds(50,370, 90,20);
		backButton.setFocusable(false);
		backButton.setForeground(Color.darkGray);
		backButton.setFont(new Font("Consolas",Font.BOLD,15));
		backButton.addActionListener(this);
		backButton.setVisible(false);
		
		icon1  = new ImageIcon("C:\\desktop\\ASTU_Portal_System\\download.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.black);
		frame.setSize(800, 450);
		frame.setIconImage(icon1.getImage());
		frame.setTitle("ASTU Portal System");
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		imp.addComponentToFrame(frame, label1,label2,label3,label4,userNameLabel1,userNameLabel2);
		imp.addComponentToFrame(frame, registerButton,loginButton,back,registerStudentButton,instructorRegisterButton,studentLoginButton,instructorLoginButton,backButton,studentSigninButton,instructorSigninButton);
		imp.addComponentToFrame(frame, userNameTextField,passwordField);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==registerButton) {
			imp.componentDisappired(registerButton,loginButton);
			imp.componentDisappired(label4);
			imp.componentappired(back,registerStudentButton,instructorRegisterButton);
		}
		if(e.getSource()==loginButton) {
			imp.componentDisappired(registerButton,loginButton);
			imp.componentDisappired(label4);
			imp.componentappired(back,studentLoginButton,instructorLoginButton);
		}
		if(e.getSource()==back) {
			imp.componentappired(registerButton,loginButton);
			imp.componentappired(label4);
			imp.componentDisappired(back,registerStudentButton,instructorRegisterButton);
			imp.componentDisappired(back,studentLoginButton,instructorLoginButton);
		}
		if(e.getSource()==registerStudentButton) {
			imp.componentDisappired(label1,label2,label3);
			imp.componentDisappired(registerStudentButton,instructorRegisterButton,back);
			new StudentRegistration(frame);
		}
		if(e.getSource()==instructorRegisterButton) {
			imp.componentDisappired(label1,label2,label3);
			imp.componentDisappired(registerStudentButton,instructorRegisterButton,back);
			new InstructorRegistration(frame);
		}
		if(e.getSource()==studentLoginButton) {
			imp.componentDisappired(label1,label2,label3);
			imp.componentDisappired(studentLoginButton,instructorLoginButton,back);
			imp.componentappired(userNameLabel1,userNameLabel2);
			imp.componentappired(userNameTextField);
			passwordField.setVisible(true);
			imp.componentappired(studentSigninButton,backButton);
		}
		if(e.getSource()==instructorLoginButton) {
			imp.componentDisappired(label1,label2,label3);
			imp.componentDisappired(studentLoginButton,instructorLoginButton,back);
			imp.componentappired(userNameLabel1,userNameLabel2);
			imp.componentappired(userNameTextField);
			passwordField.setVisible(true);
			imp.componentappired(instructorSigninButton,backButton);
		}
		if(e.getSource()==backButton) {
			imp.componentDisappired(backButton,studentSigninButton,instructorSigninButton);
			imp.componentDisappired(userNameTextField);
			passwordField.setVisible(false);
			imp.componentDisappired(userNameLabel1,userNameLabel2);
			imp.componentappired(label1,label2,label3);
			imp.componentappired(studentLoginButton,instructorLoginButton,back);
		}
		if(e.getSource()==studentSigninButton) {
			if(imp.checkUsernameAndPassword("text_1", userNameTextField.getText(), passwordField.getText())) {
				imp.componentDisappired(userNameLabel1,userNameLabel2);
				userNameTextField.setVisible(false);
				passwordField.setVisible(false);
				studentSigninButton.setVisible(false);
				backButton.setVisible(false);
				new studentProfile(frame,userNameTextField.getText());
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid username or password!!!", "", JOptionPane.ERROR_MESSAGE);
			}
		}
		if(e.getSource()==instructorSigninButton) {
			if(imp.checkUsernameAndPassword("text_3", userNameTextField.getText(), passwordField.getText())) {
				imp.componentDisappired(userNameLabel1,userNameLabel2);
				userNameTextField.setVisible(false);
				passwordField.setVisible(false);
				instructorSigninButton.setVisible(false);
				backButton.setVisible(false);
				new Instructor(frame, userNameTextField.getText());
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid username or password", "", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}