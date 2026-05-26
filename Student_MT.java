abstract class Student {

    String name;
    int roll;
    String course;
    String subject;
    int marks;

    boolean feePaid;        
    boolean borrowedBook; 

    Student(String n, int r, String c, String s, int m, boolean fee) {
        name = n;
        roll = r;
        course = c;
        subject = s;
        marks = m;
        feePaid = fee;
        borrowedBook = false;
    }

    abstract void attendClass();
    abstract void giveExam();
    abstract void payFee();

    void gradeCalculator() {

        System.out.println("Marks in " + subject + " = " + marks);

        if (marks >= 80) System.out.println("Grade = A");
        else if (marks >= 60) System.out.println("Grade = B");
        else if (marks >= 40) System.out.println("Grade = C");
        else System.out.println("Grade = Fail");
    }

    void calculator() {
        System.out.println("Marks + bonus = " + (marks + 5));
    }
}

interface LibraryHelper {

    void borrowBook();
    void listCourseBooks();
}

class Students extends Student implements LibraryHelper {

    Students(String n, int r, String c, String s, int m, boolean fee) {
        super(n, r, c, s, m, fee);
    }

    @Override
    void attendClass() {
        System.out.println(name + " is attending class.");
    }

    @Override
    void giveExam() {

        if (!feePaid) {
            System.out.println(name + " cannot give exam (fee not paid).");
        } else {
            System.out.println(name + " is giving exam.");
        }
    }

    @Override
    void payFee() {

        if (feePaid) {
            System.out.println(name + " has already paid fee.");
        } else {
            feePaid = true;
            System.out.println(name + " has now paid fee.");
        }
    }

    @Override
    public void borrowBook() {

        if (!feePaid) {
            System.out.println(name + " cannot borrow books (fee not paid).");
            return;
        }

        if (borrowedBook) {
            System.out.println(name + " has already borrowed a book.");
            return;
        }

        System.out.println(name + " borrowed books for " + course + " course:");

        if (course.equalsIgnoreCase("Computer Engineering")) {
            System.out.println("1. Java Programming");
            System.out.println("2. Data Structure");
            System.out.println("3. DBMS");
        } else {
            System.out.println("1. Basic Mathematics");
            System.out.println("2. Physics");
        }

        borrowedBook = true;
    }

    @Override
    public void listCourseBooks() {

        System.out.println("Available books for " + course + ":");

        if (course.equalsIgnoreCase("Computer Engineering")) {
            System.out.println("1. Java Programming");
            System.out.println("2. Data Structure");
            System.out.println("3. DBMS");
        } else {
            System.out.println("1. Mathematics");
            System.out.println("2. Physics");
        }
    }

    void displayInfo() {

        System.out.println("\n--- Student Info ---");
        System.out.println("Name   : " + name);
        System.out.println("Roll   : " + roll);
        System.out.println("Course : " + course);
        System.out.println("Subject: " + subject);
        System.out.println("Marks  : " + marks);
        System.out.println("Fee Paid: " + feePaid);
        System.out.println("Book Borrowed: " + borrowedBook);
    }
}

public class Student_MT{

    public static void main(String[] args) {

        Students s1 = new Students(
                "Shubham",
                21,
                "Computer Engineering",
                "Java",
                85,
                false
        );

        s1.displayInfo();

        System.out.println();

        s1.giveExam();
        s1.payFee();
        s1.giveExam();

        System.out.println();

        s1.borrowBook();
        s1.borrowBook(); 

        System.out.println();

        s1.listCourseBooks();
        s1.gradeCalculator();
        s1.calculator();
    }
}