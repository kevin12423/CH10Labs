/**
 * Created by kevin_000 on 2/23/2016.
 */
import java.util.Scanner;
public class PayRollDriver
{
    public static void main(String[] args)
    {

        try
        {
            Scanner keyboard = new Scanner(System.in);
            PayRoll employee1 = new PayRoll();
            System.out.println("Please enter the name of employee");
            String employee1Name = keyboard.nextLine();
            employee1.setName(employee1Name);
            System.out.printf("\nPlease enter %s's ID number\n", employee1Name);
            int idNum = keyboard.nextInt();
            employee1.setId(idNum);
            System.out.printf("\nPlease enter %s's pay rate\n", employee1Name);
            double payRate = keyboard.nextDouble();
            employee1.setPay(payRate);
            System.out.printf("\nPlease enter %s's hours worked\n", employee1Name);
            double hoursWorked = keyboard.nextDouble();
            employee1.setHours(hoursWorked);
            double grossPay = payRate * hoursWorked;
            System.out.printf("\n%s's gross pay is: $%,.2f", employee1Name, grossPay);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
