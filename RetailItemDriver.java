/**
 * Created by kevin_000 on 2/22/2016.
 */
public class RetailItemDriver
{
    public static void main(String[] args)
    {
        try
        {
            RetailItem item1 = new RetailItem();
            RetailItem item2 = new RetailItem();
            RetailItem item3 = new RetailItem();

            item1.setDescription("Item #1: Jacket ");
            item2.setDescription("Item #2: Jeans");
            item3.setDescription("Item #3: Shirt");

            item1.setUnitsOnHand(-12);
            item2.setUnitsOnHand(40);
            item3.setUnitsOnHand(20);

            item1.setPrice(59.95);
            item2.setPrice(34.95);
            item3.setPrice(24.95);

            System.out.printf(" %-14s  %-23s  %s\n","Description","Units on Hand", "Price");
            System.out.println("-----------------------------------------------");
            System.out.printf("%-20s %-20s %s\n",item1.getDescription(),item1.getUnitsOnHand(),item1.getPrice());
            System.out.printf("%-20s %-20s %s\n",item2.getDescription(),item2.getUnitsOnHand(),item2.getPrice());
            System.out.printf("%-20s %-20s %s",item3.getDescription(),item3.getUnitsOnHand(),item3.getPrice());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }



    }
}
