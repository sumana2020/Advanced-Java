package Company;
import Emp.*;
public class ArrayEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[]= new Employee[3];
		e[0]= new FullTimeE(32455,34556,5678);
		e[1]= new PartTimeE(3456,40);
		e[2] = new InternE(30000);
		

	}

}
