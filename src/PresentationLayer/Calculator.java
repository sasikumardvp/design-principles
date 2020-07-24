package PresentationLayer;
import java.awt.*;
import javax.swing.*;

import BusinessLayer.Addition;
import BusinessLayer.Divide;
import BusinessLayer.Multiplication;
import BusinessLayer.Subtraction;

import java.awt.event.*;

public class Calculator implements ActionListener
{
	JFrame f;
	JButton b1,b2,b3,b4,b5,b6;
	TextField t1,t2,t3;
	JLabel l1,l2,l3,l4;
	public Calculator() 
	{
	
	
		f=new JFrame("Calculator Application");
		b1=new JButton("ADDITION");
		b2=new JButton("SUBTRACTION");
		b3=new JButton("MULTIPLICATION");
		b4=new JButton("DIVISION");
		b5=new JButton("CLEAR");
		b6=new JButton("CLOSE");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new JLabel("Enter First Value");
		l2=new JLabel("Enter Second Value");
		l3=new JLabel("Result : ");
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(650,700);
		f.add(l1);
	    f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		l1.setBounds(150,70,150,50);
		t1.setBounds(300,70,150,50);
		l2.setBounds(150,150,150,50);
		t2.setBounds(300,150,150,50);
		b1.setBounds(10,300,160,50);
		b2.setBounds(170,300,160,50);
		b3.setBounds(330,300,160,50);
		b4.setBounds(490,300,160,50);
		b5.setBounds(150,380,160,50);
		b6.setBounds(310,380,160,50);
		l3.setBounds(150,500,150,50);
		t3.setBounds(300,500,150,50);
		
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);	
b5.addActionListener(this);
b6.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		int first=0,second=0;
		if(e.getSource().equals(b6))
		{
			f.setVisible(false);
		
		}
		else
		{
		try
		{
		first=Integer.parseInt(t1.getText());
		second=Integer.parseInt(t2.getText());
		}
		catch(Exception ee)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		JOptionPane.showMessageDialog(f,"Enter only Integers","Alert",JOptionPane.WARNING_MESSAGE);   
		}}
		
		if(e.getSource().equals(b1))
		{
			Addition k= new Addition();
			String data="";
			int result=k.addition(first,second);
			data=String.valueOf(result);
			t3.setText(data);
		}
		else if(e.getSource().equals(b2))
		{
			
			Subtraction s=new Subtraction();
			String data="";
			int result=s.subtraction(first,second);
			data=String.valueOf(result);
			t3.setText(data);
		}
		else if(e.getSource().equals(b3))
		{
			Multiplication m=new Multiplication();
			String data="";
			int result=m.multiplication(first,second);
			data=String.valueOf(result);
			t3.setText(data);
        }
		else if(e.getSource().equals(b4)) 
		{
			Divide d=new Divide();
			String data="";
			int result=d.division(first,second);
			data=String.valueOf(result);
			t3.setText(data);
        }
		else if(e.getSource().equals(b5))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
		
		else
		{
			f.setVisible(false);
	}
	}


public static void main(String[] args)
{
	new Calculator();
	
}
}
