import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Code8{
	public static void main(String[] args){
		CheckBox cb=new CheckBox();
	}
}
class CheckBox extends JFrame{
	JTextField t;
	JRadioButton r1,r2;
	JButton b;
	JLabel l;
	JCheckBox c1,c2;
	public CheckBox(){
		t=new JTextField(10);
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		b=new JButton ("OK");
		l=new JLabel("Your name");
		c1=new JCheckBox("Dancing");
		c2=new JCheckBox("Singing");
		ButtonGroup bg=new ButtonGroup();//To make radio button work properly
		bg.add(r1);
		bg.add(r2);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String name=t.getText();
				if(r1.isSelected())
					name="Mr."+name;
				else
					name="Ms."+name;
				if(c1.isSelected())
					name=name+" dancer";
				if(c2.isSelected())
					name=name+" singer";
				l.setText(name);
			}
		});
		add(t);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b);
		add(l);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}