/**
 * Created by kevin_000 on 2/22/2016.
 */
public class RetailItem extends Exception
{

        private String description;
        private int unitsOnHand;
        private double price;
    public RetailItem()
    {

    }

        public void setDescription(String description)
        {
            this.description = description;
        }
        public void setUnitsOnHand(int unitsOnHand)
        {
            if (unitsOnHand >= 0)
            {
                this.unitsOnHand = unitsOnHand;
            }
            else
            {
                throw new IllegalArgumentException("Units on hand needs to be a positive number");

            }

        }
        public void setPrice(double price) throws IllegalArgumentException
        {
            if (price >= 0)
            {
                this.price = price;
            }
            else
            {
                throw new IllegalArgumentException("Price needs to be a positive number");
            }
        }

        public String getDescription()
        {
            return this.description;
        }
        public int getUnitsOnHand()
        {

            return this.unitsOnHand;
        }
        public  double getPrice()
        {
            return this.price;
        }
    }

