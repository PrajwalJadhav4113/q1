// Student.java - Data Holder
class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public double getMarks() { return marks; }
    public String getName() { return name; } // Needed for StudentRepository

    @Override
    public String toString() {
        return "Student [RollNo=" + rollNo + ", Name=" + name + "]";
    }
}

// GradeCalculator.java - Grading Logic
class GradeCalculator {
    public String calculateGrade(Student student) {
        double m = student.getMarks();
        if (m >= 75) return "A+";
        if (m >= 60) return "A";
        return "B";
    }
}

// StudentRepository.java - Persistence Logic
class StudentRepository {
    public void save(Student student) {
        System.out.println("SAVED: " + student.getName() + " record to file successfully.");
    }
}

// Client Test
public class SRPTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit Sharma", 82.5);

        GradeCalculator grader = new GradeCalculator();
        StudentRepository repo = new StudentRepository();

        System.out.println(s1);
        System.out.println("Grade: " + grader.calculateGrade(s1));
        repo.save(s1);
    }
}
