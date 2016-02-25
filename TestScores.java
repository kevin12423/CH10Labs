/**
 * Created by kevin_000 on 2/22/2016.
 */


public class TestScores
{
    double avg = 0;
    double acum = 0;

    public TestScores(double[] testScores)
    {

        for (int x = 0; x < testScores.length; x++)
        {
            acum += testScores[x];
            if(testScores[x] > 100 || testScores[x] < 0)
            {
                throw new IllegalArgumentException();
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
