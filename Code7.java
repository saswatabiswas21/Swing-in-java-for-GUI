import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Code7{
	public static void main(String[] args){
		RadioButton rb=new RadioButton();
	}
}
class RadioButton extends JFrame{
	JTextField t;
	JRadioButton r1,r2;
	JButton b;
	JLabel l;
	public RadioButton(){
		t=new JTextField(10);
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		b=new JButton ("OK");
		l=new JLabel("Your name");
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
				l.setText(name);
			}
		});
		add(t);
		add(r1);
		add(r2);
		add(b);
		add(l);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}