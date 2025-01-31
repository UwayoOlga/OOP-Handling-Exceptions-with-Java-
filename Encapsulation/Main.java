
class Student {
    private String name;
    private int age; 

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        if (age > 0) {  
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
 
public class Main {
    public static void main(String[] args) { 
        Student student = new Student();
 
        student.setName("Olga Uwayo");
        student.setAge(21);
 
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
