import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class New_file{
    public static void main(String[] args) {
        try {
        FileWriter create = new FileWriter("newfile.txt");
            
        // create.createNewFile();
        create.write("Hellow Raman\n nkfksd");
        create.close();
        System.out.println("file Creates");
        } catch (IOException e) {
            System.out.println("File Not Created: " + e);
            e.printStackTrace();
        }
        
    }
}