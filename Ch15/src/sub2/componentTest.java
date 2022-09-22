package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class componentTest extends JFrame {

	private JPanel btnChk;
	private JTextField txtf1;
	private JTextField txtf2;
	private JTextField txtf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					componentTest frame = new componentTest();
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
	public componentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 545);
		btnChk = new JPanel();
		btnChk.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(btnChk);
		btnChk.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습하기");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 173, 15);
		btnChk.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Button 컴포넌트");
		lblNewLabel_1.setBounds(22, 35, 108, 15);
		btnChk.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(32, 60, 70, 23);
		btnChk.add(btn1);
	
		JButton btn2 = new JButton("버튼2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭..");
			}
		});
		btn2.setBounds(114, 60, 70, 23);
		btnChk.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼3 클릭...", "일반대화상자", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btn3.setBounds(196, 60, 70, 23);
		btnChk.add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "버튼4 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				int answer = 0;
				if(answer == JOptionPane.YES_OPTION) {
					System.out.println("yes 클릭");
				}else {
					System.out.println("no 클릭");
				}
			}
		});
		btn4.setBounds(278, 60, 70, 23);
		btnChk.add(btn4);
		
		txtf1 = new JTextField();
		txtf1.setBounds(12, 117, 116, 21);
		btnChk.add(txtf1);
		txtf1.setColumns(10);
		
		txtf2 = new JTextField();
		txtf2.setBounds(14, 148, 116, 21);
		btnChk.add(txtf2);
		txtf2.setColumns(10);
		
		txtf3 = new JTextField();
		txtf3.setBounds(14, 179, 116, 21);
		btnChk.add(txtf3);
		txtf3.setColumns(10);
		
		JLabel lblTxtf1Result = new JLabel("결과 :");
		lblTxtf1Result.setBounds(258, 120, 57, 15);
		btnChk.add(lblTxtf1Result);
		
		JLabel lblTxtf2Result = new JLabel("결과 :");
		lblTxtf2Result.setBounds(258, 151, 57, 15);
		btnChk.add(lblTxtf2Result);
		
		JLabel lblTxtf3Result = new JLabel("결과 :");
		lblTxtf3Result.setBounds(258, 182, 57, 15);
		btnChk.add(lblTxtf3Result);
		
		JButton btnTxtf1 = new JButton("확인");
		btnTxtf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt = txtf1.getText();
				lblTxtf1Result.setText("결과 : " + txt);
			}
		});
		btnTxtf1.setBounds(140, 116, 97, 23);
		btnChk.add(btnTxtf1);
		
		JButton btnTxtf2 = new JButton("확인");
		btnTxtf2.setBounds(142, 147, 97, 23);
		btnChk.add(btnTxtf2);
		
		JButton btnTxtf3 = new JButton("확인");
		btnTxtf3.setBounds(142, 178, 97, 23);
		btnChk.add(btnTxtf3);
		
		JLabel lblNewLabel_2 = new JLabel("TextFeild 컴포넌트");
		lblNewLabel_2.setBounds(12, 92, 118, 15);
		btnChk.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CheckBox 컴포넌트");
		lblNewLabel_3.setBounds(12, 230, 118, 15);
		btnChk.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("취미를 고르세요.");
		lblNewLabel_4.setBounds(12, 255, 118, 15);
		btnChk.add(lblNewLabel_4);
		
		JCheckBox Chk1 = new JCheckBox("등산");
		Chk1.setBounds(15, 276, 70, 23);
		btnChk.add(Chk1);
		
		JCheckBox Chk2 = new JCheckBox("여행");
		Chk2.setBounds(89, 276, 70, 23);
		btnChk.add(Chk2);
		
		JCheckBox Chk3 = new JCheckBox("독서");
		Chk3.setBounds(163, 276, 70, 23);
		btnChk.add(Chk3);
		
		JCheckBox Chk4 = new JCheckBox("운동");
		Chk4.setBounds(237, 276, 70, 23);
		btnChk.add(Chk4);
		
		JCheckBox Chk5 = new JCheckBox("게임");
		Chk5.setBounds(311, 276, 70, 23);
		btnChk.add(Chk5);
		
		JLabel lblchkResult = new JLabel("결과 :");
		lblchkResult.setBounds(28, 319, 57, 15);
		btnChk.add(lblchkResult);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> list = new ArrayList<>();
				
				if(Chk1.isSelected()) {
					list.add(Chk1.getText());
				}
				
				if(Chk2.isSelected()) {
					list.add(Chk2.getText());
				}
				
				if(Chk3.isSelected()) {
					list.add(Chk3.getText());
				}
				
				if(Chk4.isSelected()) {
					list.add(Chk4.getText());
				}
				
				if(Chk5.isSelected()) {
					list.add(Chk5.getText());
				}
				
				lblchkResult.setText("결과 : " + list);
				
			}
		});
		btnNewButton.setBounds(389, 276, 70, 23);
		btnChk.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 컴포넌트");
		lblNewLabel_5.setBounds(38, 344, 130, 15);
		btnChk.add(lblNewLabel_5);
		
		JRadioButton rbMale = new JRadioButton("남자");
		rbMale.setBounds(38, 365, 70, 23);
		btnChk.add(rbMale);
		
		JRadioButton rbFemale = new JRadioButton("여자");
		rbFemale.setBounds(114, 365, 70, 23);
		btnChk.add(rbFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		
		JLabel lblGenderResult = new JLabel("결과 : ");
		lblGenderResult.setBounds(48, 394, 108, 15);
		btnChk.add(lblGenderResult);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbMale.isSelected()) {
					lblGenderResult.setText("결과 : 남자");
				}else {
					lblGenderResult.setText("결과 : 여자");
				}
				
				
			}
		});
		btnGender.setBounds(196, 365, 97, 23);
		btnChk.add(btnGender);
		
		
		

		

	}
}
