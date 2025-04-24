import java.util.*;
public class problem1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        
        number = Math.abs(number);
        if(number==0){
            System.out.println(1);
        }
        else{
            int count = 0;
            while(number>0){
                number = number/10;
                count++ ;
            }
            System.out.println("Number of Digits : " + count);
        }
    }
}