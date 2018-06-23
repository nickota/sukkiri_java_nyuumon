public class Main {
    public static void main (String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("NullPointException 例外をcatchしました");
            System.out.println("--スタックトレースはここから--");
            e.printStackTrace();
            System.out.println("--スタックトレースはここまで--");
        }
        
    }
}