package Version_B_AI_generated;
/**
 * Represents a student with academic details.
 */
public class Student {
    private int id;
    private String name;
    private String subject;
    private double marks;

    public Student(int id, String name, String subject, double marks) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getSubject() { return subject; }
    public double getMarks() { return marks; }

    public void display() {
        System.out.println("----------------------------");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Marks   : " + marks);
        System.out.println("----------------------------");
    }
}
