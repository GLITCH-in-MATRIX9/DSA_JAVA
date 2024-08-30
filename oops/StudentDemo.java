package oops;

public class StudentDemo {
    public static class Student {
        String name;
        int age;
    
        // Default constructor
        Student() {
        }
    
        // Copy constructor
        Student(Student other) {
            this.name = other.name;
            this.age = other.age;
        }
    
        public void printInfo() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }

    public static void main(String[] args) {
        // Create an instance of Student with default constructor
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 10;

        // Create a copy of the original Student object using the copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
