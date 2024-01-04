import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RegistrationForm{
	public static void main(String[] args){
		MyForm mf=new MyForm(); 
	}
}

class MyForm extends JFrame implements ActionListener{
	Container c;
	JLabel l1,l2,l3,l4,l5,msg;
	JTextField t1,t2;
	JRadioButton male,female;
	JComboBox date,month,year;
	JTextArea a,screen;
	JCheckBox term;
	JButton submit;
	MyForm(){
		setTitle("Registration Form");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("Name");
		l1.setBounds(20,20,50,30);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(80,20,150,30);
		c.add(t1);
		
		l2=new JLabel("Mobile");
		l2.setBounds(20,60,50,30);
		c.add(l2);
		
		t2=new JTextField();
		t2.setBounds(80,60,150,30);
		c.add(t2);
		
		l3=new JLabel("Gender");
		l3.setBounds(20,100,50,30);
		c.add(l3);
		
		male=new JRadioButton("Male");
		male.setBounds(75,100,70,30);
		c.add(male);
		
		female=new JRadioButton("Female");
		female.setBounds(150,100,70,30);
		c.add(female);
		
		ButtonGroup gander=new ButtonGroup();
		gander.add(male);
		gander.add(female);
		
		l4=new JLabel("DOB");
		l4.setBounds(20,140,50,30);
		c.add(l4);
		
		String[] dates={"1","2","3","4","5","6","7","8","10","11","12","13","14","15","16","17","18","19","20","21","22","23",
						"24","25","26","27","28","29","30","31"};
		String[] months={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		String[] years={"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007"};
		
		date=new JComboBox(dates);
		date.setBounds(75,140,50,30);
		c.add(date);
		
		month=new JComboBox(months);
		month.setBounds(130,140,50,30);
		c.add(month);
		
		year=new JComboBox(years);
		year.setBounds(185,140,55,30);
		c.add(year);
		
		l5=new JLabel("Address");
		l5.setBounds(20,180,50,30);
		c.add(l5);
		
		a=new JTextArea();
		a.setBounds(75,180,250,100);
		a.setLineWrap(true);
		c.add(a);
		
		term=new JCheckBox("Accept tearm and conditions");
		term.setBounds(20,300,200,30);
		c.add(term);
		
		submit=new JButton("Submit");
		submit.setBounds(50,330,80,30);
		c.add(submit);
		submit.addActionListener(this);
		
		screen=new JTextArea();
		screen.setBounds(350,20,300,300);
		c.add(screen);
		
		msg=new JLabel("");
		msg.setBounds(20,400,250,20);
		c.add(msg);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		if(term.isSelected()){
			msg.setText("Registration sucessfull!!!!");
			String name=l1.getText();
			String Mobile=l2.getText();
			String gander=l3.getText();
			String DOB=date.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
			String address=a.getText();
			screen.setText("Name::"+name+"\n"+"Mobile No:: "+Mobile+"\n"+"Gander:: "+gander+"\n"+"Date Of Birth:: "+DOB+"\n"+"Address:: "+address);
		}
		else{
			msg.setText("Please accept term and condition");
			screen.setText("");
		}
	}
}