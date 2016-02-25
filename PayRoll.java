/**
 * Created by kevin_000 on 2/23/2016.
 */
public class PayRoll
{
    private String name;
    private int id;
    private double pay;
    private double hours;

    public void setName(String name) throws IllegalArgumentException
    {
        if(name.equals(""))
        {
            throw new IllegalArgumentException("Please enter a name");
        }
        else
        {
            this.name = name;
        }
    }
    public  void setId(int id) throws IllegalArgumentException
    {
        if (id <= 0)
        {
            throw new IllegalArgumentException("Please enter a valid ID number greater than 0");
        }
        else
        {
            this.id = id;
        }
    }
    public void setPay(double pay) throws IllegalArgumentException
    {
        if (pay < 0 || pay > 25)
        {
            throw new IllegalArgumentException("Pay must be more than 0 but less than or equal to 25");
        }

        else
        {
            this.pay = pay;
        }
    }
    public void setHours(double hours) throws IllegalArgumentException
    {
        if (hours < 0 || hours > 84)
        {
            throw new IllegalArgumentException("Hours must be more than 0 and less than 84");
        }
        else
        {
            this.hours = hours;
        }
    }
    public String getName()
    {
        return this.name;
    }
    public int getId()
    {
        return this.id;
    }
    public double getPay()
    {
        return this.pay;
    }
    public double getHours()
    {
        return this.hours;
    }




}
