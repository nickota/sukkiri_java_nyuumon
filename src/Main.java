import java.io.*;

public class Main {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("hello");
        }catch(IOException e){
            System.out.println(e.getMessage());
            System.out.println("エラーが発生しました");
        }finally{
            fw.close();
        }
    }
}