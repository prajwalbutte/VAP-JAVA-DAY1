import java.util.Scanner;
public class SwitchCalculator {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number2:");
        int num2 = sc.nextInt();
        int result;
        boolean condition = true;
        while(condition){
            
        
        System.out.println("Menu");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        

        switch (choice) {
            case 1:
                result = num1+num2;
                System.out.println(result);
                break;
            case 2:
                result = num1-num2;
                System.out.println(result);
                break;
            case 3:
                result = num1*num2;
                System.out.println(result);
                break;
            case 4:
                result = num1/num2;
                System.out.println(result);
                break;
            case 5:
                condition = false;
                break;
                
            default:
                System.out.println("Enter valid choice");
                break;
        }
        }
        
        

        



       
        sc.close();
        
    }
}
