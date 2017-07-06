package studentinfo.v1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by tecsol on 18/03/17.
 */
public class StudentList {

    public static void main(String[] args) {
        ArrayList<StudentInfo> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Print student");
            System.out.println("4. Update");
            System.out.println("\n Enter the Option: ");

            int option = sc.nextInt();

            switch (option) {
                case 0:
                    System.out.println();
                    System.exit(0);
                    break;
                case 1:
                    StudentInfo s = new StudentInfo();

                    System.out.println();
                    System.out.println("Enter student name: ");
                    s.name = sc.next();
                    System.out.println("Enter student roll number: ");
                    s.rollNo = sc.nextInt();
                    System.out.println("Enter student age: ");
                    s.age = sc.nextInt();
                    System.out.println("Enter ClassName: ");
                    s.className = sc.next();

                    students.add(s);

                    break;
                case 2:
                    System.out.println();
                    System.out.println("Enter the student roll number to be removed: ");
                    int rollNo = sc.nextInt();

                    StudentInfo studentToRemove = null;

                    for (StudentInfo s2 : students) {
                        if (s2.rollNo == rollNo) {
                            studentToRemove = s2;
                            break;
                        }
                    }

                    if (studentToRemove != null) {
                        students.remove(studentToRemove);
                        System.out.println("Student " + studentToRemove.name + " removed !");
                    } else {
                        System.out.println("No student with roll no " + rollNo);
                    }

                    break;
                case 3:
                    System.out.println();
                    for (StudentInfo s1 : students) {
                        s1.printInfo();
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Enter the student roll number to be updated");
                    int rollNumber = sc.nextInt();

                    // find student object to be updated
                    StudentInfo studentToUpdate = null;
                    for (StudentInfo s3 : students) {
                        if (s3.rollNo == rollNumber) {
                            studentToUpdate = s3;
                            break;
                        }
                    }

                    // update info if not null
                    if (studentToUpdate != null) {
                        System.out.println("Enter new name (" + studentToUpdate.name + "): ");
                        studentToUpdate.name = sc.next();
                        System.out.println("Enter new age (" + studentToUpdate.age + "): ");
                        studentToUpdate.age = sc.nextInt();
                        System.out.println("Enter new class (" + studentToUpdate.className + "): ");
                        studentToUpdate.className = sc.next();
                    } else {
                        System.out.println("No student with roll no" + rollNumber);
                    }
                    break;

                default :
                    System.out.println("INVALID ENTRY");
                    break;

            }
        }
    }

}
