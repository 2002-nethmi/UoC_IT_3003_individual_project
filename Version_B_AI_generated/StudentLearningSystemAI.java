package Version_B_AI_generated;
/**
 * A simple console-based Student Management System.
 */
public class StudentLearningSystemAI {
    private static final int MAX_STUDENTS = 10;
    private static Student[] students = new Student[MAX_STUDENTS];
    private static int count = 0;

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = InputUtils.readInt("Enter your choice: ");

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayAllStudents();
                case 3 -> searchStudentById();
                case 4 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice! Please select a valid option.");
            }
        }

        InputUtils.closeScanner();
    }

    private static void printMenu() {
        System.out.println("\n===== Student Learning System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Exit");
    }

    private static void addStudent() {
        if (count >= MAX_STUDENTS) {
            System.out.println("Student list is full. Cannot add more students.");
            return;
        }

        int id = InputUtils.readInt("Enter ID: ");
        if (findIndexById(id) != -1) {
            System.out.println("A student with ID " + id + " already exists.");
            return;
        }

        String name = InputUtils.readLine("Enter Name: ");
        String subject = InputUtils.readLine("Enter Subject: ");
        double marks = InputUtils.readDouble("Enter Marks: ");

        students[count] = new Student(id, name, subject, marks);
        count++;
        System.out.println("Student added successfully!");
    }

    private static void displayAllStudents() {
        if (count == 0) {
            System.out.println("No student records found.");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    private static void searchStudentById() {
        int searchId = InputUtils.readInt("Enter ID to search: ");
        int index = findIndexById(searchId);

        if (index != -1) {
            System.out.println("Student Found:");
            students[index].display();
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }
    }

    private static int findIndexById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}

