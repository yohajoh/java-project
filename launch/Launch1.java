package launch;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Launch1 {
	JLabel label1, label2, label3;
	public Launch1(JFrame frame) {
		label1 = new JLabel("WELLCOME TO");
		label1.setFont(new Font("Consolas", Font.ITALIC,50));
		label2 = new JLabel("ADAMA SCIENCE AND TECHNOLOGY");
		label2.setFont(new Font("Consolas", Font.ITALIC,50));
		label3 = new JLabel("UNIVERSITY");
		label3.setFont(new Font("Consolas", Font.ITALIC,50));
		
		GridBagLayout constraint = new GridBagLayout();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 400);
		frame.setLayout(new GridBagLayout());
		frame.getContentPane().setBackground(new Color(230,255,255));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
