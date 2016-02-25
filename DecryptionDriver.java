import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by kevin_000 on 2/25/2016.
 */
public class DecryptionDriver
{
    public static void main(String[] args) throws IOException
    {
        File fileOne = new File("encryptionFile1.txt");
        File newFile = new File("DecryptionFile.txt");
        PrintWriter writerOne = new PrintWriter(newFile);
        Scanner input = new Scanner(fileOne);
        String content = input.nextLine();
        char[] myChar = content.toCharArray();
        for (int i = 0; i < myChar.length ; i++)
        {
            myChar[i] -= 3;
            writerOne.print(myChar[i]);
        }

        input.close();
        writerOne.close();

    }
}
