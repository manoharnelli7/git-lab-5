class employee
{
	String ID, name;
	double salary;
	employee(String id,String nm,double sal)
	{
		ID=id;
		name=nm;
		salary=sal;
	}
	void raiseSalary (double percent)
	{
		salary=salary+salary*percent/100.0;
}
	void printemp()
	{
		System.out.println("Employee ID="+ID);
		System.out.println("Employee name="+name);
		System.out.println("employee salary"+salary);
	}
}
public class lab3 {
	public static void main(String[] args) {
		employee e=new employee("JNN01","Virat",100000.5);
		System.out.println("before raise of salary");
				e.printemp();
		System.out.println("after raise of salary");
		e.raiseSalary(10);
		e.printemp();
		employee f=new employee("JNN02","Rohit",1500000.5);
		System.out.println("before raise of salary");
				f.printemp();
		System.out.println("after raise of salary");
		f.raiseSalary(20);
		f.printemp();
}
}
