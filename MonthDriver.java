/**
 * Created by kevin_000 on 2/23/2016.
 */
public class MonthDriver
{
    public static void main(String[] args)
    {
        Month monthOne = new Month("may");
        Month monthTwo = new Month(12);
        System.out.println(monthOne);
        System.out.println(monthTwo);
        try
        {
            if (monthOne.equals(monthTwo))
            {
                System.out.println("They are equal");
            } else
            {
                System.out.println("They are not equal");
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
