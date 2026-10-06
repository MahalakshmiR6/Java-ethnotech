import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr={21,2,5,30,4};
        int n=arr.length;
        int l=0;
        int r=n-1;
        int temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
