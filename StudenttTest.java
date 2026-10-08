class Studentt{
    String name = "Rahul";
    int age=20;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class StudenttTest{
    public static void main(String[] args) {
        Studentt s = new Studentt();
        s.display();
    }
}