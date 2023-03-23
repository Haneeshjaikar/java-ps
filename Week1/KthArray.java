package Week1;

import java.util.Arrays;

public class KthArray{

    public static int KthLargest(int[] a, int k){
        int n = a.length;
        Arrays.sort(a);
        return a[n - k - 1];
    }

    public static int KthSmallest(int[] a, int k){
        Arrays.sort(a);
        return a[k - 1];
    }

    public static void main(String args[]){
        int arr[]={10,8,4,6,2,5,1,9,7,3,11};
        int k=5;
        int ks = KthSmallest(arr, k);
        int kl = KthLargest(arr, k);
        System.out.println("Kth smallest element is " + ks + " Kth largest is " + kl);
    }
}