package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtfDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtfDisp = new JTextField();
		txtfDisp.setEditable(false);
		txtfDisp.setFont(new Font("굴림", Font.BOLD, 22));
		txtfDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtfDisp.setText("0");
		txtfDisp.setBounds(12, 10, 276, 52);
		contentPane.add(txtfDisp);
		txtfDisp.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(84, 206, 60, 57);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(156, 206, 60, 57);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(12, 139, 60, 57);
		contentPane.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(84, 139, 60, 57);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(156, 139, 60, 57);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(12, 72, 60, 57);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(84, 72, 60, 57);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(156, 72, 60, 57);
		contentPane.add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBounds(228, 72, 60, 57);
		contentPane.add(btnDiv);
		
		JButton btnMulti = new JButton("X");
		btnMulti.setBounds(228, 139, 60, 57);
		contentPane.add(btnMulti);
		
		
		
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(228, 206, 60, 57);
		contentPane.add(btnMinus);
		
		
		btn1.setBounds(12, 206, 60, 57);
		contentPane.add(btn1);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(228, 273, 60, 57);
		contentPane.add(btnPlus);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(156, 273, 60, 57);
		contentPane.add(btnEqual);
		
		JButton btnCancle = new JButton("C");
		btnCancle.setBounds(84, 273, 60, 57);
		contentPane.add(btnCancle);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 273, 60, 57);
		contentPane.add(btn0);
		
	
		
	}

}
