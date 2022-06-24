// Name:- Kunj Sanjaybhai Prajapati
// PROGRAM: Computer systems Technology
// Semester : 2
// ASSIGNMENT 2

public class Payroll 

{


    private int[] employeeId= new int[5];   // array to store employee id.
    private double[] hours= new double[5];  // array to store hours of employee.
    private double[] wage= new double[5];   // array to store hourly wage of employee.

    public Payroll(int[] empid, double[] hours, double[] wages) // constructor 
    {

        this.employeeId=empid;
        this.hours=hours;
        this.wage=wages;

    }

    public int[] getEmployeeid() // get method for employee id.
    {
        return employeeId;
    }

    public double[] getHours() // get method to get the hours.
    {
        return hours;
    }

    public double[] getWages() // get method to get the number of hours.
    {
        return wage;
    }

    public void serchEmployee(int[] worker,double[] hours, double[] wages, int p)  // method to search for employee and to print the wage of employee.
    {
        int[] k=worker;
        double[] h=hours;
        double[] w=wages;
        int g=0;
        for (int i=0; i<k.length; i++)
        {
            if (k[i]==p) 
                g=i;   
        } 
         
        if (g>0 && g<5) {
            System.out.println("Gross pay of employee = " + h[g]*w[g]);
        } else
            System.out.println("EmployeeId not present in array ");    
    }

}