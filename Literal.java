public class Literal {
    public static void main(String args[]){

        // Literals 
        int num1 = 10_000_000;
        System.out.println("This is the literal int: "+ num1);
        // Data Typer Conversion and Type Casting
        // Can we change the type of the variable in JAVA? : NO
        // We Can convery the one DT to another Explicitly is calles as Casting
        int a = 12;
        byte b = 127 ;
        // we can't do b = a (Since, b[Byte] have lesser range than a[int])
        b = (byte)a;
        System.out.println(b);
        
    }
}
