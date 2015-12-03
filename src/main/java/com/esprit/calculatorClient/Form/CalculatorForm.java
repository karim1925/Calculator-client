package com.esprit.calculatorClient.Form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.naming.NamingException;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

import com.esprit.calculatorClient.controller.CalculatorController;
import java.awt.Font;

public class CalculatorForm implements ActionListener {

	int sum = 0, mult = 0, div = 0, sub = 0;
	double value1, value2, FinalResult;

	CalculatorController calculationController = new CalculatorController();
	private JFrame frame;
	private JTextField Result;
	private JButton Button_1;
	private JButton Button_2;
	private JButton Button_3;
	private JButton Button_4;
	private JButton Button_5;
	private JButton Button_6;
	private JButton Button_7;
	private JButton Button_8;
	private JButton Button_9;
	private JButton Button_0;
	private JButton Button_point;
	private JButton Button_C;
	private JButton BDivision;
	private JButton BSubstraction;
	private JButton BSum;
	private JButton BMultiplication;
	private JToggleButton BResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorForm window = new CalculatorForm();
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
	public CalculatorForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Result = new JTextField();
		Result.setBounds(22, 22, 248, 34);
		frame.getContentPane().add(Result);
		Result.setColumns(10);

		BDivision = new JButton("/");
		BDivision.setFont(new Font("Tahoma", Font.PLAIN, 10));
		BDivision.addActionListener(this);
		BDivision.setBounds(206, 278, 40, 30);
		frame.getContentPane().add(BDivision);

		BMultiplication = new JButton("*");
		BMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 10));
		BMultiplication.addActionListener(this);
		BMultiplication.setBounds(206, 228, 40, 30);
		frame.getContentPane().add(BMultiplication);

		BSubstraction = new JButton("-");
		BSubstraction.setFont(new Font("Tahoma", Font.PLAIN, 10));
		BSubstraction.addActionListener(this);
		BSubstraction.setBounds(206, 178, 40, 30);
		frame.getContentPane().add(BSubstraction);

		BSum = new JButton("+");
		BSum.setFont(new Font("Tahoma", Font.PLAIN, 8));
		BSum.addActionListener(this);
		BSum.setBounds(206, 128, 40, 30);
		frame.getContentPane().add(BSum);

		BResult = new JToggleButton("Result");
		BResult.setFont(new Font("Tahoma", Font.PLAIN, 10));
		BResult.addActionListener(this);
		BResult.setBounds(92, 67, 96, 50);
		frame.getContentPane().add(BResult);

		Button_1 = new JButton("1");
		Button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_1.addActionListener(this);
		Button_1.setBounds(38, 128, 40, 40);
		frame.getContentPane().add(Button_1);

		Button_2 = new JButton("2");
		Button_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_2.addActionListener(this);
		Button_2.setBounds(93, 128, 40, 40);
		frame.getContentPane().add(Button_2);

		Button_3 = new JButton("3");
		Button_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_3.addActionListener(this);
		Button_3.setBounds(148, 128, 40, 40);
		frame.getContentPane().add(Button_3);

		Button_4 = new JButton("4");
		Button_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_4.addActionListener(this);
		Button_4.setBounds(38, 178, 40, 40);
		frame.getContentPane().add(Button_4);

		Button_5 = new JButton("5");
		Button_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_5.addActionListener(this);
		Button_5.setBounds(93, 178, 40, 40);
		frame.getContentPane().add(Button_5);

		Button_6 = new JButton("6");
		Button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_6.addActionListener(this);
		Button_6.setBounds(148, 178, 40, 40);
		frame.getContentPane().add(Button_6);

		Button_7 = new JButton("7");
		Button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_7.addActionListener(this);
		Button_7.setBounds(38, 228, 40, 40);
		frame.getContentPane().add(Button_7);

		Button_8 = new JButton("8");
		Button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_8.addActionListener(this);
		Button_8.setBounds(93, 228, 40, 40);
		frame.getContentPane().add(Button_8);

		Button_9 = new JButton("9");
		Button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_9.addActionListener(this);
		Button_9.setBounds(148, 228, 40, 40);
		frame.getContentPane().add(Button_9);

		Button_point = new JButton(".");
		Button_point.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_point.addActionListener(this);
		Button_point.setBounds(38, 278, 40, 40);
		frame.getContentPane().add(Button_point);

		Button_0 = new JButton("0");
		Button_0.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Button_0.addActionListener(this);
		Button_0.setBounds(93, 278, 40, 40);
		frame.getContentPane().add(Button_0);

		Button_C = new JButton("C");
		Button_C.setFont(new Font("Tahoma", Font.PLAIN, 8));
		Button_C.addActionListener(this);
		Button_C.setBounds(148, 278, 40, 40);
		frame.getContentPane().add(Button_C);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == Button_1) {

			Result.setText(Result.getText() + "1");

		}
		if (source == Button_2) {

			Result.setText(Result.getText() + "2");

		}
		if (source == Button_3) {

			Result.setText(Result.getText() + Result.getText() + "3");

		}
		if (source == Button_4) {

			Result.setText(Result.getText() + "4");

		}
		if (source == Button_5) {

			Result.setText(Result.getText() + "5");

		}
		if (source == Button_6) {

			Result.setText(Result.getText() + "6");

		}
		if (source == Button_7) {

			Result.setText(Result.getText() + "7");

		}
		if (source == Button_8) {

			Result.setText(Result.getText() + "8");

		}
		if (source == Button_9) {

			Result.setText(Result.getText() + "9");

		}
		if (source == Button_0) {

			Result.setText(Result.getText() + "0");

		}
		if (source == Button_point) {

			Result.setText(Result.getText() + ".");

		}

		if (source == Button_C) {

			value1 = 0.0;
			value2 = 0.0;
			Result.setText("0");

		}

		if (source == BSum) {
			sum = 1;
			value1 = Read_Text();
			Result.setText("");
			;

		}

		if (source == BDivision) {
			div = 1;
			value1 = Read_Text();
			Result.setText("");

		}

		if (source == BSubstraction) {
			sub = 1;
			value1 = Read_Text();
			Result.setText("");
		}

		if (source == BMultiplication) {

			mult = 1;
			value1 = Read_Text();
			Result.setText("");
		}

		if (source == BResult) {

			value2 = Read_Text();
			if (sum > 0) {
				try {
					FinalResult = calculationController.Add(value1, value2);
					sum = 0;
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			if (div > 0) {
				try {
					FinalResult = calculationController.Division(value1, value2);
					div = 0;
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (mult > 0) {
				try {
					FinalResult = calculationController.Multiplication(value1, value2);
					mult = 0;
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			if (sub > 0) {
				try {
					FinalResult = calculationController.Subtraction(value1, value2);
					sub = 0;
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			Result.setText(Double.toString(FinalResult));
			value1 = 0.0;
			value2 = 0.0;
		}

	}

	public Double Read_Text() {

		String s = Result.getText();
		Double Value = Double.valueOf(s);

		return Value;

	}
}
