import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Code1 {
    public static void main(String[] args) {
        ABC abc = new ABC();
    }
}
 class ABC extends JFrame/*JFrame alwaye follow card layout that means if we enter more 
	then one massage the it will show the latest massage (Massage we entered at last)*/ 
	{
        public ABC() {
			JLabel j=new JLabel("Hello world");//Createing a massage using JLabel pakage
			add(j);//Adding that massage to the gui interface
			JLabel j1=new JLabel("Hi everyone");//Createing a massage using JLabel pakage
			add(j1);//Onlu j1 will showing in the gui interface for the concept of card layout before chaning to flowlayout
			setLayout(new FlowLayout());/*Changing cart layout to flow layout. 
										There are meny more layout like grid layout null layout etc.*/
            setVisible(true);//Visible the gui interface
			setSize(400,400);//Set the size for gui interface
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*Stop the code when exit from gui interface
															We can write 3 in place of JFrame.EXIT_ON_CLOSE because 
															the value of EXIT_ON_CLOSE is 3*/
        }
    }