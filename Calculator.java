import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = sc.nextInt();
        System.out.println("Enter number2:");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice(+,-,*,/");
        String operator = sc.next();



        if(operator == "+"){
           int result = num1+num2; 
            System.out.println(result);
            System.out.println("hii");
            
        }
        else if(operator =="-"){
            int result = num1-num2;
            System.out.println(result);
        }
        else if(operator == "*"){
            int result = num1*num2;
            System.out.println(result);
        }
        else if(operator == "/"){
            int result = num1/num2;
            System.out.println(result);
        }
       
        sc.close();
        
    }
}
