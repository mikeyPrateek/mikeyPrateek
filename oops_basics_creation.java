/**
 * oops_basics_creation
 */
public class oops_basics_creation {
    
    public static void main(String args[]) {
        // pen p1 = new pen();
        // p1.setcolor("Blue");
        // System.out.println(p1.color);
        // p1.settip(21);
        // System.out.println(p1.tip);

        student s1 = new student();
        // s1.name = new String("Nishit");
        // System.out.println(s1.name);
        // s1.age = new ("19");
        // System.out.println(s1.age);
        s1.persentage(double persentage);
        n
        System.out.println(s1.persentage);

    }  
    

}

class pen {
    String color;
    int tip;

    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}

class student {
    String name = "naman";
    int age = 11;
    double persentage = 97.33;

    void calpersentage(int maths , int chem , int phy){
        persentage = maths + chem + phy / 3;
    }
}
