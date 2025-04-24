public class problem4 {
    public static double calculatMedian(double []arr){
        int arrSize = arr.length;
        if(arrSize == 0)
        {
            return -1.0;
        }
        if(arrSize%2 != 0){
            return arr[arrSize/2];
        }
        else{
            double mid1 = arr[(arrSize/2) -1];
            double mid2 = arr[arrSize/2];
            return (mid1 + mid2) /2;
        }
    }
    public static void main(String []arg){
        double[] arr1 = {10.7};
        double[] arr2 = {1.0,2.0,3.0};
        double[] arr3 = {17.4, 21.1, 39.7, 48.0};
        double[] arr4 = {-957.0, -493.0, -384.0, -268.0, -131.0 } ;

        System.out.println("Median of arr 1 : "+ calculatMedian(arr1));
        System.out.println("Median of arr 2 : "+ calculatMedian(arr2));
        System.out.println("Median of arr 3 : "+ calculatMedian(arr3));
        System.out.println("Median of arr 4 : "+ calculatMedian(arr4));
    }
}
