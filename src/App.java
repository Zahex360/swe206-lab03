import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("bye, World!");
        System.out.println(readFile("Student List.txt"));

    }
    public static ArrayList<String> readFile(String filename){
        ArrayList arr = new ArrayList<>();
        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                arr.add(sc.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e.getMessage());
        }
        return arr;
        
    }
}
