package date;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Name {
	static int unser1;
	public static void main(String[] args) {
		
		JFrame frame1 = new JFrame ();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(450, 350);
		frame1.setVisible(true);
		frame1.setLayout(null);
		
		JLabel label1 = new JLabel ("Enter your name");
		label1.setBounds(15, 100, 200, 25);
		frame1.add(label1);
		
		JTextField text1 = new JTextField ();
		frame1.add(text1);
		text1.setBounds(15, 125, 200, 25);
		
		JButton button1 = new JButton ("Enter Here");
		frame1.add(button1);
		button1.setBounds(15, 150, 200, 25);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				
			}
		});
		frame1.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged (MouseEvent e) {
				
			}
			public void mouseMoved (MouseEvent e) {
				
			}
		});
		frame1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("n");
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("m");
			}
		});
	}
}
