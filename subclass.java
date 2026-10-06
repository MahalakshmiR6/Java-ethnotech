public class subclass{
public static void main(String args[]){
    Mam m1 = new Mam(25, 5, 60);
    m1.display();
}
}
class Mam{
    int age;
    int height;
    int avg_wt;

    Mam(int age, int height, int avg_wt){
        this.age = age;
        this.height = height;
        this.avg_wt = avg_wt;
    }
    void display(){
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Average Weight: "+avg_wt);
    }
}
