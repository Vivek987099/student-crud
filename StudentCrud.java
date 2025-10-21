import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCrud {
    static List<Student> students = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Student Crud Options =====");
            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    getAllStudents();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;

                case 5 :
                    System.out.println("Exit seccessfully ");
                    return;

                default:
                    System.out.println("Invalid choice, choose correct option ");
                    break;
            }

        } while (choice != 5);

    }

    // ADD METHOD
    public static void addStudent() {
        System.out.println("Enter student Id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name : ");
        String name = sc.nextLine();
        System.out.println("Enter student marks : ");
        float marks = sc.nextFloat();
        students.add(new Student(id, name, marks));
        System.out.println("Student add successfully ");

    }

    // VIEW ALL STUDENTS METHOD
    public static void getAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Student not found ");

        } else {
            System.out.println();
            System.out.println("============= All STUDENTS ================");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // DELETE METHOD
    public static void deleteStudent() {
        System.out.println("Enter  student Id which do you want to delete : ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean isRemove = students.removeIf(s -> s.getStudentId() == id);
        if (isRemove) {
            System.out.println("student deleted successfully with id " + id);
        } else {
            System.out.println("Studetn not found with id " + id);
        }
    }

    // UPDATE METHOD
    public static void updateStudent() {
        System.out.println("Enter  student Id which do you want to Update : ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Student s : students) {
            if (s.getStudentId() == id) {
                System.out.println("Enter new Name : ");
                String newName = sc.nextLine();
                System.out.println("Enter New marks : ");
                float newMarks = sc.nextFloat();
                s.setStuName(newName);
                s.setStuMarks(newMarks);
                System.out.println("Student updated successfully with id " + id);

            } else {
                System.out.println("Student not found with id " + id);
            }

        }
    }

}
