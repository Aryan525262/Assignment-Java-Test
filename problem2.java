import java.util.*;
public class problem2 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Net Price: ");
        float NetPrice = sc.nextFloat();
        System.out.println("Enter the Tax Rate");
        float taxRate =  sc.nextFloat();
        float GrossPrice = NetPrice / (1 + taxRate);
        System.out.println("Gross Price is " + GrossPrice );
    }
}
