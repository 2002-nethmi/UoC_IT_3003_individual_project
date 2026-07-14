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

            switch(choice){
                case 1:
                    if(count< students.length){
                        System.out.println("Enter ID:");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter Subject:");
                        String subject = sc.nextLine();
                        System.out.println("Enter Marks:");
                        double marks = sc.nextDouble();

                        students[count]= new Student(id, name, subject, marks);
                        count++;
                        System.out.println("Student added Successfully!");


                    }else{
                        System.out.println("Student List if full");
                    }
                    break;

                    case 2:
                        System.out.println("\n--Student List--");
                        for(int i=0;i<count;i++){
                            students[i].display();
                        }
                        break;

                    case 3:
                        System.out.println("Enter ID to search:");
                        int searchId = sc.nextInt();

                        for(int i = 0; i<count; i++){
                            if(students[i].id == searchId){
                                System.out.println("Student Found\n");
                                students[i].display();
                                break;
                            }
                            if(i==count-1){
                                System.out.println("Student with ID: " +searchId + "not found.");

                            }
                        }
                        break;

                        case 4:
                            System.out.println("Exiting...");
                            sc.close();
                            return;
                        
                         default:
                            System.out.println("Invalid choice! Try again.");

            }
        }
    }
}

