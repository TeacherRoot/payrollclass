import java.util.Scanner;
/**
 * Tester for the Payroll class.
 *
 * @author Ann Root
 * @version June 26, 2018
 */
public class GrossPay
{
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        double hours, rate;
        
        Scanner keyboard = new Scanner(System.in);
        
        Payroll employee = new Payroll();
        
        System.out.println("How many hourse did the employee work?");
        hours = keyboard.nextDouble();
		employee.setHoursWorked(hours);
		
        
        System.out.println("What is the rate of pay?:");
        rate = keyboard.nextDouble();
		employee.setPayRate(rate);
        
        Systme.out.println("The employee's groass pay is $" + employee.getGrossPay());
    }
}
