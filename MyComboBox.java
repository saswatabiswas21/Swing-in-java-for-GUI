import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyComboBox{
	public static void main(String[] args){
		JFrame jf=new JFrame("My Combo Box");
		jf.setSize(700,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=jf.getContentPane();
		c.setLayout(null);
		
		String[] values={"A","B","C","D","C","C"};
		JComboBox c1=new JComboBox(values);
		c1.setBounds(100,100,100,30);
		c.add(c1);
		
		JButton b=new JButton("OK");
		b.setBounds(250,100,100,30);
		c.add(b);
		
		JLabel l=new JLabel("");
		l.setBounds(100,300,100,30);
		c.add(l);
		
		//c1.setSelectedItem("B");
		//c1.setSelectedIndex(3);
		
		c1.addItem("E");
		//c1.removeItem("C");//Remove the first apperiance of the element
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//String s=(String)c1.getSelectedItem();//To show the reasult
				String s=String.valueOf(c1.getSelectedIndex());//To show the index number of the selected option
				l.setText(s);
			}
		});
		
		jf.setVisible(true);
	}
}