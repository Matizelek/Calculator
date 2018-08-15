import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class App2 {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;
	private JTextField value3;
	double argument1, argument2, solution;
	char operation = '0';

	/**
	 * Launch the application.
	 */
	SimpleCalculator scalculator = new SimpleCalculator();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App2 window = new App2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 293, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		value3 = new JTextField();
		value3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value3.setBorder(null);
		value3.setBounds(233, 10, 33, 30);
		frame.getContentPane().add(value3);
		value3.setColumns(10);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		value1.setBorder(null);
		value1.setForeground(Color.BLACK);
		value1.setBounds(39, 10, 192, 30);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		value2.setBorder(null);
		value2.setBounds(11, 41, 245, 30);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 9, 257, 63);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton.setBounds(10, 103, 39, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		button.setBounds(59, 103, 39, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		button_1.setBounds(108, 103, 39, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		button_2.setBounds(10, 137, 39, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		button_3.setBounds(59, 137, 39, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		button_4.setBounds(108, 137, 39, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		button_5.setBounds(10, 171, 39, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		button_6.setBounds(59, 171, 39, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		button_7.setBounds(108, 171, 39, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		button_8.setBounds(59, 205, 39, 23);
		frame.getContentPane().add(button_8);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+value2.getText());
				value3.setText("+");
				operation = '+';
				argument1 = Double.parseDouble(value2.getText());
				value2.setText(null);
			}
		});
		btnNewButton_1.setBounds(169, 103, 41, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+value2.getText());
				value3.setText("-");
				operation = '-';
				argument1 = Double.parseDouble(value2.getText());
				value2.setText(null);
			}
		});
		button_9.setBounds(220, 103, 41, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("/");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+value2.getText());
				value3.setText("/");
				operation = '/';
				argument1 = Double.parseDouble(value2.getText());
				value2.setText(null);
			}
		});
		button_10.setBounds(220, 137, 41, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+value2.getText());
				value3.setText("*");
				operation = '*';
				argument1 = Double.parseDouble(value2.getText());
				value2.setText(null);
			}
		});
		button_11.setBounds(169, 137, 41, 23);
		frame.getContentPane().add(button_11);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(220, 205, 41, 23);
		frame.getContentPane().add(btnC);
		
		JButton btnCr = new JButton("CR");
		btnCr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				value2.setText(null);
				value1.setText(null);
				value3.setText(null);
				argument1 = 0;
				argument2 = 0;
				operation = '0';
			}
		});
		btnCr.setBounds(154, 205, 56, 23);
		frame.getContentPane().add(btnCr);
		
		JButton button_12 = new JButton("=");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+value3.getText()+value2.getText());
				argument2 = Double.parseDouble(value2.getText());
				value3.setText(null);
				calculation(operation);
				value2.setText(Double.toString(solution));
				
				
			}
		});
		button_12.setBounds(169, 171, 89, 23);
		frame.getContentPane().add(button_12);
	}
	
	private void calculation(char operation){
		switch (operation){
		case '+': solution =scalculator.add(argument1, argument2) ;
			break;
		case '-': solution =scalculator.divide(argument1, argument2);
		break;
		case '*': solution =scalculator.multiply(argument1, argument2) ;
		break;
		case '/': solution =scalculator.subtract(argument1, argument2);
		break;
		}
	}
	
}
