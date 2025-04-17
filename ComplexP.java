package P1;

public class ComplexP {
int real, imag;
public ComplexP(){
	real=imag=0;
}
public ComplexP(int x){
	real=imag=x;
}
public ComplexP(int x,int y){
	real=y;
	imag=x;
}
public ComplexP(ComplexP c)
{
	real = c.real;
	imag = c.imag;
	
}
public ComplexP add(ComplexP c1)
{
	ComplexP c3= new ComplexP();
	c3.real = c1.real+real;
	c3.imag = c1.imag+ imag;
	return c3;
}
public ComplexP add(ComplexP c1,ComplexP c2)
{
	ComplexP c3= new ComplexP();
	c3.real = c1.real+c2.real;
	c3.imag = c1.imag+ c2.imag;
	return c3;
}
public String toString()
{
	return "Real Part "+real+" imag part "+imag;
}

}
