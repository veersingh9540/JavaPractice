public class staticBlock
{
    public static void main(String a[]){
        System.out.println("this is Static block Demo");
        System.out.println(" ");
        Mobile obj1 = new Mobile();
        
        obj1.show();

        Mobile obj2 = new Mobile();
        obj2.staticShow();
        
    }
}

class Mobile
{   
    String brand;
    int price;
    //Static Variables
    static String type;
    static String location;

    static{
        type = "SmartPhone";
        location = "USA";
        System.out.println("static block ran!! ");
    }
    public Mobile(){
        this.brand = "";
        this.price = 100;
        System.out.println("Constructor Called !!");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + type + " " + location);
    }
    public static void staticShow(){
        System.out.println(location + " " + type);
    }

    
}