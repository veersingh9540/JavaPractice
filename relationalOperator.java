public class relationalOperator {
    public static void main(String args[]){
        int x = 5;
        int y = 6;
        // I have used Integer we can also use float, double etc. 

        boolean res = (x<y); // we can use (x>y) 
        System.out.println(res);
        res = (x==y);
        System.out.println(res);
        res = (x!=y);
        System.out.println(res);

        // AND and OR Operations 
        // This is calles as Logical operator

        int num1 = 100;
        int num2 = 1000;
        boolean result = (x<y) & (num1< num2);
        System.out.println("Logical result: "+result);

        result = (x<y) || (num1 > num2);
        System.out.println("Logical result: "+result);

        result = (x < y) &  !(num1> num2);
        System.out.println("Logical result: "+result);

    }
    
}
