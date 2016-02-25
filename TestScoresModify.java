import org.omg.CORBA.DynAnyPackage.Invalid;

/**
 * Created by kevin_000 on 2/22/2016.
 */

public class TestScoresModify extends Exception
{
    double avg = 0;
    double acum = 0;

    public TestScoresModify()
    {

    }

    public TestScoresModify(double[] testScores) throws TestScoresModify
    {
        for (int x = 0; x < testScores.length; x++)
        {
            acum += testScores[x];
            if (testScores[x] > 100 || testScores[x] < 0)
            {
                throw new TestScoresModify();
            }

        }
        avg = acum / testScores.length;

    }

    @Override
    public String toString()
    {
        return "your average is " + avg;
    }
}
