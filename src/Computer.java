public class Computer extends TangibleAsset{
    private String name;
    private int price;
    private String color;
    private String makerName;
    
    Computer(String name, int price, String color, String makerName){
        super(name, price, color);
        this.makerName = makerName;
    }
    
    public String getMakerName(){
        this.makerName = makerName;
    }
}