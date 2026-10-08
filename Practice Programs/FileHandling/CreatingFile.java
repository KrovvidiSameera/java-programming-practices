import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws Exception {

        File f = new File("data.txt");

        if (f.createNewFile())
            System.out.println("File created");
        else
            System.out.println("File already exists");
    }
}
