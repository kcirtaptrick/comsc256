package comsc256;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Day1 extends JFrame {

	private JPanel contentPane;
	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtfRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Day1 frame = new Day1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Day1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.CYAN);
		jp1.setForeground(Color.CYAN);
		contentPane.add(jp1);
		
		JLabel lblNewLabel = new JLabel("Num1");
		jp1.add(lblNewLabel);
		
		jtf1 = new JTextField();
		jp1.add(jtf1);
		jtf1.setColumns(10);
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.GREEN);
		contentPane.add(jp2);
		
		JLabel lblNewLabel_1 = new JLabel("Num2");
		jp2.add(lblNewLabel_1);
		
		jtf2 = new JTextField();
		jp2.add(jtf2);
		jtf2.setColumns(10);
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.MAGENTA);
		contentPane.add(jp3);
		
		JLabel lblRes = new JLabel("Res");
		jp3.add(lblRes);
		
		jtfRes = new JTextField();
		jp3.add(jtfRes);
		jtfRes.setColumns(10);
		
		JPanel jp4 = new JPanel();
		jp4.setBackground(Color.YELLOW);
		contentPane.add(jp4);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			//Addition EventHandler
			public void actionPerformed(ActionEvent arg0) {
				jtfRes.setText("" + (Integer.parseInt( jtf1.getText() ) + Integer.parseInt( jtf2.getText() ) ) );
			}
		});
		jp4.add(btnAdd);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfRes.setText("" + (Integer.parseInt( jtf1.getText() ) - Integer.parseInt( jtf2.getText() ) ) );
			}
		});
		jp4.add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfRes.setText("" + (Integer.parseInt( jtf1.getText() ) * Integer.parseInt( jtf2.getText() ) ) );
			}
		});
		jp4.add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtfRes.setText("" + (Integer.parseInt( jtf1.getText() ) / Integer.parseInt( jtf2.getText() ) ) );
			}
		});
		jp4.add(btnDivide);
	}

}
