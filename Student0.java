
class Student0{
    public static void main(String[] args){
    int[] nums={1,2,3,4,5};
    int max;
    max=nums[0];

    for(int num:nums){
        if(num>max){
            max=num;
        }
    }
    System.out.println("The maximum number is: "+max);
}
}