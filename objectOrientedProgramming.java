public class objectOrientedProgramming{
    public static void main(String args[]){
        String name = "Sukhveer Singh";

        // Calculator class
        calculator obj = new calculator("Jharna");
        calculator obj2 = new calculator(name);
        int x = obj.add(5,6);
        System.out.println("The Calculator's Add funciton output is : "+ x );

        // Computer class 
        computerMethod veer = new computerMethod("Sukhveer Singh");
        veer.BuySubscription();
        veer.PlayMusic();

    }
}
class calculator
{   
    public calculator(String args){
        // This is a constuctor gets called everytime the object has been created.
        System.out.println("Constructor Called for " + args);
    }
    public int add(int args, int args2){
        int res = 0;
        res = args + args2;
        return res;
    }
}

class computerMethod
{   
    boolean subscribedMusic = false;
    public computerMethod(String s){
        System.out.println("Hello and Welcome to your computer: " + s);
    }
    public void PlayMusic(){
        if (this.subscribedMusic == true)
            System.out.println("Playing Music");
        else
            System.out.println("Subscribe Please");
    }
    public boolean BuySubscription(){
        this.subscribedMusic = true;
        return true;
    }
}

// Object Oriented Programming
// Object - Properties and Behaviour

// Jvm creates Objects in Java 