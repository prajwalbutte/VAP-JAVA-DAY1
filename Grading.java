import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Physics: ");
        double marks1 = sc.nextInt();
        System.out.print("Enter marks of Chemistry: ");
        double marks2 = sc.nextInt();
        System.out.print("Enter marks of Enginnering Graphics: ");
        double marks3 = sc.nextInt();
        System.out.print("Enter marks of Maths: ");
        double marks4 = sc.nextInt();
        System.out.print("Enter marks of FPL: ");
        double marks5 = sc.nextInt();

        double totalMarks = marks1+marks2+marks3+marks4+marks5;
        double total = 500;
        double avgMarks = ((totalMarks)/(total));
        double percentage = avgMarks*100;

        System.out.println("Total marks are "+totalMarks);
        System.out.println("Percentage: "+percentage);

        if(percentage>=90){
            System.out.println("Grade Obtained: A+ ");
        }
        else if(percentage<=90 && percentage>=75){
            System.out.println("Grade Obtained : A");
        }
        else if (percentage<=75 && percentage>=30) {
            System.out.println("Grade Obtained : B");            
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
    
}
