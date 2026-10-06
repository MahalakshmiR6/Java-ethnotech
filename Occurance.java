public class Occurance {
    public static void main(String[] args){
        int [] arr = {1,2,3,2,1,0};
        int key = 2;
        int count = 0;  
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.println("The occurance of "+key+" is:" +count);
    }
}
