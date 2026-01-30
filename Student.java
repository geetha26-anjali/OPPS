public class Student{
    int id;
    String name;
    Student(int i,String name) {
        id=i;
        this.name=name;
    }
    void display() {
        System.out.println(id+" "+name);
    
    }
    }
class Main {
    public static void main(String[] args) {
        Student s1= new Student(1,"Anusha");
        Student s2= new Student(2,"Hamsika");
        s1.display();
        s2.display();
    
    }
}
