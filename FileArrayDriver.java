import java.io.*;

/**
 * Created by kevin_000 on 2/23/2016.
 */
public class FileArrayDriver
{
    public static void main(String[] args) throws Exception
    {
        int[] data = {44,3,6,7,5,4,3,2};
        FileArray.writeArray("NewFile.dat",data);
        FileArray.readArray("NewFile.dat",data);
    }
}
