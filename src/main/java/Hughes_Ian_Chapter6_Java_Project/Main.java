package Hughes_Ian_Chapter6_Java_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textF_Numerator;
	private JTextField textF_Denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textF_Numerator = new JTextField();
		textF_Numerator.setBounds(105, 11, 86, 20);
		frame.getContentPane().add(textF_Numerator);
		textF_Numerator.setColumns(10);
		
		textF_Denominator = new JTextField();
		textF_Denominator.setColumns(10);
		textF_Denominator.setBounds(105, 42, 86, 20);
		frame.getContentPane().add(textF_Denominator);
		
		JLabel lbl_Numerator = new JLabel("Numerator");
		lbl_Numerator.setBounds(10, 14, 85, 14);
		frame.getContentPane().add(lbl_Numerator);
		
		JLabel lbl_Denominator = new JLabel("Denominator");
		lbl_Denominator.setBounds(10, 45, 85, 14);
		frame.getContentPane().add(lbl_Denominator);
		
		JLabel lbl_ResultText = new JLabel("Result:");
		lbl_ResultText.setBounds(10, 83, 85, 14);
		frame.getContentPane().add(lbl_ResultText);
		
		JLabel lbl_Result = new JLabel("...");
		lbl_Result.setBounds(105, 83, 291, 14);
		frame.getContentPane().add(lbl_Result);
		
		JButton btn_Calculate = new JButton("Calculate");
		btn_Calculate.setBounds(222, 41, 89, 23);
		frame.getContentPane().add(btn_Calculate);
		
		//////EVENT HANDLERS
		
		btn_Calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
				double numerator = Double.parseDouble(textF_Numerator.getText());
				double denominator = Double.parseDouble(textF_Denominator.getText());
				SimpleMath smController = new SimpleMath();
				double result = smController.divide(numerator, denominator);
				lbl_Result.setText(Double.toString(result));
				}
				catch(ArithmeticException e) {
					lbl_Result.setText("Error! Cannot divide by 0.");
				}
			}
		});
	}
}
