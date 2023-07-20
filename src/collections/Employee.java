package collections;

public class Employee
{
	public int EmployeeID;
	public String EmployeeName;
	public int age;
	
	public Employee(int employeeID, String employeeName, int age)
	{
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		this.age = age;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", age=" + age + "]";
	}
	
	
	
}
