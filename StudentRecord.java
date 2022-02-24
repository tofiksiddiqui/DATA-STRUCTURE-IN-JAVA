
/*Design a class which represent a student record.Every student record is made up to the following fields.*/
/*
 * (a).Registration number (b).Full name
 * (c).Date of joining
 * (d).Semester(short)
 * (e).gpa(float)
 * (f).cgpa(float)
 * Write a member function to do following
 * (1).Provide default parameterized constructor to this class.
 * (2).Write display method() which display the record.
 * (3).create an array of student record to store minimum of 5 record.
 * (4).sort the student record with respect to semester and cgpa.
 * (5).sort the student record record with respect to name.
 * (6).add member() function to do following
 * (7).List all the student whose name start with particular character
 * (8).whose name start with substring
 * (9).change the full name of object to name with just intial and family.
 * for example->Prakash Kalingrao Aithal must be changed to to P.K.Aithal and store the object in the object.
 */
import java.util.GregorianCalendar;
import java.util.Scanner;

class Student {

    int regno;
    String sname;
    GregorianCalendar Calendar;
    short sem;
    float gpa;
    float cgpa;

    /* Default constructor */
    Student() {

        regno = 0;
        sname = "";
        Calendar = new GregorianCalendar(0, 0, 0);
        gpa = 0;
        cgpa = 0;

    }

    /* Parameterized constructor */
    Student(String b, int yy, int mm, int dd, short d, float e, float f) {

        this.sname = b;
        this.Calendar = new GregorianCalendar(yy, mm, dd);
        this.sem = d;
        this.gpa = e;
        this.cgpa = f;
        this.regno = (this.Calendar.get(Calendar.YEAR) % 100) * 100;

    }

    public void display() {

        System.out.println("-------------------Student Details Given Below----------------------------");
        System.out.println();
        System.out.println("Student RegNo is = " + regno);
        System.out.println("Student Name is = " + sname);
        System.out.println("Date of Joining is = " + this.Calendar.get(Calendar.DATE) + "/"
                + this.Calendar.get(Calendar.MONTH) + "/" + this.Calendar.get(Calendar.YEAR));
        System.out.println("Semester is = " + sem);
        System.out.println("GPA is = " + gpa);
        System.out.println("CGPA is = " + cgpa);
        System.out.println();
        System.out.println("Mohammad Tofik  Pathan khan Lucknow");
        

    }

    /* Sorting student record with respect to semester and cgpa */
    public static void sortSem(Student[] s, int n) {
        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (s[j].sem > s[j + 1].sem) {
                    short temp;
                    temp = s[j].sem;
                    s[j].sem = s[j + 1].sem;
                    s[j + 1].sem = temp;
                }
            }
        }
    }

    /* Sorting student record with respect to cgpa */
    public static void sortCGPA(Student s[], int n) {
        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (s[j].cgpa > s[j + 1].cgpa) {
                    float temp;
                    temp = s[j].cgpa;
                    s[j].cgpa = s[j + 1].cgpa;
                    s[j + 1].cgpa = temp;
                }
            }
        }
    }

    /* Sorting the record with respect to names */
    public static void sortNames(Student[] s, int n) {
        for (var i = 0; i < n - 1; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (s[j].sname.compareTo(s[j + 1].sname) > 0) {
                    String temp;
                    temp = s[j].sname;
                    s[j].sname = s[j + 1].sname;
                    s[j + 1].sname = temp;
                }
            }

        }
    }

    /* Listing the student whose name start with character */
    public static void startWithCharacter(Student[] s) {
        Scanner scanner = new Scanner(System.in);
        var l = s.length;
        System.out.println("Enter the character ");
        var ch = scanner.next().charAt(0);
        for (var i = 0; i < l; i++) {
            if (ch == s[i].sname.charAt(0)) {
                s[i].display();
            }
        }
    }

    /* listing the student whose name start with substring */
    public static void startWithSubstring(Student[] s) {
        var l = s.length;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Substring ");
        var subString = scanner.nextLine();
        for (var i = 0; i < l; i++) {
            if ((s[i].sname).indexOf(subString) != -1) {
                s[i].display();
            }
        }
    }

    /* Changing full name in the object */
    public static void changeNameInitial(Student[] s) {
        int l = s.length;
        for (var i = 0; i < l; i++) {
            var w = "";
            var x = "";
            for (var j = 0; j < s[i].sname.length(); j++) {
                if (s[i].sname.charAt(j) == ' ') {
                    x = x + w.charAt(0) + ".";
                    w = "";
                } else {
                    w = w + s[i].sname.charAt(j);
                }
            }
            x = x + w;
            s[i].sname = x;
        }
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------Enter the details of students-----------------");
        System.out.println("My Name is Mohammad Tofik from India");
        System.out.println();
        System.out.println("Enter the number of student");
        var n = scanner.nextInt();
        Student[] s = new Student[n];
        for (var i = 0; i < n; i++) {
            System.out.println("------Enter the details of " + (i + 1) + " student ------");
            System.out.println();
            System.out.println("Enter the Name of Student  ");
            String sname = scanner.nextLine();
            sname = scanner.nextLine();
            System.out.println("Enter the date of joining ");
            var dd = scanner.nextInt();
            var mm = scanner.nextInt();
            var yy = scanner.nextInt();
            System.out.println("Enter the semester ");
            var sem = scanner.nextShort();
            System.out.println("Enter the GPA ");
            var gpa = scanner.nextFloat();
            System.out.println("Enter CGPA ");
            var cgpa = scanner.nextFloat();
            s[i] = new Student(sname, dd, mm, yy, sem, gpa, cgpa);
        }

        for (var i = 0; i < n; i++) {
            s[i].display();
        }
        System.out.println("------Sorting according to sem------");
        System.out.println("\n");
        Student.sortSem(s, n);
        for (var i = 0; i < n; i++) {
            s[i].display();
        }
        System.out.println("------Sorting according to CGPA------");
        System.out.println("\n");
        Student.sortCGPA(s, n);
        for (var i = 0; i < n; i++) {
            s[i].display();
        }
        System.out.println("------Sorting according to names------");
        System.out.println("\n");
        Student.sortNames(s, n);
        for (var i = 0; i < n; i++) {
            s[i].display();
        }
        Student.startWithCharacter(s);
        Student.startWithSubstring(s);
        System.out.println("----Changing name with initial----");
        System.out.println();
        Student.changeNameInitial(s);
        for (var i = 0; i < n; i++) {
            s[i].display();
        }
    }
}
