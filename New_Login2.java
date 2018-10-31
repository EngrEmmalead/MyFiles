import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.UIManager;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.Icon;
import javax.swing.swingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

class New_Login2 extends JFrame implements ActionListener{
JPanel pan1;
JPanel pan2;
JPanel pan3;
JLabel title;
JLabel lUsername;
JLabel lPassword;
JTextField tUsername;
JPasswordField tPassword;
JButton send;
JButton reset;
JMenu jm;
JMenuBar jmb;
JMenuItem jmi;
Icon logo;
Icon re;

New_Login2(){
super("user login details");
setLayout(new BorderLayout());

jmb = new JMenuBar();
jm = new JMenu("File");
jmi = new JMenuItem("open");
jm.add(jmi);
jmb.add(jm);
setJMenuBar(jmb);

pan1 = new JPanel();
pan1.setLayout(new FlowLayout(FlowLayout.CENTER));
title = new JLabel();
//logo=new ImageIcon(getClass().getResource(" "));
//logo=new ImageIcon(getClass().getResource(" "));
title.setIcon(logo);
//title.setFont(new Font("Ariel";BOLD+Font.ITALIC,20));
title.setText("<html><font color=red size=5>Login</font><font color=blue size=5> details</font></html>");
title.setHorizontalTextPosition(SwingConstants.CENTER);
title.setVerticalTextPosition(SwingConstants.BOTTOM);

pan1.add(title);
pan2 = new JPanel();
pan2.setLayout(new GridLayout(2,2));
lUsername = new JLabel("User Name");
lPassword = new JLabel("Password");
tUsername = new JTextField();
tPassword = new JPasswordField();
tPassword.addKeyListener(
new KeyListener(){
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	public void keyPressed(KeyEvent ke){
		if(ke.getKeyCode() == KeyEvent.VK_ENTER){
			doAction();
		}
	
	}
}
);
pan2.add(lUsername);
pan2.add(tUsername);
pan2.add(lPassword);
pan2.add(tPassword);

pan3 = new JPanel();
pan3.setLayout(new FlowLayout());
send = new JButton("Submit");
send.addActionListener(this);
reset = new JButton("Reset");
reset.addActionListener(this);

pan3.add(send);
pan3.add(reset);
add(pan1,BorderLayout.NORTH);
add(pan2,BorderLayout.CENTER);
add(pan3,BorderLayout.SOUTH);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

try{
//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
setDefaultLookAndFeelDecorated(true);
setLocationRelativeTo(null);
setSize(350,200);
setVisible(true);
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

}
catch(Exception e){}


}

void doAction(){
String username = tUsername.getText().trim();
		String password = tPassword.getText().trim();
				if(username.length() == 0 || password.length()==0){
				JOptionPane.showMessageDialog(null,"Username or Password cannot be empty");
				}
			else if(username.equalsIgnoreCase("niit") && password.equals("admin")){
				
				new Menu();
				
			}
			else{
				JOptionPane.showMessageDialog(null,"Invalid Username / Password");
			}
}
	public void actionPerformed(ActionEvent ae){
		/*Object o = ae.getSource();	
		if (o==send){---}*/
		String name = ae.getActionCommand();
		if (name.equals("Submit")){
		
			doAction();
		}
		else{
			tUsername.setText("");
			tPassword.setText("");
		}
	
	}

public static void main(String [] args){
new New_Login2();
}
}