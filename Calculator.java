import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calc obj=new Calc();
	}
}
class Calc extends JFrame implements ActionListener{
	String s0,s1,s2;
	String str,str2;
	  
	JTextField t;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,bdec,beq,bclr;
	JLabel l1;
	
	public Calc() {
		s0=s1=s2="";
		str="";
		
		t=new JTextField();
		
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		badd=new JButton("+");
		bsub=new JButton("-");
		bmul=new JButton("*");
		bdiv=new JButton("/");
		bdec=new JButton(".");
		beq=new JButton("=");
		bclr=new JButton("C");
		
		
		add(t);
		add(b7);
		add(b8);
		add(b9);
		add(bdiv);
		add(b4);
		add(b5);
		add(b6);
		add(bmul);
		add(b1);
		add(b2);
		add(b3);
	    add(bsub);
		add(bdec);
		add(b0);
		add(badd);
		add(beq);
		add(bclr);
		
		t.setPreferredSize(new Dimension(260,50));
		b0.setPreferredSize(new Dimension(60,40));
		b1.setPreferredSize(new Dimension(60,40));
		b2.setPreferredSize(new Dimension(60,40));
		b3.setPreferredSize(new Dimension(60,40));
		b5.setPreferredSize(new Dimension(60,40));
		b4.setPreferredSize(new Dimension(60,40));
		b6.setPreferredSize(new Dimension(60,40));
		b7.setPreferredSize(new Dimension(60,40));
		b8.setPreferredSize(new Dimension(60,40));
		b9.setPreferredSize(new Dimension(60,40));
		badd.setPreferredSize(new Dimension(60,40));
		bsub.setPreferredSize(new Dimension(60,40));
		bmul.setPreferredSize(new Dimension(60,40));
		bdiv.setPreferredSize(new Dimension(60,40));
		bdec.setPreferredSize(new Dimension(60,40));
		beq.setPreferredSize(new Dimension(60,40));
		bclr.setPreferredSize(new Dimension(120,40));
		
		t.setFont(new Font("Serif",Font.BOLD,30));
		b0.setFont(new Font("Serif",Font.PLAIN,25));
		b1.setFont(new Font("Serif",Font.PLAIN,25));
		b2.setFont(new Font("Serif",Font.PLAIN,25));
		b3.setFont(new Font("Serif",Font.PLAIN,25));
		b4.setFont(new Font("Serif",Font.PLAIN,25));
		b5.setFont(new Font("Serif",Font.PLAIN,25));
		b6.setFont(new Font("Serif",Font.PLAIN,25));
		b7.setFont(new Font("Serif",Font.PLAIN,25));
		b8.setFont(new Font("Serif",Font.PLAIN,25));
		b9.setFont(new Font("Serif",Font.PLAIN,25));
		badd.setFont(new Font("Serif",Font.PLAIN,25));
		bsub.setFont(new Font("Serif",Font.PLAIN,25));
		bmul.setFont(new Font("Serif",Font.PLAIN,25));
		bdiv.setFont(new Font("Serif",Font.PLAIN,25));
		beq.setFont(new Font("Serif",Font.PLAIN,25));
		bdec.setFont(new Font("Serif",Font.PLAIN,25));
		bclr.setFont(new Font("Serif",Font.PLAIN,25));
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bdec.addActionListener(this);
		bclr.addActionListener(this);
		beq.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setTitle("Calculator");
		setSize(300,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
        public void actionPerformed(ActionEvent e) {
		
		
		
		// TODO Auto-generated method stub
		t.setFont(new Font("Serif",Font.BOLD,30));
		String s = e.getActionCommand();
		str=str+s;

		if((s.charAt(0)>='0' && s.charAt(0)<='9') || (s.charAt(0)==('.'))) {
			if(s1.equals(""))
				s0=s0+s;
			else
				s2=s2+s;

			str2=str;
			t.setText(str);
		}
		else if(s.charAt(0)=='C') {
			s0=s1=s2="";
			
			str="";
			
			t.setText(str);
				
		}
		else if(s.charAt(0)=='=') {
			
			int flag1=0;
			double res=0;
			double num1=Double.parseDouble(s0);
			double num2=Double.parseDouble(s2);
			t.setFont(new Font("Serif",Font.BOLD,20));

		
			if(s1.equals("+"))
				res=num1+num2;
			else if(s1.equals("-"))
				res=num1-num2;
			else if(s1.equals("*"))
				res=num1*num2;
			else {
				if(num2==0) {
					t.setText("Can't divide by zero");
					s0=s1=s2="";
					str="";
					flag1=1;
					return;
				}
				else
					res=num1/num2;
			}	
			if(flag1!=1) {
				t.setText(res+"");
			}
			

			str=Double.toString(res);
			
			s0=Double.toString(res);
			str2=s0;
			
			s1=s2="";
		}
		else {
			int flag2=0;
			if(s1.equals("") || s2.equals("")) {
				s1=s;
				str=str2+s1+s2;
			}				
			else {
				double res=0;
				double num1=Double.parseDouble(s0);
				double num2=Double.parseDouble(s2);
				
				if(s1.equals("+"))
					res=num1+num2;
				else if(s1.equals("-"))
					res=num1-num2;
				else if(s1.equals("*"))
					res=num1*num2;
				else if(s1.equals("/"))
					if(num2==0) {
						t.setText("Can't divide by zero");
						s0=s1=s2="";
						str="";
						flag2=1;
						return;
					}
					else
					res=num1/num2;
				
				s0=Double.toString(res);
				s1=s;
				s2="";
				
			}
			if(flag2!=1) {
				t.setText(str);
			}

		}
	      
	}
	
} 


