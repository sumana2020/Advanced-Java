package Emp;

public class InternE extends Employee implements Payable
{ double fixed_pay;
	
	public InternE(double fp)
	{   super("ABC",23,"XYZ");
		this.fixed_pay =fp;
		
	}
	public void calculate()
	{
		salary = fixed_pay;
	}
}
