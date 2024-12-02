public class MethodOverloading
{
    public static void main(String a[]){
        Calcu objC = new Calcu();
        AdvCalc objA = new AdvCalc();

        System.out.println(objA.add(5,1));
        objA.show();
    }
}

class Calcu 
{
    public void show(){
        System.out.println(" In Calcu ");
    }
    public int add(int a, int b){
        return a+b;
    }
}

class AdvCalc extends Calcu
{
    public int add(int a, int b){
        return a+b+1;
    }
}