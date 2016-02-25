import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by kevin_000 on 2/23/2016.
 */
public class FileEncryptionDriver
{
    public static void main(String[] args) throws IOException
    {

       File fileOne = new File("encryptionFile1.txt");
        PrintWriter writerOne = new PrintWriter(fileOne);
        String message = "Hello how are you today";

            char[] myChar = message.toCharArray();
            for (int i = 0; i < myChar.length ; i++)
            {
                myChar[i] += 3;
                writerOne.print(myChar[i]);
            }


        writerOne.close();



    }
}
