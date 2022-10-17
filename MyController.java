import java.util.Scanner;

public class MyController
{
public void test() {
	System.out.println("1.adding  2.deleting 3.displaying  4.updating");
	Employee e=new Employee();
	ServiceImpl ser=new ServiceImpl();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	if(choice==1)
	{
		System.out.println("enter emp id");
		e.setId(sc.nextInt());
		System.out.println("enter emp name");
		e.setName(sc.next());
		System.out.println("enter empaddress");
		e.setAddress(sc.next());
		System.out.println("enter emp salary");
		e.setSalary(sc.nextInt());
		
		ser.addEmployee(e);
		
	}
	else if(choice==2)
	{
		System.out.println("enter id to delete");
		e.setId(sc.nextInt());
		ser.deleteEmployee(e);
		
	}
	else if(choice==3)
	{
		ser.displayEmployee();
	}
	else if(choice==4)
	{
		System.out.println("enter id to update");
		e.setId(sc.nextInt());
		System.out.println("enter new name");
		e.setName1(sc.next());
		System.out.println("enter new address");
		e.setAdress1(sc.next());
		System.out.println("enter new salary");
		e.setSalary1(sc.nextInt());
		ser.updateEmployee(e);
	}
	System.out.println("to continue  crud operations press 1 or 2 for exit");
	int i=sc.nextInt();
	if(i==1)
	{
		test();
	}
	else
	{
		System.out.println("performing is finished");
	}
			

	}
public static void main(String[] args) {
	MyController c=new MyController();
	c.test();
	
}
}
