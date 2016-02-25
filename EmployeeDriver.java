/**
 * Created by kevin_000 on 2/25/2016.
 */
public class EmployeeDriver
{
    public static void main(String[] args) throws Exception
    {


        try
        {
            exceptionProject employeeOne = new exceptionProject("Kevin" ,100000,15);
            if(employeeOne.getIdNum() <= 9999 && employeeOne.getIdNum() >= 0)
            {
                System.out.println("Employee created");
            }
            else
            {
                throw new InvalidEmployeeNumber();
            }

        }
        catch (InvalidEmployeeNumber e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            ProductionWorker e1 = new ProductionWorker("Bob", 2098, 3, 4, 15);
            if(e1.getShift() <= 2 && e1.getShift() >= 0)
            {
                System.out.println("Production worker created");
            }
            else
            {
                throw new InvalidShift();
            }
        }
        catch (InvalidShift e)
        {
            System.out.println(e.getMessage());
        }
        try
        {

            ProductionWorker e1 = new ProductionWorker("Bob", 2098, 3, 4, 150);
            if(e1.getHourlyPay() <= 25 && e1.getShift() >= 0)
            {
                System.out.println("Production worker created");
            }
            else
            {
                throw new InvalidPayRate();
            }
        }
        catch (InvalidPayRate e)
        {
            System.out.println(e.getMessage());
        }







    }
}
