package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CrudEmployee 
{
	public static void main(String[] args)
	{
		List<Employee> emp = new ArrayList<Employee>();
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		int ch;
		do 
		{
		
			System.out.println("Insert");
			System.out.println("Display");
			System.out.println("Delete");
			System.out.println("Update");
			
			System.out.println("Enter your choice");
			ch = input.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter employeeID");
					int eid = input.nextInt();
					
					System.out.println("Enter employee Name");
					String empname = input1.nextLine();
					
					System.out.println("Enter employee Age");
					int age = input.nextInt();
					
					emp.add(new Employee(eid,empname,age));
					System.out.println("Record inserted successfully");
					break;
					
				case 2:
					Iterator<Employee> itr = emp.iterator();
					while(itr.hasNext())
					{
						Employee e = itr.next();
						System.out.println(e);
					}
					break;
					
				case 3:
					System.out.println("Enter employeeID for delete");
					int empid = input.nextInt();
					itr = emp.iterator();
					while(itr.hasNext())
					{
						Employee employee = itr.next();
						if(employee.getEmployeeID() == empid)
						{
							itr.remove();
							while(itr.hasNext())
							{
								Employee e = itr.next();
								System.out.println(e);
							}
							System.out.println("record deleted successfully");
						}
						else
						{
							System.out.println("record is not found");
						}
					}
					break;
				case 4:
					System.out.println("Enter employeeID for Update");
					empid = input.nextInt();
		            ListIterator<Employee> listemp = emp.listIterator();
		            while(listemp.hasNext())
		            {
		            	Employee e = listemp.next();
		            	if(e.getEmployeeID() == empid)
		            	{
		            		System.out.println("Enter empname");
		            		empname = input1.nextLine();
		            		
		            		System.out.println("Enter employee Age");
							age = input.nextInt();
							
							listemp.set(new Employee(empid,empname,age));
		            	}
		            }
		            emp.forEach((n) -> System.out.println(n));
		            break;
			}
			
		}
		while(ch!=0);
		
	}
}
