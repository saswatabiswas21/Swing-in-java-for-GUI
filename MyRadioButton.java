import javax.swing.*;
import java.awt.*;
class MyRadioButton{
	public static void main(String[] args){
		JFrame jf=new JFrame();
		jf.setBounds(100,100,500,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		JRadioButton r1=new JRadioButton("Male");
		r1.setBounds(100,50,100,20);
		c.add(r1);
		
		JRadioButton r2=new JRadioButton("Female");
		r2.setBounds(200,50,100,20);
		c.add(r2);
		
		ButtonGroup grp1=new ButtonGroup();
		grp1.add(r1);
		grp1.add(r2);
		
		r1.setSelected(true);//Select a radio buton from previous
		
		Font f=new Font("Arial",Font.BOLD,15);
		r1.setFont(f);
		r2.setFont(f);
		
		JRadioButton gen=new JRadioButton("General");
		gen.setBounds(100,100,100,20);
		c.add(gen);
		
		JRadioButton obc=new JRadioButton("OBC");
		obc.setBounds(200,100,100,20);
		c.add(obc);
		
		JRadioButton sc=new JRadioButton("SC");
		sc.setBounds(300,100,100,20);
		c.add(sc);
		
		JRadioButton st=new JRadioButton("ST");
		st.setBounds(400,100,100,20);
		c.add(st);
		
		ButtonGroup grp2=new ButtonGroup();
		grp2.add(gen);
		grp2.add(obc);
		grp2.add(sc);
		grp2.add(st);
		
		gen.setSelected(true);//Select a radio buton from previous
		obc.setEnabled(false);//to disable any radio button
		
		jf.setVisible(true);
	}
}