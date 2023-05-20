import java.io.File;// import file class
import java.io.IOException; // import the IOException class to handle error
public class CreaterFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("grocery.txt");
            if (myObj.createNewFile()){
                System.out.println("File created : " + myObj.getName());
            } else {
                System.out.println("File already exist.");
            }
        }
        catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}





//import java.io.File;// import file class
//import java.io.IOException; // import the IOException class to handle error
//public class CreaterFile {
//    public static void main(String[] args) {
//        try{
//            File myObj = new File("grocery.txt");
//            if (myObj.createNewFile()){
//                System.out.println("File created : " + myObj.getName());
//            } else {
//                System.out.println("File already exist.");
//            }
//        }
//        catch (IOException e){
//            System.out.println("An error occured.");
//        }
//    }
//}