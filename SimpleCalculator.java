import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SimpleCalculator{
	public static void main(String[] args){
		Code x=new Code();
	}
}
class Code extends JFrame implements ActionListener{
	private Container c;
	private JLabel l1,l2,res;
	private JTextField t1,t2;
	private JButton add,sub,mul,div;
	Code(){
		setTitle("Simple Calculator");
		setBounds(100,100,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("First number::");
		l1.setBounds(10,20,100,20);
		c.add(l1);
		
		t1=new JTextField();
		t1.setBounds(120,20,100,20);
		c.add(t1);
		
		l2=new JLabel("Second number::");
		l2.setBounds(10,50,100,20);
		c.add(l2);
		
		t2=new JTextField();
		t2.setBounds(120,50,100,20);
		c.add(t2);
		
		add=new JButton("+");
		add.setBounds(10,80,50,30);
		c.add(add);
		
		sub=new JButton("-");
		sub.setBounds(70,80,50,30);
		c.add(sub);
		
		mul=new JButton("*");
		mul.setBounds(130,80,50,30);
		c.add(mul);
		
		div=new JButton("/");
		div.setBounds(190,80,50,30);
		c.add(div);
		
		res=new JLabel("REASULT::");
		res.setBounds(10,120,150,20);
		c.add(res);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		try{
			if(e.getSource()==add){
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a+b;
				res.setText("Reasult:: "+c);
			}
			
			if(e.getSource()==sub){
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a-b;
				res.setText("Reasult:: "+c);
			}
			
			if(e.getSource()==mul){
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a*b;
				res.setText("Reasult:: "+c);
			}
			
			if(e.getSource()==div){
				int a=Integer.parseInt(t1.getText());
				int b=Integer.parseInt(t2.getText());
				int c=a/b;
				res.setText("Reasult:: "+c);
			}
		}
		catch(NumberFormatException e1){
			res.setText("Please enter integer only");
		}
		catch(ArithmeticException e2){
			res.setText("Cannot devide by zero");
		}
	}
}