public class KyotoCleaninService implements CleaningService{
    public String ownerName;
    public String address;
    public String phone;
    
    public Shirt washShirt(Shirt s){
        return s;
    }
    public Towl washShirt(Towl t){
        return t;
    }
    public Coat washCoat(Coat c){
        return c;
    }
}