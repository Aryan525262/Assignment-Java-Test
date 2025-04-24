import java.util.*;
public class problem7 {
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rate of inflation: ");
        double rate = sc.nextDouble();
        rate = rate /100.0;
        System.out.println("Enter the No of Years");
        double years = sc.nextDouble();
        double compoundInflation = Math.pow(1+rate, years) -1 ;
        double compoundPercentage = Math.round(compoundInflation * 100);

        System.out.println("Compound Inflation after" + years+ " years is : "+ compoundPercentage);

    }
}
