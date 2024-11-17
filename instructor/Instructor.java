package instructor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import launch.ClassImplementInterface;
import launch.LaunchPage;

public class Instructor implements ActionListener{
	ClassImplementInterface imp = new ClassImplementInterface();
	JFrame frame;
	String username;
	JLabel labelForUpdate1,labelForUpdate2,labelForUpdate3,labelForUpdate4,labelForUpdate5,label1,label2,label3,label4,label5,label6;
	JPanel panel,panel1,panel2, panel3;
	JButton logoutbutton, Ok1, Ok2, Ok3, UpdateButton, button;
	JMenuBar menuBar;
	JMenu menu1, menu2, menu3;
	JComboBox comboBox1, comboBox2, comboBox3, comboBox4;
	String array1[] = {"create students assisment"};
	String array2[] = {"Show Student Result And Update:","section1","section2","section3","section4","section5","section6"};
	JTextField textField1,textField2,textField3,textField4,textField5,textFieldForUpdate1,textFieldForUpdate2,textFieldForUpdate3,textFieldForUpdate4,textFieldForUpdate5;
	JTable table;
	JScrollPane scroll;
	String column[] = {"Full Name","Quiz", "Assignment","Test","Mid","Final","Total"};
	
	public Instructor(JFrame frame, String username){
		this.frame = frame;
		this.username = username;
		
		logoutbutton = new JButton("Logout");
		logoutbutton.setBounds(1200,0,80,30);
		logoutbutton.setFocusable(false);
		logoutbutton.addActionListener(this);
		
		Ok1 = new JButton("Ok");
		Ok1.setBounds(700, 30, 50, 30);
		Ok1.setFocusable(false);
		Ok1.addActionListener(this);
		
		Ok2 = new JButton("Ok");
		Ok2.setBounds(1220,30,50,30);
		Ok2.setFocusable(false);
		Ok2.addActionListener(this);
		
		Ok3 = new JButton("Ok");
		Ok3.setBounds(400, 300, 100, 30);
		Ok3.setFocusable(false);
		Ok3.addActionListener(this);
		
		button = new JButton("Click");
		button.setBounds(1100, 650, 100, 30);
		button.setFocusable(false);
		button.addActionListener(this);
		
		UpdateButton = new JButton("Update");
		UpdateButton.setBounds(120, 340, 100, 30);
		UpdateButton.setFocusable(false);
		UpdateButton.addActionListener(this);
		UpdateButton.setVisible(false);
		UpdateButton.addActionListener(this);
		
		label1 = new JLabel("OutOf: ");
		label1.setBounds(300, 0, 200, 40);
		label2 = new JLabel("Quiz: ");
		label2.setBounds(20, 50, 200, 40);
		label3 = new JLabel("Assignment: ");
		label3.setBounds(20, 100, 200, 40);
		label4 = new JLabel("test: ");
		label4.setBounds(20, 150, 200, 40);
		label5 = new JLabel("mid: ");
		label5.setBounds(20, 200, 200, 40);
		label6 = new JLabel("final: ");
		label6.setBounds(20, 250, 200, 40);
		
		labelForUpdate1 = new JLabel("Quiz: ");
		labelForUpdate1.setBounds(20, 70, 100, 40);
		labelForUpdate1.setVisible(false);
		labelForUpdate2 = new JLabel("Assignment: ");
		labelForUpdate2.setBounds(20, 120, 100, 40);
		labelForUpdate2.setVisible(false);
		labelForUpdate3 = new JLabel("test: ");
		labelForUpdate3.setBounds(20, 170, 100, 40);
		labelForUpdate3.setVisible(false);
		labelForUpdate4 = new JLabel("mid: ");
		labelForUpdate4.setBounds(20, 220, 100, 40);
		labelForUpdate4.setVisible(false);
		labelForUpdate5 = new JLabel("final: ");
		labelForUpdate5.setBounds(20, 270, 100, 40);
		labelForUpdate5.setVisible(false);
		
		textField1 = new JTextField();
		textField1.setBounds(300, 50, 200, 30);
		textField2 = new JTextField();
		textField2.setBounds(300, 100, 200, 30);
		textField3 = new JTextField();
		textField3.setBounds(300, 150, 200, 30);
		textField4 = new JTextField();
		textField4.setBounds(300, 200, 200, 30);
		textField5 = new JTextField();
		textField5.setBounds(300, 250, 200, 30);
		
		textFieldForUpdate1 = new JTextField();
		textFieldForUpdate1.setBounds(120, 80, 100, 30);
		textFieldForUpdate1.setVisible(false);
		textFieldForUpdate2 = new JTextField();
		textFieldForUpdate2.setBounds(120, 130, 100, 30);
		textFieldForUpdate2.setVisible(false);
		textFieldForUpdate3 = new JTextField();
		textFieldForUpdate3.setBounds(120, 180, 100, 30);
		textFieldForUpdate3.setVisible(false);
		textFieldForUpdate4 = new JTextField();
		textFieldForUpdate4.setBounds(120, 230, 100, 30);
		textFieldForUpdate4.setVisible(false);
		textFieldForUpdate5 = new JTextField();
		textFieldForUpdate5.setBounds(120, 280, 100, 30);
		textFieldForUpdate5.setVisible(false);
		
		panel = new JPanel();
		panel.setBounds(300, 200, 800, 350);
		panel.setBackground(new Color(240,255,255));
		panel.setBorder(BorderFactory.createLineBorder(new Color(100,200,255), 1));
		panel.setLayout(null);
		panel.add(label1);panel.add(label2);panel.add(label3);panel.add(label4);panel.add(label5);panel.add(label6);panel.add(Ok3);
		panel.add(textField1);panel.add(textField2);panel.add(textField3);panel.add(textField4);panel.add(textField5);
		panel.setVisible(false);
		
		panel1 = new JPanel();
		panel1.setBounds(0, 0, 1400, 30);
		panel1.setBackground(new Color(100,170,255));
		panel1.setLayout(null);	
		panel1.add(logoutbutton);
		
		panel2 = new JPanel();
		panel2.setBounds(0,30, 250, 730);
		panel2.setBackground(new Color(240,255,255));
		panel2.setBorder(BorderFactory.createLineBorder(new Color(100,200,255), 1));
		panel2.setLayout(null);
		panel2.add(labelForUpdate1);
		panel2.add(labelForUpdate2);
		panel2.add(labelForUpdate3);
		panel2.add(labelForUpdate4);
		panel2.add(labelForUpdate5);
		panel2.add(textFieldForUpdate1);
		panel2.add(textFieldForUpdate2);
		panel2.add(textFieldForUpdate3);
		panel2.add(textFieldForUpdate4);
		panel2.add(textFieldForUpdate5);
		panel2.add(UpdateButton);
		
		panel3 = new JPanel();
		panel3.setBounds(270,80, 990, 570);
		panel3.setBackground(new Color(240,255,255));
		panel3.setBorder(BorderFactory.createLineBorder(new Color(100,200,255), 1));
		panel3.setLayout(null);
		panel3.setVisible(false);
	
		comboBox1 = new JComboBox(array1);
		comboBox1.setBounds(250, 30, 450, 30);
		comboBox1.addActionListener(this);
		
		comboBox2 = new JComboBox(array2);
		comboBox2.setBounds(750, 30, 470, 30);
		comboBox2.addActionListener(this);
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.setSize(1400, 730);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel);
		frame.add(comboBox1);
		frame.add(Ok1);
		frame.add(comboBox2);
		frame.add(Ok2);
		frame.add(button);
	}
	
	String[][] filteredData;
	String section = "";
	String s1 = "";
	int b1;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logoutbutton) {
			panel1.setVisible(false);
			panel2.setVisible(false);
			panel3.setVisible(false);
			comboBox1.setVisible(false);
			comboBox2.setVisible(false);
			Ok1.setVisible(false);
			Ok2.setVisible(false);
			logoutbutton.setVisible(false);
			panel1.setVisible(false);
			new LaunchPage(frame);
		}
		
		if(e.getSource()==Ok1) {
			if(comboBox1.getSelectedItem().equals("create students assisment")) {
				panel3.setVisible(false);
				panel.setVisible(true);
				labelForUpdate1.setVisible(false);
				labelForUpdate2.setVisible(false);
				labelForUpdate3.setVisible(false);
				labelForUpdate4.setVisible(false);
				labelForUpdate5.setVisible(false);
				textFieldForUpdate1.setVisible(false);
				textFieldForUpdate2.setVisible(false);
				textFieldForUpdate3.setVisible(false);
				textFieldForUpdate4.setVisible(false);
				textFieldForUpdate5.setVisible(false);
				UpdateButton.setVisible(false);
			}
		}
		if(e.getSource()==Ok2) {
			section = comboBox2.getSelectedItem().toString();
			int s=0;
			String s1 = "", single[];
			String[][] j = imp.allDataFileReader("text_4");
			try {
				single = imp.singleDataFileReader("text_5", this.username);
				s1 = single[1];
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			filteredData = dataFilter(j,section,s1);
				panel.setVisible(false);
				table = new JTable(filteredData,column);
				table.setForeground(Color.cyan);
				scroll = new JScrollPane(table);
				scroll.setBounds(0,0, 990, 570);
				panel3.setVisible(true);
				panel3.add(scroll);
				
				labelForUpdate1.setVisible(true);
				labelForUpdate2.setVisible(true);
				labelForUpdate3.setVisible(true);
				labelForUpdate4.setVisible(true);
				labelForUpdate5.setVisible(true);
				textFieldForUpdate1.setVisible(true);
				textFieldForUpdate2.setVisible(true);
				textFieldForUpdate3.setVisible(true);
				textFieldForUpdate4.setVisible(true);
				textFieldForUpdate5.setVisible(true);
				UpdateButton.setVisible(true);
			}
		
		if(e.getSource()==Ok3) {
			String str = "";
			String[] data[], itemss = new String[1];
			data = new String[imp.amountOfRecordesInAFile("text_6")][];
			try {
				data = imp.allDataFileReader("text_6");
				itemss = imp.singleDataFileReader("text_5", this.username);
				str = itemss[itemss.length-1];
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			int i1 = Integer.parseInt(textField1.getText());
			int i2 = Integer.parseInt(textField2.getText());
			int i3 = Integer.parseInt(textField3.getText());
			int i4 = Integer.parseInt(textField4.getText());
			int i5 = Integer.parseInt(textField5.getText());
			if((i1+i2+i3+i4+i5)>100) {
				JOptionPane.showMessageDialog(null, "Error:  Total > 100 Is Not Allowed", "Check Total", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				String s1 = "";
				int l = 0;
				boolean bo;
				outer:for(int i = 0; i < data.length; i++) {
					if(data[i][0].equals(str)) {
							data[i][1] = s1+i1;
							data[i][2] = s1+i2;
							data[i][3] = s1+i3;
							data[i][4] = s1+i4;
							data[i][5] = s1+i5;
							break outer;
					}
				}
				for(int k = 0; k<data.length;k++) {
					if(l == 0)
						bo = false;
					else
						bo = true;
					imp.fileWriter("text_6", bo, data[k][0],data[k][1],data[k][2],data[k][3],data[k][4],data[k][5]);
					l++;
				}
			}
			JOptionPane.showMessageDialog(null, "successed !!!", "Check Total", JOptionPane.INFORMATION_MESSAGE);
			String datas[][] = new String[imp.amountOfRecordesInAFile("text_1")][];
			datas = imp.allDataFileReader("text_1");
			String datass[][] = new String[imp.amountOfRecordesInAFile("text_4")][];
			datass = imp.allDataFileReader("text_4");
			String item[][] = new String[imp.amountOfRecordesInAFile("text_1")][2];
			for(int i = 0; i<datas.length;i++) {
				item[i][0] = datas[i][0];item[i][1]  = datas[i][datas[0].length-1];
			}
			int l1 = 0;boolean bo = true;
			for(int k = 0; k<datass.length;k++) {
				if(datass[k][datass[k].length-1].equals(str)) {
					bo = false;
					break;
				}
				else
					bo = true;
			}
			
			if(bo==true) {
					for(int d = 0; d<datass.length;d++) {
						if(l1==0) 
							bo = false;
						else
							bo = true;
						imp.fileWriter("text_4", bo, datass[d][0],datass[d][1],datass[d][2],datass[d][3],datass[d][4],datass[d][5],datass[d][6],datass[d][7],datass[d][8]);
						l1++;
					}
					for(int n = 0; n < item.length;n++) {
						imp.fileWriter("text_4", bo, item[n][0],0,0,0,0,0,0,item[n][1],str);
					}
				}
			else {
				int g=0;
					for(int m = 0; m<datass.length;m++) {
						if(g==0)
							bo=false;
						else
							bo=true;
						imp.fileWriter("text_4", bo, datass[m][0],datass[m][1],datass[m][2],datass[m][3],datass[m][4],datass[m][5],datass[m][6],datass[m][7],datass[m][8]);
						bo=true;
						g++;
					}
				}
		}
			
			if(e.getSource()==UpdateButton) {
				System.out.println("yohannes");
				String[] single;String s2 = "";
				try {
					single = imp.singleDataFileReader("text_5", this.username);
					 s2 = single[1];
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				String a = textFieldForUpdate1.getText();
				String b = textFieldForUpdate2.getText();
				String c = textFieldForUpdate3.getText();
				String d = textFieldForUpdate4.getText();
				String f = textFieldForUpdate5.getText();
				int tot = Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c)+Integer.parseInt(d)+Integer.parseInt(f);
				String temp = "";
				if(tot>100) {
					JOptionPane.showMessageDialog(null, "Error:  Total > 100 Is Not Allowed", "Check Total", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					String[][] dat = imp.allDataFileReader("Text_4");
					for(int i = 0; i<dat.length;i++) {
						if(dat[i][0].equals(filteredData[b1][0])&&dat[i][7].equals(section)&&dat[i][8].equals(s2)) {
							dat[i][1] = a;
							dat[i][2] = b;
							dat[i][3] = c;
							dat[i][4] = d;
							dat[i][5] = f;
							dat[i][6] = temp+tot;
						}
					}
					int kl = 0;
					boolean mn = false;
					for(int g = 0; g<dat.length;g++) {
						if(kl==0) {
							imp.fileWriter("text_4", mn, dat[g][0],dat[g][1],dat[g][2],dat[g][3],dat[g][4],dat[g][5],dat[g][6],dat[g][7],dat[g][8]);
							kl++;
						}
						else {
							mn = true;
							imp.fileWriter("text_4", mn, dat[g][0],dat[g][1],dat[g][2],dat[g][3],dat[g][4],dat[g][5],dat[g][6],dat[g][7],dat[g][8]);
						}
						
					}
					JOptionPane.showMessageDialog(null, "SuccessFully Updated !!!", "Updation", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		if(e.getSource()==button) {
			b1 = table.getSelectedRow();
			System.out.println(b1);
			textFieldForUpdate1.setText(filteredData[b1][1]);
			textFieldForUpdate2.setText(filteredData[b1][2]);
			textFieldForUpdate3.setText(filteredData[b1][3]);
			textFieldForUpdate4.setText(filteredData[b1][4]);
			textFieldForUpdate5.setText(filteredData[b1][5]);
		}
	}
	
	public String[][] DataOfStudentsOfOneSection(String filename, String section, String cource){
		String data[][] = imp.allDataFileReader(filename);
		String[][] filteredData = new String[data.length][];
		int h = 0, q=0;
		
		while(h<data.length) {
			if(data[h][7]==section&&data[h][8]==cource) {
				for(int k = 0; k<data[h].length-3;k++) {
					filteredData[q][k] = data[h][k+1];
				}
			}
		}
		return filteredData;
	}
	public String[][] dataFilter(String[][] data,String section, String s1){
		String[][] filteredData = new String[data.length][9];
		int q= 0;
		for(int h = 0; h<data.length;h++) {
			if(data[h][7].equals(section)&&data[h][8].equals(s1)) {
				filteredData[q][0] = data[h][0];
				filteredData[q][1] = data[h][1];
				filteredData[q][2] = data[h][2];
				filteredData[q][3] = data[h][3];
				filteredData[q][4] = data[h][4];
				filteredData[q][5] = data[h][5];
				filteredData[q][6] = data[h][6];
				filteredData[q][7] = data[h][7];
				q++;
			}
		}
		return filteredData;
	}
}
