import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("bye World!");
        System.out.println(generateGroups(readFile("Student List.txt"),4));

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
    public static ArrayList<ArrayList<String>> generateGroups(ArrayList<String> studentList, int  numOfGroups){
        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>>();

        Collections.shuffle(studentList);
        for(int i = 0 ; i< numOfGroups; i++){
            groups.add(new ArrayList<String>());
        }

        for(int i = 0  ; i < studentList.size(); i++ ){
            groups.get(i%numOfGroups).add(studentList.get(i));
        }
        return groups;
    }
}
