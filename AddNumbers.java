import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class AddNumbers implements ActionListener {
	JTextField num1,num2,result;
	JLabel n1,n2,res;
	JButton btn;
	JCheckBox c1,c2,c3;
	AddNumbers(String st){
		JFrame jf = new JFrame(st);
		num1 = new JTextField("Enter number",10);
		num2 = new JTextField("Enter number",10);
		result = new JTextField("Result",10);
		result.setEditable(false);
		btn = new JButton("Click to Add");
		n1 = new JLabel("Enter first number");
		n2 = new JLabel("Enter second number");
		res = new JLabel("Result is:");
		c1= new JCheckBox("Option A");
		c2= new JCheckBox("Option B");
		c3= new JCheckBox("Option C");
		JButton btn = new JButton("Action on checkbox");
		jf.add(n1);
		jf.add(num1);
		jf.add(n2);
		jf.add(num2);
		jf.add(res);
		jf.add(result);
		jf.add(btn);
		btn.addActionListener(this);
		btn.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(c1.isSelected()) {System.out.println(c1.getText());}
				if(c2.isSelected()) {System.out.println(c2.getText());}
				if(c3.isSelected()) {System.out.println(c3.getText());}
		    JOptionPane.showMessageDialog(null, "GFG", "Geeks Premier League 2023",JOptionPane.WARNING_MESSAGE);
	        String name = JOptionPane.showInputDialog("Enter your Article Name:","Title Article");
	        JOptionPane.showMessageDialog(null, "Article name "+name, "Article type",JOptionPane.INFORMATION_MESSAGE);
	        int choice = JOptionPane.showConfirmDialog(null, "Do you want to save Changes?","Confirmation", JOptionPane.YES_NO_OPTION);
	        
	        // Check the user's choice and display a corresponding message
	        if (choice == JOptionPane.YES_OPTION) {
	            // If the user chose 'Yes', show a message indicating that changes are saved
	            JOptionPane.showMessageDialog(null, "Changes saved.");
	        } else if (choice == JOptionPane.NO_OPTION) {
	            // If the user chose 'No', show a message indicating that changes are not saved
	            JOptionPane.showMessageDialog(null, "Changes not saved.");
	        } /*else {
	            // If the user chose 'Cancel' or closed the dialog, show a message indicating the operation is canceled
	            JOptionPane.showMessageDialog(null, "Operation canceled.");
	        }*/
	        Object[] options = { "High", "Med", "low" };
	        int choice1 = JOptionPane.showOptionDialog(
	                null, // Parent component (null means center on screen)
	                "Do you want to proceed?", // Message to display
	                "Custom Options", // Dialog title
	                0, // Option type (Yes, No, Cancel)
	                JOptionPane.QUESTION_MESSAGE, // Message type (question icon)
	                null, // Custom icon (null means no custom icon)
	                options, // Custom options array
	                options[2] // Initial selection (default is "Cancel")
	            );
	        
	        if(choice1==0)
	        	JOptionPane.showMessageDialog(null,"High is pressed");
	        else if(choice1==1)
	        	JOptionPane.showMessageDialog(null,"Med is pressed");
	        else
	        	JOptionPane.showMessageDialog(null,"Low is pressed");

			}
				});
		jf.setSize(1000, 1000);
		jf.setLayout(new GridLayout(10,2));
		jf.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AddNumbers("Add numbers");

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn)
		{
			int n1 = Integer.parseInt(num1.getText());
			int n2 = Integer.parseInt(num2.getText());
			int res = n1+n2;
			result.setText(res+"");
					}
	}

}
