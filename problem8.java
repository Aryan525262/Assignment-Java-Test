import java.util.*;
public class problem8 {
    public static void main(String []arg){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Seconds: ");
    double second = sc.nextInt();
    double Days = Math.floor(second/86400);
    second = second - (86400*Days);
    double Hours = Math.floor(second/3600);
    second = second - (3600* Hours);
    double Minutes = Math.floor(second/60);
    second = second - (60* Minutes);
    System.out.println("Days "+ Days + " Hours " + Hours + " Minutes "+ Minutes + " Seconds "+second);
    }
}
