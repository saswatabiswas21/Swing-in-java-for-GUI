/*Another way of doing code 2*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;//to implement action listenier interface
import java.awt.event.ActionListener; // Import ActionListener interface
public class Code3{
	public static void main(String[] args){
		XYZ xyz=new XYZ();
	}
}
class XYZ extends JFrame {
	JTextField j1,j2;
	JButton b;
	JLabel l;
	public XYZ(){
		j1=new JTextField(20);
		j2=new JTextField(20);
		b=new JButton("OK");//now the button is dumb to make it work we use actionlistener interface
		l=new JLabel("Reasult");
		add(j1);
		add(j2);
		add(b);
		ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int a1=Integer.parseInt(j1.getText());//getText gets data as string from so for converting it into int we use rapper class
				int a2=Integer.parseInt(j2.getText());
				int r=a1+a2;
				l.setText(r+"");//convering int to string
			}
		};
		b.addActionListener(al);/*Instade of using this keyword just create an ActionListener class object and passes though it*/
		add(l);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}