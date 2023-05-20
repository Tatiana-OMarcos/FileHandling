import java.io.FileWriter; // importing FileWriter class
import java.io.IOException; // importing error handler class
public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("quotes.txt",true); // specify which text to write on
            myWriter.write("Sunny days.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
