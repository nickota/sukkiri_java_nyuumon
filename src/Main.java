public class Main{
    public static void main(String[] args){
        Character[] c = new Character[5];
        c[0] = new Hero;
        c[1] = new Hero;
        c[2] = new Wizard;
        ...
        //別々の型に対して同じ配列にいれることができて、同一の処理を行うことができる
        for(Character ch : c){
            ch.setHp(ch.getHp() =+ 50);
        }
    }
}