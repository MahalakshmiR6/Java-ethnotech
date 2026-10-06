public class SecondLargest {
    public static void main(String[] args){
        int[] arr={1,2,3, 5,7,9};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest element is: " + arr[1]);
    }
}