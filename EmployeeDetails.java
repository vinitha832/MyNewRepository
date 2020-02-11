
public class EmployeeDetails {
     int empid;
     String empName;
     float empsal;
     public EmployeeDetails()
     {
    	 
     }
     public EmployeeDetails(int empid,String empName,float empsal)
     {
    	 this.empid=empid;
    	 this.empName=empName;
    	 this.empsal=empsal;
     }
     public void calculateSalary()
     {
    	 System.out.println("Employee salary :"+(empsal+2000));
     }
	public static void main(String[] args) {
	
		EmployeeDetails ed=new EmployeeDetails ();
		ed.calculateSalary();
	}

}
