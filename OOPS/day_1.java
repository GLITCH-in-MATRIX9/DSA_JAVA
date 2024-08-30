package oops;

//class name must always be capital letter
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColour(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student (String name,int age){
        this.name=name;
        this.age=age;

    }
}

public class day_1 {
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="red";
        pen2.type="ballpoint";

        pen1.write();
        pen1.printColour();
        pen2.printColour();


    
        Student s1=new Student(null, 0); //this is a constructor Student of class Student
        s1.name="aman";
        s1.age=14;

        s1.printInfo();
        
        //parameterised constructor
        Student s2= new Student("geeta", 16);
        s2.printInfo();






    }
    
}
