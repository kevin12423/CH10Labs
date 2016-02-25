/**
 * Created by kevin_000 on 2/25/2016.
 */
public class exceptionProject
{
    private String name;
    private int idNum;
    private int hireDate;

    public exceptionProject(String name, int idnum, int hireDate)
    {
        this.name = name;
        this.idNum = idnum;
        this.hireDate = hireDate;

    }

    public String getName()
    {

        return name;
    }

   public int getIdNum()
   {
       return idNum;
   }

    public int getHireDate()
    {

        return hireDate;
    }
}
