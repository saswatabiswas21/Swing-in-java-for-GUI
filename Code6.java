import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Code6{
	public static void main(String[] args){
		AddSub as=new AddSub();
	}
}
class AddSub extends JFrame{
	JTextField f1,f2;
	JButton b1,b2;
	JLabel l;
	public AddSub(){
		f1=new JTextField(10);
		f2=new JTextField(10);	
		b1=new JButton("+");
		b2=new JButton("-");
				l = new JLabel("Reasult");

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int a1=Integer.parseInt(f1.getText());//getText gets data as string from so for converting it into int we use rapper class
				int a2=Integer.parseInt(f2.getText());
				int r=a1+a2;
				l.setText(r+"");//convering int to string
			}
		}
		);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int a1=Integer.parseInt(f1.getText());//getText gets data as string from so for converting it into int we use rapper class
				int a2=Integer.parseInt(f2.getText());
				int r=0;
				if(a1>a2)
					r=a1-a2;
				else
					r=a2-a1;
				l.setText(r+"");//convering int to string
			}
		}
		);
		add(f1);
		add(f2);
		add(b1);
		add(b2);
		add(l);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}