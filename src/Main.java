import java.io.*;

public class Main {
    public static void main(String[] args){
        String filename = "c:¥¥test.text";
        FileWriter fw = new FileWriter(filename);
        fw.write('そ');
        fw.write('れ');
        fw.close();
    }
}