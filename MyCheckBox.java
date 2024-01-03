import javax.swing.*;
import java.awt.*;
class MyCheckBox{
	public static void main(String[] args){
		JFrame jf=new JFrame();
		
		jf.setBounds(100,100,500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JCheckBox c1=new JCheckBox("High School");
		c1.setBounds(100,50,200,20);
		c.add(c1);
		
		JCheckBox c2=new JCheckBox("Intermediate");
		c2.setBounds(100,100,200,20);
		c.add(c2);
		
		JCheckBox c3=new JCheckBox("Post-Graduation");
		c3.setBounds(100,150,200,20);
		c.add(c3);
		
		JCheckBox c4=new JCheckBox("Graduation");
		c4.setBounds(100,200,200,20);
		c.add(c4);
		
		c1.setSelected(true);
		c4.setEnabled(false);
		
		Font f=new Font("Arial",Font.ITALIC,10);
		c1.setFont(f);
		c2.setFont(f);
		c3.setFont(f);
		c4.setFont(f);
		
		jf.setVisible(true);
	}
}