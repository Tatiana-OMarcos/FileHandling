import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFile {
    public static void main(String[] args) {
        try{
            File obj = new File ("quotes.txt");
            Scanner myReader = new Scanner(obj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
