import java.io.*;

/**
 * Created by kevin_000 on 2/22/2016.
 */
public class TestScoresDriver
{
    public static void main(String[] args) throws Exception
    {
        double[] testScores = {70,80,90,10,100};
        try
        {
            TestScores teacherOne = new TestScores(testScores);
            System.out.println(teacherOne);


        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Please enter all positive numbers for test scores also none over 100%");
        }





            TestScoresSerialization test3 = new TestScoresSerialization(testScores);
            FileOutputStream outStream = new FileOutputStream("objects.dat");
            ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
            objectOutputFile.writeObject(test3);
            objectOutputFile.close();

            FileInputStream inStream = new FileInputStream("objects.dat");
            ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

            TestScoresSerialization test4;
            test4 = (TestScoresSerialization) objectInputFile.readObject();

        System.out.println("Your deserialized object is: " + test4);










    }



}
