public class student {
    public static void main(String args[]){
    st s1 = new st(25, 5, 100);
    s1.display();
    st s2 = new st(30, 6, 70);
    s2.display();
}
}
class st{
    int name;
    int age;
    int marks;

    st(int name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        if(marks>80){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }

}
