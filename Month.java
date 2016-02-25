import org.w3c.dom.ranges.RangeException;

/**
 * Created by kevin_000 on 2/23/2016.
 */
public class Month
{
    private int monthNumber;
    private String monthName;


    public Month()
    {
        this.monthNumber = 1;
    }
    public Month(int monthNumber) throws IndexOutOfBoundsException
    {
        if(monthNumber <= 12 && monthNumber >=1)
        {
            this.monthNumber = monthNumber;
        }
        else
        {
            this.monthNumber = 1;
            throw new IndexOutOfBoundsException("Enter a Month 1-12");
        }
    }
    public Month(String monthName) throws IllegalArgumentException
    {
        if(monthName.equalsIgnoreCase("january"))
        {
            this.monthNumber = 1;
        }
        else if(monthName.equalsIgnoreCase("february"))
        {
            this.monthNumber = 2;
        }
        else if(monthName.equalsIgnoreCase("march"))
        {
            this.monthNumber = 3;
        }
        else if(monthName.equalsIgnoreCase("april"))
        {
            this.monthNumber = 4;
        }
        else if(monthName.equalsIgnoreCase("may"))
        {
            this.monthNumber = 5;
        }
        else if(monthName.equalsIgnoreCase("june"))
        {
            this.monthNumber = 6;
        }
        else if(monthName.equalsIgnoreCase("july"))
        {
            this.monthNumber = 7;
        }
        else if(monthName.equalsIgnoreCase("august"))
        {
            this.monthNumber = 8;
        }
        else if(monthName.equalsIgnoreCase("september"))
        {
            this.monthNumber = 9;
        }
        else if(monthName.equalsIgnoreCase("october"))
        {
            this.monthNumber = 10;
        }
        else if(monthName.equalsIgnoreCase("november"))
        {
            this.monthNumber = 11;
        }
        else if(monthName.equalsIgnoreCase("december"))
        {
            this.monthNumber = 12;
        }
        else
        {
            throw new IllegalArgumentException("please enter january through december");
        }
    }

    public void setMonthNumber(int monthNumber)
    {
        if(monthNumber >= 12 && monthNumber <=1)
        {
            this.monthNumber = monthNumber;
        }
        else
        {
            this.monthNumber = 1;
        }
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public String getMonthName()
    {
        if(monthNumber == 1)
        {
            monthName = "January";
        }
        else if(monthNumber == 2)
        {
            monthName = "February";
        }
        else if(monthNumber == 3)
        {
            monthName = "March";
        }
        else if(monthNumber == 4)
        {
            monthName = "April";
        }
        else if(monthNumber == 5)
        {
            monthName = "May";
        }
        else if(monthNumber == 6)
        {
            monthName = "June";
        }
        else if(monthNumber == 7)
        {
            monthName = "July";
        }
        else if(monthNumber == 8)
        {
            monthName = "August";
        }
        else if(monthNumber == 9)
        {
            monthName = "September";
        }
        else if(monthNumber == 10)
        {
            monthName = "October";
        }
        else if(monthNumber == 11)
        {
            monthName = "November";
        }
        else if(monthNumber == 12)
        {
            monthName = "December";
        }
        return monthName;

    }

    public String toString()
    {
        if(monthNumber == 1)
        {
            monthName = "January";
        }
        else if(monthNumber == 2)
        {
            monthName = "February";
        }
        else if(monthNumber == 3)
        {
            monthName = "March";
        }
        else if(monthNumber == 4)
        {
            monthName = "April";
        }
        else if(monthNumber == 5)
        {
            monthName = "May";
        }
        else if(monthNumber == 6)
        {
            monthName = "June";
        }
        else if(monthNumber == 7)
        {
            monthName = "July";
        }
        else if(monthNumber == 8)
        {
            monthName = "August";
        }
        else if(monthNumber == 9)
        {
            monthName = "September";
        }
        else if(monthNumber == 10)
        {
            monthName = "October";
        }
        else if(monthNumber == 11)
        {
            monthName = "November";
        }
        else if(monthNumber == 12)
        {
            monthName = "December";
        }
        return monthName;

    }
    public boolean equals(Month monthOne)
    {
        boolean status;
        if (this.monthNumber == monthOne.monthNumber || this.monthName.equalsIgnoreCase(monthOne.monthName))
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }
    public boolean greaterThan(int monthOne)
    {
        boolean result;
        if(this.monthNumber > monthOne)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    public boolean lessThan(int monthOne)
    {
        boolean result2;
        if(this.monthNumber < monthOne)
        {
            result2 = true;
        }
        else
        {
            result2 = false;
        }
        return result2;
    }



}
