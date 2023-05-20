import java.io.File; // import the File class
public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File ( "grocery.txt");
        if (obj.delete()) {
            System.out.println("File " + obj.getName() + "delete");
        }else{
            System.out.println("Dailed to delete the file.");
        }
    }
}
