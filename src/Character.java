public abstract class Character {
    String name;
    int hp;
    public abstract void attack(Matango m);
    public void run(){
        System.out.println("走りまーす");
    };
}