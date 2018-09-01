package comsc256;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator extends JFrame {
	private String equation = "";
	private JPanel contentPane;
	private JTextField tfOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNumPad = new JPanel();
		contentPane.add(pnlNumPad);
		pnlNumPad.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("7");
			}
		});
		pnlNumPad.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("8");
			}
		});
		pnlNumPad.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("9");
			}
		});
		pnlNumPad.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("4");
			}
		});
		pnlNumPad.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("5");
			}
		});
		pnlNumPad.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("6");
			}
		});
		pnlNumPad.add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("1");
				System.out.println(equation);
			}
		});
		pnlNumPad.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("2");
			}
		});
		pnlNumPad.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("3");
			}
		});
		pnlNumPad.add(btn3);
		
		JButton btnSign = new JButton("+/-");
		pnlNumPad.add(btnSign);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addStr("0");
			}
		});
		pnlNumPad.add(btn0);
		
		JButton btnDot = new JButton(".");
		pnlNumPad.add(btnDot);
		
		JPanel pnlTop = new JPanel();
		contentPane.add(pnlTop, BorderLayout.NORTH);
		pnlTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		tfOut = new JTextField();
		pnlTop.add(tfOut);
		tfOut.setColumns(10);
		
		JPanel pnlTopBtns = new JPanel();
		pnlTop.add(pnlTopBtns);
		pnlTopBtns.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pnlMem = new JPanel();
		pnlTopBtns.add(pnlMem);
		pnlMem.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel lblMem = new JLabel("Mem:");
		pnlMem.add(lblMem);
		
		JButton btnMc = new JButton("MC");
		pnlMem.add(btnMc);
		
		JButton btnMr = new JButton("MR");
		pnlMem.add(btnMr);
		
		JButton btnMp = new JButton("M+");
		pnlMem.add(btnMp);
		
		JButton btnMm = new JButton("M-");
		pnlMem.add(btnMm);
		
		JPanel pnlClear = new JPanel();
		pnlTopBtns.add(pnlClear);
		pnlClear.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnCe = new JButton("CE");
		pnlClear.add(btnCe);
		
		JButton btnClear = new JButton("C");
		pnlClear.add(btnClear);
		
		JButton btnBack = new JButton("Back");
		pnlClear.add(btnBack);
		
		JPanel pnlRight = new JPanel();
		contentPane.add(pnlRight, BorderLayout.EAST);
		pnlRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		pnlRight.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton("\u00D7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("*");
			}
		});
		panel_3.add(button);
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("/");
			}
		});
		panel_3.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		pnlRight.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("+");
			}
		});
		panel_5.add(button_1);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("-");
			}
		});
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String processed = tfOut.getText().replaceAll("e", "Math.E").replaceAll("([0-9]*|Math\\.[A-Za-z]*)\\s*\\^\\s*([0-9]*)", "Math.pow($1, $2)").replaceAll("ln", "Math.log").replaceAll("(sin|cos|tan|asin|acos|atan)", "Math.$1").replaceAll("\u03C0", "Math.PI");
				try
                { 
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("js");
                    Object result = engine.eval(processed);
                    tfOut.setText("" + result);
                    System.out.println("Evaluated: " + processed);
                }
                catch(javax.script.ScriptException ex)
                {
                	tfOut.setText("Error");
                    System.out.println("Error: " + ex + "\nString: " + processed);
                }
			}
		});
		pnlRight.add(btnNewButton_2);
		
		JPanel pnlLeft = new JPanel();
		contentPane.add(pnlLeft, BorderLayout.WEST);
		pnlLeft.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		pnlLeft.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton button_15 = new JButton("^2");
		panel_1.add(button_15);
		
		JButton button_16 = new JButton("^");
		panel_1.add(button_16);
		
		JButton button_2 = new JButton("sin");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("sin(");
			}
		});
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("cos");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("cos(");
			}
		});
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("tan");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("tan(");
			}
		});
		panel_1.add(button_4);
		
		JButton button_17 = new JButton("\u221A");
		panel_1.add(button_17);
		
		JButton btnY = new JButton("y\u221A");
		panel_1.add(btnY);
		
		JButton button_5 = new JButton("asin");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("asin(");
			}
		});
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("acos");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("acos(");
			}
		});
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("atan");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("atan(");
			}
		});
		panel_1.add(button_7);
		
		JButton btnx = new JButton("10^x");
		panel_1.add(btnx);
		
		JButton button_8 = new JButton("log");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("log(");
			}
		});
		panel_1.add(button_8);
		
		JButton btnEe = new JButton("EE");
		panel_1.add(btnEe);
		
		JButton button_10 = new JButton("Mod");
		panel_1.add(button_10);
		
		JButton btnx_1 = new JButton("1/x");
		panel_1.add(btnx_1);
		
		JButton btnEx = new JButton("e^x");
		panel_1.add(btnEx);
		
		JButton button_11 = new JButton("ln");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("ln(");
			}
		});
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("!");
		panel_1.add(button_12);
		
		JButton button_9 = new JButton("\u03C0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("\u03C0");
			}
		});
		
		JButton btnE = new JButton("e");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addStr("e");
			}
		});
		panel_1.add(btnE);
		panel_1.add(button_9);
		
		JButton btnDeg = new JButton("deg");
		panel_1.add(btnDeg);
		
		JButton button_13 = new JButton("(");
		panel_1.add(button_13);
		
		JButton button_14 = new JButton(")");
		panel_1.add(button_14);
		
		
		
	}
	public void addStr(String str) {
		tfOut.setText(tfOut.getText() + str);
	}
}
