import javax.swing.*;
import java.awt.*;
public class Code5{
	public static void main(String[] args){
		ABC abc=new ABC();
	}
}
class ABC extends JFrame{
	JTextField j1,j2;
	JButton b;
	JLabel l;
	public ABC(){
		j1=new JTextField(10);
		j2=new JTextField(10);
		b=new JButton("OK");
		l=new JLabel("reasult");
		add(j1);
		add(j2);
		add(b);
		
		/*ActionListener al=new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int a1=Integer.parseInt(j1.getText());//getText gets data as string from so for converting it into int we use rapper class
				int a2=Integer.parseInt(j2.getText());
				int r=a1+a2;
				l.setText(r+"");//convering int to string
			}
		};*/
		
		//Inseted of using the above we use lamda expression shown in below;
		//Lamda expression==> It is applicable from version 8 .It is only appliclable on functional interface(only one methord decleration).
		b.addActionListener(ae ->
			{
				int a1=Integer.parseInt(j1.getText());
				int a2=Integer.parseInt(j2.getText());
				int res=a1+a2;
				l.setText(res+"");
			}
		);
		add(l);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}