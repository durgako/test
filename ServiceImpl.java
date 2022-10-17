
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class ServiceImpl implements ServiceDao {

	@Override
	public void addEmployee(Employee employee)
	
	{
		ArrayList<Employee>al=new ArrayList<Employee>();
		
		try
		{
			
			Connection	connection =ConnectionFactory.getConnection();
			Statement stmt=connection.createStatement();
			stmt.executeUpdate("insert into db.employee(`id`,`name`,`address`,`salary`)values('"+employee.getId()+"','"+employee.getName()+"','"+employee.getAddress()+"','"+employee.getSalary()+"')");
			System.out.println("one row inserted succesfully");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	

	@Override
	public void deleteEmployee(Employee employee) {
		
		ArrayList<Employee>al=new ArrayList<Employee>();
		try
		{
			Connection	connection =ConnectionFactory.getConnection();
			Statement stmt=connection.createStatement();
			stmt.executeUpdate("delete from db.employee where id='"+employee.getId()+"'");
			System.out.println("one row deleted succesfully");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		ArrayList<Employee>al=new ArrayList<Employee>();
		try
		{
			
			Connection	connection =ConnectionFactory.getConnection();
			Statement stmt=connection.createStatement();
			stmt.executeUpdate("update db.employee set name='"+employee.getName1()+"',address='"+employee.getAdress1()+"',salary='"+employee.getSalary1()+"'where id='"+employee.getId()+"'");
					
			System.out.println("one row updated  succesfully");
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}



	@Override
	public void displayEmployee() {
		ArrayList<Employee>al=new ArrayList<Employee>();
	try
	{
	
		Connection	connection =ConnectionFactory.getConnection();
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery("select * from db.employee");
		while(rs.next())
		{
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAddress(rs.getString(3));
		e.setSalary(rs.getInt(4));
		
		al.add(e);
		}
		for(Employee s:al)
		{
		System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress()+" "+s.getSalary());
		}
		
	}catch (Exception e) {
		System.out.println(e);
	}
		
	}

}
