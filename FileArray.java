/**
 * Created by kevin_000 on 2/23/2016.
 */
import java.io.*;
public class FileArray
{
    public static void writeArray(String nameOfFile, int[] data) throws Exception
    {

        ObjectOutputStream  outputStream = null;

        try
        {
            outputStream = new ObjectOutputStream(new FileOutputStream(nameOfFile));
        }

        catch(IOException e){
            System.out.println("Could not open the file." + e);
            System.exit(0);
        }
        try
        {
            outputStream.writeObject(data);
            outputStream.close();
        }
        catch(IOException e)
        {
            System.out.println("Writing error: " + e);
            System.exit(0);
        }

    }

    public static void readArray(String nameOfFile, int[] data)
    {

        ObjectInputStream inputStream = null;
        try
        {
            inputStream = new ObjectInputStream(new FileInputStream(nameOfFile));
        }
        catch(IOException e)
        {
            System.out.println("There was a problem opening the file: " + e);
            System.exit(0);
        }
            int[] test2 = null;
            try{

                test2 = (int[])inputStream.readObject();
                for (int x = 0; x < data.length; x++)
                {
                    System.out.println(test2[x]);
                }
                inputStream.close();
            }catch(Exception e){
                System.out.println("There was an issue reading from the file: " + e);
                System.exit(0);
            }

        }
    }

