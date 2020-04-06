package calcularoJAVA;

import java.awt.EventQueue;
import java.math.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class calc {

	private JFrame frmCalculator;
    public static String sum="";
    private JButton button_5;
    public Double result;
    public int number;
    public static Double num1;
    public Double num2;
    public int x;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setType(Type.POPUP);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 349, 531);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		

		JLabel label = new JLabel("");
		label.setForeground(Color.BLACK);
		label.setOpaque(true);
		label.setEnabled(false);
		label.setBackground(Color.LIGHT_GRAY);
		label.setLabelFor(frmCalculator);
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setFont(new Font("SansSerif", Font.BOLD, 34));
		label.setBounds(38, 44, 266, 70);
		frmCalculator.getContentPane().add(label);
		

		JLabel small_label = new JLabel("");
		small_label.setHorizontalAlignment(SwingConstants.TRAILING);
		small_label.setBounds(38, 20, 265, 21);
		small_label.setFont(new Font("SansSerif",Font.BOLD,24));
		frmCalculator.getContentPane().add(small_label);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"7";
			    label.setText(sum);
				
			}
		}
		);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(38, 156, 47, 44);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("6");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"6";
				label.setText(sum);
			}
		});
		button.setBackground(Color.LIGHT_GRAY);
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(179, 224, 47, 44);
		frmCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("9");
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"9";
				label.setText(sum);
			}
		});
		button_1.setBounds(179, 156, 47, 44);
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"8";
				label.setText(sum);
			}
		});
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_2.setBounds(109, 156, 47, 44);
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"5";
				label.setText(sum);
			}
			
		});
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(109, 224, 47, 44);
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"4";
				label.setText(sum);
			}
		});
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(38, 224, 47, 44);
		frmCalculator.getContentPane().add(button_4);
		
		button_5 = new JButton("+");
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=1;
				num1=Double.parseDouble(sum);
				sum+="+";
				small_label.setText(sum);
				sum="";
				label.setText(sum);
				
				
		}});
		button_5.setBounds(247, 290, 57, 111);
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=2;
				num1=Double.parseDouble(sum);
				sum+="-";
				small_label.setText(sum);
				sum="";
				label.setText(sum);
			
			}});
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBounds(247, 224, 57, 44);
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"3";
				label.setText(sum);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(179, 291, 47, 44);
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"2";
				label.setText(sum);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(109, 291, 47, 44);
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"1";
				label.setText(sum);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(38, 290, 47, 44);
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+".";
				label.setText(sum);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(179, 357, 47, 44);
		frmCalculator.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum=sum+"0";
				label.setText(sum);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		button_11.setBackground(Color.LIGHT_GRAY);
		button_11.setBounds(109, 357, 47, 44);
		frmCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=3;
				num1=Double.parseDouble(sum);
				sum+="*";
				small_label.setText(sum);
				sum="";
				label.setText(sum);
				
				
			
			}
			
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_12.setBackground(Color.LIGHT_GRAY);
		button_12.setBounds(38, 419, 47, 44);
		frmCalculator.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        num2=Double.parseDouble(label.getText());
		        sum="";
				switch(number)
				{
				case 1: {result= num1+num2;
				        break;}
				case 2:{ result= num1-num2;
		                break;}
				case 3:{ result= num1*num2;
                       break;}
				case 4:{ result= num1/num2;
                       break;}
				}
		       
				label.setText(result.toString());
				 sum=label.getText();
				small_label.setText("");
				
				
		
				
				
			}
			
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_13.setBackground(Color.LIGHT_GRAY);
		button_13.setBounds(179, 419, 123, 44);
		frmCalculator.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=4;
				num1=Double.parseDouble(sum);
				sum+="/";
				small_label.setText(sum);
				sum="";
				label.setText(sum);
				
			
			}
			
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setBounds(109, 418, 47, 47);
		frmCalculator.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("c");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum="";
				num1=0.0;
				num2=0.0;
				label.setText("");
				small_label.setText("");
				
				
		
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_15.setBackground(Color.LIGHT_GRAY);
		button_15.setBounds(247, 156, 57, 44);
		frmCalculator.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("<");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sum=="")
				{
					label.setText("0");
					sum="0";
				}
				x = sum.length();
				sum=sum.substring(0,x-1);
				label.setText(sum);
				
				
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 10));
		button_16.setBackground(Color.LIGHT_GRAY);
		button_16.setBounds(38, 357, 47, 44);
		frmCalculator.getContentPane().add(button_16);
		
		
	}
	}

