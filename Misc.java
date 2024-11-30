public class Misc{
    public static void main(String args[]){
        int x= 40;
        int y = 20;
        int z = 20;


        if ((x<y) && (x<z)){
            System.out.println("Passed");
        }
        else if (x>y && x>z){
            System.out.println("This is elif statement");
        }
        else{
            System.out.println("Else Statement Called");
            }
        
        // ternary operator
        int n = 5;

        int res = 0;
        res = n%2 == 0 ? 10 : 20;
        System.out.println("The tenary operator result is: " + res );

        // Switch-case Statement

        int num1 = 11;

        switch (num1){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 10:
                System.out.println("Case 10");
                break;
            default:
                System.out.println("This is Default case");

        }
        
        // Updated version of Switch-case Statement
        String day = "Monday";
        switch(day){
            case "Saturday", "Sunday" -> System.out.println("Wake me up at 7 am ");
            case "Monday" -> System.out.println("Wake me up at 6 am");
            case "Tuesday" -> System.out.println("Wake me up at 5 am ");        
            default -> System.out.println("6am as default");
        };

        String waketime = switch (day) {
            case "Monday" : yield "7am";
        
            default : yield  "5 am";
        };
        System.out.println("This is waketime value: "+ waketime);


    
    }
}