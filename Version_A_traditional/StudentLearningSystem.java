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

public class StudentLearningSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] students= new Student[10];
        int count = 0;

        while(true){
            System.out.println("\n---Student Learning System---");
            System.out.println("01. Add Student");
            System.out.println("02. Display All Students");
            System.out.println("03. Search Student by ID");
            System.out.println("04. Exit");
            System.out.println("\n\nEnter your choice");
            int choice = sc.nextInt();
   
        }
    }
}
