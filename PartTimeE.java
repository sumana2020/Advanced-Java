package Emp;

public class PartTimeE extends Employee implements Payable
{ double hr_wages;
	int hrs;
	public PartTimeE(double hr_wages,int hrs)
	{   super("ABC",23,"XYZ");
		this.hr_wages =hr_wages;
		this.hrs = hrs;
		
	}
	public void calculate()
	{
		salary = hr_wages*hrs;
	}
}
