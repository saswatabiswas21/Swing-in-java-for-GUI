import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginFrom{
	public static void main(String[] args){
		Test t=new Test();
	}
}
class Test extends JFrame implements ActionListener{
	JTextField f;
	JButton b;
	JLabel l1,l2;
	JPasswordField p;
	Container c;
	Test(){
		setTitle("Login From");
		setBounds(100,100,400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();
		c.setLayout(null);
		
		l1=new JLabel("USER NAME");
		l2=new JLabel("PASS WORD");
		l1.setBounds(10,50,100,20);
		l2.setBounds(10,100,100,20);
		c.add(l1);
		c.add(l2);
		
		f=new JTextField();
		f.setBounds(120,50,120,20);
		c.add(f);
		
		p=new JPasswordField();
		p.setBounds(120,100,120,20);
		c.add(p);
		
		b=new JButton("LOGIN");
		b.setBounds(100,150,100,20);
		c.add(b);
		
		b.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("Username:: "+f.getText());
		System.out.println("Password:: "+p.getText());
	}
}