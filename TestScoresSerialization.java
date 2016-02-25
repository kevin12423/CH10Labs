/**
 * Created by kevin_000 on 2/25/2016.
 */
import java.io.Serializable;
public class TestScoresSerialization implements Serializable
{

        double avg = 0;
        double acum = 0;

        public TestScoresSerialization (double[] testScores)
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


