import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class StudentClass implements ActionListener,ItemListener {
	JFrame jf;
	JLabel lb1,lb2;
	JTextField jt1,jt2;
	JCheckBox e1,e2,e3;
	JButton btn;
	static Connection con ;
	static Statement st;
	static PreparedStatement pt;
	StudentClass()
	{
		
		jf = new JFrame("Student Prog");
		lb1 = new JLabel("Enter Student name");
		jt1 = new JTextField(20);
		lb2 = new JLabel("Enter USN");
		jt2 = new JTextField(20);
		e1 = new JCheckBox("Java");
		e2 = new JCheckBox("Python");
		e3 = new JCheckBox("Javascript");
		e1.addItemListener(this);
		e2.addItemListener(this);
		e3.addItemListener(this);
		btn = new JButton("Print");
		btn.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String name = jt1.getText();
		String usn = jt2.getText();
		String cbv;
		if(e1.isSelected())
		 cbv= e1.getText();
		else
		 if(e2.isSelected())
			 cbv = e2.getText();
		 else
			 cbv = e3.getText();
		try {
			pt = con.prepareStatement("insert into electiveTB values(?,?,?);");
			pt.setString(1, name);
			pt.setString(2,usn);
			pt.setString(3, cbv);
			pt.executeUpdate();
			
		} catch (SQLException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from electiveTB;");
			while(rs.next())
			{
				System.out.print("Name "+rs.getString(1));
				System.out.print("USN "+rs.getString(2));
				System.out.println("Elective "+rs.getString(3));
				JOptionPane.showMessageDialog(null,rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}

}
