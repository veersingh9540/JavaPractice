public class Encapsulation
{
    public static void main(String args[]){
        System.out.println("Encapsualtion tutorial");
        System.out.println(" ");

        Human person1 = new Human("Sukhveer Singh", 61722323);
        // The Phone number variable is private and we cannot access it like this
        // person1.Phone_number  = 100;
        // System.out.println(person1.Phone_number);
        person1.showData();

        System.out.println(person1.getPhoneNumber());




    }
}

class Human
{
    private String Name;
    private int Phone_number;

    public Human(String Name, int Phone_number){
        this.Name = Name;
        this.Phone_number = Phone_number;
    }

    public void showData(){
        System.out.println(this.Name + " " + this.Phone_number);
    }

    public String getName(){
        return this.Name;
    }
    public int getPhoneNumber(){
        return this.Phone_number;
    }
}