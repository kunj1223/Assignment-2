// Name:- Kunj Sanjaybhai Prajapati
// PROGRAM: Computer systems Technology
// Semester : 2
// ASSIGNMENT 2



import java.util.Scanner; // importing scanner object.

public class Test {

    public static void main(String[] args) // main class
    {

        Scanner in= new Scanner(System.in); // scanner object

        int[] empid = new int[5]; // array to store employee id input from user.
        double[] time = new double[5]; // array to store number of hours worked input from user.
        double[] money = new double[5]; // array to store wages of employee input from user.

        for (int i=0; i<empid.length; i++) // for loop to continuously get input 5 times from user.
        {

            System.out.println("Pleae enter employee Id ");
            empid[i] =in.nextInt();
            System.out.println("Pleae enter number of hours worked ");
            time[i]=in.nextDouble();
            System.out.println("Pleae enter employee's hourly wage ");
            money[i]=in.nextDouble();

        }
        

        Payroll emp=new Payroll(empid, time, money); // creating emp object of payroll class.

        int[] worker=emp.getEmployeeid();
        double[] work=emp.getHours();
        double[] earnings=emp.getWages();

        System.out.println("empid    hours     payrate     grosspay"); 

        for(int i=0; i<worker.length; i++) // for loop to print employee number , work , earning and gross pay.
        {
            System.out.println(worker[i]+"      " + work[i]+ "       " + earnings[i]+"     "+ work[i]*earnings[i]);
        }

        System.out.println("Enter empid of employee which you want to calculate gross pay? ");
        int i=in.nextInt(); // to take input from user to serch from employee id.

        emp.serchEmployee(worker, work, earnings, i); // to invoke method to search for employee and his gross pay.
        in.close(); // scanner closed.
       



    }
}
