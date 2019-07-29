package Employee;

import java.util.ArrayList;
import java.util.Scanner;
//this class implement the concept of polymorphism
public class Search {
	Scanner sc=new Scanner(System.in);
	/*Search Employee function is search the employee details based on the name and  get the user_input .
	 * if its matches print the matched employee details with same name
	*/
	public void Search(ArrayList<String[]> employe) 
	{
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
			System.out.println("Enter the Employee id to find the Employee");
			String EmployeeName=sc.next();
			System.out.println("Employ_id\t Employ_name\t Employ_age\t Designation\t Skills\t   \tSalary");
		for(int initial1=0; initial1<employe.size(); initial1++)
			{
				String[] TempEmp=employe.get(initial1);
				///check the employee name equals to user input name  
				if(TempEmp[1].equals(EmployeeName))
					{
					for(String str:TempEmp)
						{
							System.out.print(str+"\t\t");
						}
					System.out.println("");
					}
			}
	}
		  }
	/*Search Employee function is search the employee details based on the Designation and  get the user_input .
	 * if its matches print the matched employee details with same Designation
	*/

	public void Search(ArrayList<String[]> employe,String Designation) 
	{
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
		System.out.println("Employ_id\t Employ_name\t Employ_age\t Designation\t Skills\t   \tSalary");
		for(int initial1=0; initial1<employe.size(); initial1++)
			{
				String[] TempEmp=employe.get(initial1);
				///check the designation name equals to user input designation  
				if(TempEmp[3].equals(Designation))
					{
					for(String str:TempEmp)
						{
							System.out.printf(str+"\t\t");
						}
					System.out.println("");
					}
			}
	}
		  }


}
