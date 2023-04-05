package swing_calismalari;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frmHesapMakinesi;
	private JTextField input;
	private double answer,number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str){
		input.setText(input.getText() + str);
	}
	public void calculate(){
		switch(operation){
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.setResizable(false);
		frmHesapMakinesi.setTitle("Hesap Makinesi");
		frmHesapMakinesi.setBounds(100, 100, 344, 539);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);
		
		JPanel control = new JPanel();
		control.setBounds(10, 12, 313, 73);
		frmHesapMakinesi.getContentPane().add(control);
		control.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Lucida Sans", Font.PLAIN, 23));
		input.setBounds(0, 28, 313, 39);
		control.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 313, 26);
		control.add(lbl);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 101, 313, 352);
		frmHesapMakinesi.getContentPane().add(panel);
		panel.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_1);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_3);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_2);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_4);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_5);
		
		JButton button_6_3 = new JButton("-");
		button_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_6_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_3);
		
		JButton button_6_6 = new JButton("1");
		button_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_6);
		
		JButton button_6_1 = new JButton("2");
		button_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_1);
		
		JButton button_6_2 = new JButton("3");
		button_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_2);
		
		JButton button_6_4 = new JButton("*");
		button_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_6_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_4);
		
		JButton button_6_5 = new JButton("0");
		button_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_5);
		
		JButton button_6_7 = new JButton("=");
		button_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		button_6_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_7);
		
		JButton button_6_8 = new JButton("C");
		button_6_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
			}
		});
		button_6_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_8);
		
		JButton button_6_9 = new JButton("/");
		button_6_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_6_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(button_6_9);
	}
}
