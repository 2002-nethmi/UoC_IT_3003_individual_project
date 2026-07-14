package Version_A_traditional;
import java.util.Scanner;

class Student{
    int id;
    String name;
    String subject;
    double marks;

    Student(int id, String name, String subject, double marks){
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }
    
    void display(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Subject: "+ subject);
        System.out.println("Marks: "+ marks);

    }
}
