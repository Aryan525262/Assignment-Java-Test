public class problem5 {
    public static double calculateIncome(double income){
        double taxRate = 0.0;
        if(income<=250000){
            return taxRate;
        }
        else if(income<=500000){
            taxRate = (income -250000) * 0.10;
            return taxRate;
        }
        else if(income<=1000000){
            taxRate = (250000*0.10) + (income - 500000) * 0.20;
            return taxRate;
        }
        else{
            taxRate = (250000 * 0.10) + (500000 * 0.20) + (income - 1000000) * 0.30;
            return taxRate;
        }
    }
    public static void main(String []args){
        System.out.println("Tax Rate for income 1,90,000 will be: "+ calculateIncome(190000));
        System.out.println("Tax Rate for income 3,45,000 will be: "+ calculateIncome(345000));
        System.out.println("Tax Rate for income 7,80,000 will be: "+ calculateIncome(780000));
        System.out.println("Tax Rate for income 24,00,000 will be: "+ calculateIncome(2400000));
    }
}
