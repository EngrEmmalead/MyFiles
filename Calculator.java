import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Calculator extends JFrame{
	public Calculator(){
	JPanel jp1 = new JPanel();
	jp1.setLayout(new GridLayout(4,4));
	for(int i=1; i<=9; i++){
		jp1.add(new JButton("" + i));
		}
		
		jp1.add(new JButton("" + 0));
		jp1.add(new JButton("+"));
		jp1.add(new JButton("*"));
		jp1.add(new JButton("ON"));
		jp1.add(new JButton("OFF"));
		jp1.add(new JButton("-"));
		jp1.add(new JButton("/"));
		
	JPanel jp2 = new JPanel(new BorderLayout());
 	jp2.add(new JTextField("Display"), BorderLayout.NORTH);
	jp2.add(jp1, BorderLayout.CENTER);
	
	add(jp2, BorderLayout.EAST);
	add(new JButton("Food to be placed here"), BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		//try{
	//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//}
//catch(Exception e){}		
		Calculator cal = new Calculator();
		cal.setTitle("Engr Emma-Lead Calculator");
		cal.setSize(400, 250);
		cal.setLocationRelativeTo(null);
		cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cal.setVisible(true);
		
	}
	
}