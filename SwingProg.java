import java.awt.GridLayout;

import javax.swing.*;
public class SwingProg {
	JFrame jf = new JFrame("My First GUI");
	JLabel jl = new JLabel("Enter Name");
	JTextField tb = new JTextField(20);
	JLabel jl1 = new JLabel("Enter Password");
	JPasswordField pwd = new JPasswordField(10);
	JRadioButton r1 = new JRadioButton("Male");
	JRadioButton r2 = new JRadioButton("Female");
	ButtonGroup G = new ButtonGroup();
	JLabel jl2 = new JLabel("Enter Subject");
	JTextField tb1 = new JTextField(20);
	JButton btn = new JButton("Click");
	JCheckBox cb = new JCheckBox("Subject1");

	SwingProg()
	{
		pwd.setEchoChar('c');
		jl.setBounds(100, 60, 100, 60);
		tb.setBounds(50, 50, 50, 50);
		jf.add(jl);
		jf.add(tb);
		jf.add(jl1);
		jf.add(pwd);
		jf.add(jl2);
		jf.add(tb1);
		jf.add(btn);
		jf.add(cb);
		G.add(r1);
		G.add(r2);
		//jf.add(G); // cannot add button group
		jf.add(r1);
		jf.add(r2);
		
		
		//jf.add(tb1);
		jf.setVisible(true);
		jf.setSize(800, 800);
		jf.setLayout(new GridLayout(3,2));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingProg();

	}

}
