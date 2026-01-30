public class Student1 {
    int id;
    String name;
    int age;

    Student1(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    Student1(int i, String n) {
        id = i;
        name = n;
        age = 18;
    }

    Student1(int i) {
        id = i;
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "Anusha", 20);
        Student1 s2 = new Student1(2, "Hamsika");
        Student1 s3 = new Student1(3);

        s1.display();
        s2.display();
        s3.display();
    }
}


