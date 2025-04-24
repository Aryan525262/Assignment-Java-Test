import java.util.*;
public class problem3 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int secondNumber = sc.nextInt();
        if(firstNumber > secondNumber){
            System.out.println("Greater Number is : "+ firstNumber);
        }
        else if(firstNumber == secondNumber){
            System.out.println("Both the Number are Equal");
        }
        else{
            System.out.println("Greatest Number is : " + secondNumber);
        }
    }
}
