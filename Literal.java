public class Literal {
    public static void main(String args[]){

        // Literals 
        int nums = 10_000_000;
        System.out.println("This is the literal int: "+ nums);
        // Data Typer Conversion and Type Casting
        // Can we change the type of the variable in JAVA? : NO
        // We Can convery the one DT to another Explicitly is calles as Casting
        int a = 12;
        byte b = 127 ;
        // we can't do b = a (Since, b[Byte] have lesser range than a[int])
        b = (byte)a;
        System.out.println("Integer converted to Byte: "+ b);
        
        // Let's try with float and int
        float f = 505.3f;
        int t = (int) f;
        System.out.println("Float is converted to Integer: "+ t);

        // Operators in Java
        // "==", "!=", "&&", "||"
        // "+" add, "-" Sub, "*" mul, "/" divide, "%" Remainder
        int num1 = 7;
        int num2 = 5;
        int result = num1+num2;
        System.out.println("Adding: "+ result);
        int num3 = 10;
        num3++;
        System.out.println("Adding 1: "+ num3);
        num3--; // Postorder Increment
        --num3; // Preorder Icrement
        System.out.println("Subtracting 1: "+ num3);

        // --num and num-- or ++num and num++ will behave different in extracting the value.

        int num4 = 10;
        // For example here 
        int res = num4++ ; // First it will fetch the value of the num4 and res will be the value and then assign the +1 
        // this will give res = 10 
        int res2 = ++num4;
        // this will first +1 and then save it to the res2

    }
}
