package Emp;

public class FullTimeE extends Employee implements Payable
{ double basic, da, hra;
	public FullTimeE(double basic,double da,double hra)
	{   super("ABC",23,"XYZ");
		this.basic = basic;
		this.da = da;
		this.hra = hra;
	}
	public void calculate()
	{
		salary = basic+da+hra;
	}
}