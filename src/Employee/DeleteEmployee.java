package Employee;

import java.util.ArrayList;
import java.util.Scanner;
//delete the emplyee is done by the DeleteEmployee class and it has the Delete Employee fuction
public class DeleteEmployee {
	Scanner sc=new Scanner(System.in); 
	//Delete Employee function is delete the employee details based on the id this get the user_input if id from user and delete based on that
	public ArrayList<String[]> DeleteEmployee(ArrayList<String[]> employe) {
		// TODO Auto-generated constructor stub
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
			return null; 
		}
		else 
		{
	System.out.println("Enter the Employee id to find the Employee");
	int Emp_id=sc.nextInt();
	for(int initial1=0; initial1<employe.size(); initial1++)
	{
		String[] TempEmp=employe.get(initial1);
		///check the employee id equals to user input id  
		if(TempEmp[0].equals(Integer.toString(Emp_id)))
		{
			System.out.println("Successfully Deleted Employee_id"+TempEmp[0]);
			employe.remove(initial1);
		}
	}
	return employe;
	}
}
}
