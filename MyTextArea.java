import javax.swing.*;
import java.awt.*;
class MyTextArea{
	public static void main(String[] args){
		JFrame jf=new JFrame();
		jf.setBounds(100,100,700,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JTextArea a=new JTextArea();
		a.setBounds(100,100,400,200);
		c.add(a);
		
		a.setText("Hello");
		a.setFont(new Font("Arial",Font.BOLD,15));
		//a.setEditable(false);//if false ==> Text area is not editable
		a.setLineWrap(true);//When one line is end it will shift to next line
		
		jf.setVisible(true);
	}
}