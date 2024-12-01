public class string
{
    public static void main(String a[]){
        String Name = new String("Sukhveer");
        // String Concat
        Name = Name + " Singh";
        System.out.println(Name + "  Exercitation ad deserunt enim occaecat.");

        // Mutable String
        String S1 = "Sukhveer";
        String S2 = "Sukhveer"; // These are mutable string that uses String constant Pool

        System.out.println(S1 == S2);

        // ImMutable String 
        // StringBuffer and StringBuilder

        StringBuffer sb = new StringBuffer("This is Java"); // Initally 16bytes without any Data
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //Assign StringBuffer to String
        // String str = sb; // We can't

        sb.deleteCharAt(2);
        sb.insert(10, "SO good");
        System.out.println(sb);

        // String buffer is thread safe and StringBuilder is not

        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        Mobile.Name = "SmartPhone";

        obj1.Brand = "Apple";
        obj1.Price = 1500;
        obj1.Network = "T-Mobile";

        obj2.Brand = "Samsumg";
        obj2.Price = 1000;
        obj2.Network = "Verizon";

        obj1.show();
        obj2.show();
        Mobile.show1();

        // Mobile[] array = new Mobile[2];
        // array[0] = obj1;
        // array[1] = obj2;
        // for (Mobile mob: array){
        //     System.out.println(mob.Brand);
        // }

    
    }
    
}

class Mobile
{
    String Brand;
    int Price;
    String Network;
    static String Name; // Static variable

    public void show(){
        System.out.println(Brand + " " + Price + " " + Network);
    }

    public static void show1(){
        System.out.println("Static method Called  " + Name); // We cannot use non-static variables in here
    }


}