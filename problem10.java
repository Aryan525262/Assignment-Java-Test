public class problem10 {
    public static int  sortAndSecondLargest(int a[])
    {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
          
            a[j + 1] = k;
        }
        return a[n-2];
    }
    public static void main(String []arg){
        int []a = {15,87,23,2,45,6,7,10};
        System.out.println("Second Largest No Will be: " + sortAndSecondLargest(a));
    }
}
