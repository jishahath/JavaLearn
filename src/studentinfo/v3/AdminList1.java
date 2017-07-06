package studentinfo.v3;

import studentinfo.v1.StudentInfo;
import studentinfo.v2.TeacherInfo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jisha on 8/6/17.
 */
public class AdminList1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("0. Exit");
            System.out.println("1. Teaching Staffs");
            System.out.println("2. Nonteaching Staffs");
            System.out.println("3. Students");
            System.out.println("\n Enter the option: ");

            int option = sc.nextInt();

            switch (option){

                case 0:
                    System.out.println();
                    System.exit(0);
                    break;

                case 1:

                    List<TeacherInfo> teachers = new ArrayList();
                    Scanner sc1 = new Scanner(System.in);

     teacher_loop:      while (true){
                        System.out.println("1. Add Teachers");
                        System.out.println("2. Remove Teachers");
                        System.out.println("3. Print Teachers");
                        System.out.println("4. Update");
                        System.out.println("5. Back");
                        System.out.println("\n Enter the choice: ");

                        int choice = sc1.nextInt();

                        switch (choice) {

                            case 1:

                    		TeacherInfo t = new TeacherInfo();
                                System.out.println();
                                System.out.println("Enter teacher regNo");
                                t.regNo = sc1.nextInt();
                                System.out.println("Enter teacher name: ");
                                t.name = sc1.next();
                                System.out.println("Enter grade");
                                t.grade = sc1.nextInt();
                                System.out.println("Enter subject");
                                t.subject = sc1.next();

                                teachers.add(t);

                                break;

                            case 2:
                                System.out.println();
                                System.out.println("Enter the teacher register number to be removed: ");
                                int regNo = sc1.nextInt();

                                TeacherInfo teacherToRemove = null;

                                for (TeacherInfo t2 : teachers) {
                                    if (t2.regNo == regNo) {
                                        teacherToRemove = t2;
                                        break;
                                    }
                                }

                                if (teacherToRemove != null) {
                                    teachers.remove(teacherToRemove);
                                    System.out.println("Teacher " + teacherToRemove.name + " removed !");
                                } else {
                                    System.out.println("No teacher with regNo " + regNo);
                                }

                                break;
                            case 3:
                                System.out.println();
                                for (TeacherInfo t1 : teachers) {
                                    t1.printInfo();
                                }
                                break;
                            case 4:
                                System.out.println();
                                System.out.println("Enter the teacher regNo to be updated");
                                int regNumber = sc1.nextInt();

                                TeacherInfo teacherToUpdate = null;
                                for (TeacherInfo t3 : teachers) {
                                    if (t3.regNo == regNumber) {
                                        teacherToUpdate = t3;
                                        break;
                                    }
                                }

                                if (teacherToUpdate != null) {
                                    System.out.println("Enter new name (" + teacherToUpdate.name + "): ");
                                    teacherToUpdate.name = sc1.next();
                                    System.out.println("Enter new grade(" + teacherToUpdate.grade + "): ");
                                    teacherToUpdate.grade = sc1.nextInt();
                                    System.out.println("Enter new subject (" + teacherToUpdate.subject + "): ");
                                    teacherToUpdate.subject = sc1.next();
                                } else {
                                    System.out.println("No teacher with reg no" + regNumber);
                                }
                                break;
                            case 5:
                                break teacher_loop;

                            default:
                                System.out.println("INVALID ENTRY");
                                break;
                        }
                    }
                    break;
                case 2:

                    ArrayList<EmployeeInfo> employees = new ArrayList<>();
                    Scanner se = new Scanner(System.in);

    employee_loop:      while (true){
                        System.out.println("1. Add Employees");
                        System.out.println("2. Remove Employees");
                        System.out.println("3. Print Employees");
                        System.out.println("4. Update");
                        System.out.println("5. Back");
                        System.out.println("\n Enter the choice: ");

                        int choice = se.nextInt();

                        switch (choice) {

                            case 1:

                    		EmployeeInfo e = new EmployeeInfo();
                                System.out.println();
                                System.out.println("Enter Employee No");
                                e.empNo = se.nextInt();
                                System.out.println("Enter Employee name: ");
                                e.empName = se.next();

                                employees.add(e);

                                break;

                            case 2:
                                System.out.println();
                                System.out.println("Enter the Employee number to be removed: ");
                                int empNo = se.nextInt();

                                EmployeeInfo employeeToRemove = null;


                                for (EmployeeInfo e2 : employees) {
                                    if (e2.empNo == empNo) {
                                        employeeToRemove = e2;
                                        break;
                                    }
                                }

                                if (employeeToRemove != null) {
                                    employees.remove(employeeToRemove);
                                    System.out.println("Employee " + employeeToRemove.empName + " removed !");
                                } else {
                                    System.out.println("No Employee with empNo " + empNo);
                                }
                                break;
                            case 3:
                                System.out.println();
                                for (EmployeeInfo e1 : employees) {
                                    e1.printInfo();
                                }
                                break;
                            case 4:
                                System.out.println();
                                System.out.println("Enter the Employee empNo to be updated");
                                int empNumber = se.nextInt();

                                EmployeeInfo employeeToUpdate = null;
                                for (EmployeeInfo e3 : employees) {
                                    if (e3.empNo == empNumber) {
                                        employeeToUpdate = e3;
                                        break;
                                    }
                                }

                                if (employeeToUpdate != null) {
                                    System.out.println("Enter new name (" + employeeToUpdate.empName + "): ");
                                    employeeToUpdate.empName = se.next();

                                } else {
                                    System.out.println("No Employee with emp no" + empNumber);
                                }
                                break;
                            case 5:
                                break employee_loop;

                            default:
                                System.out.println("INVALID ENTRY");
                                break;
                        }
                    }
                    break;
                case 3:

                    ArrayList<StudentInfo> students = new ArrayList<>();
                    Scanner ss = new Scanner(System.in);

        student_loop:   while (true) {
                        System.out.println("1. Add Student");
                        System.out.println("2. Remove Student");
                        System.out.println("3. Print student");
                        System.out.println("4. Update");
                        System.out.println("5. Back");
                        System.out.println("\n Enter the index: ");

                        int index = ss.nextInt();

                        switch (index) {

                            case 1:

                    		StudentInfo s = new StudentInfo();
                                System.out.println();
                                System.out.println("Enter student name: ");
                                s.name = ss.next();
                                System.out.println("Enter student roll number: ");
                                s.rollNo = ss.nextInt();
                                System.out.println("Enter student age: ");
                                s.age = ss.nextInt();
                                System.out.println("Enter ClassName: ");
                                s.className = ss.next();

                                students.add(s);

                                break;
                            case 2:
                                System.out.println();
                                System.out.println("Enter the student roll number to be removed: ");
                                int rollNo = ss.nextInt();

                                StudentInfo studentToRemove = null;

                                for (StudentInfo s2 : students) {
                                    if (s2.rollNo == rollNo) {
                                        studentToRemove = s2;
                                        break;
                                    }
                                }

                                if (studentToRemove != null) {
                                    students.remove(studentToRemove);
                                    System.out.println("student " + studentToRemove.name + " removed !");
                                } else {
                                    System.out.println("No student with rollNo " + rollNo);
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
                                int rollNumber = ss.nextInt();

                                StudentInfo studentToUpdate = null;
                                for (StudentInfo s3 : students) {
                                    if (s3.rollNo == rollNumber) {
                                        studentToUpdate = s3;
                                        break;
                                    }
                                }

                                if (studentToUpdate != null) {
                                    System.out.println("Enter new name (" + studentToUpdate.name + "): ");
                                    studentToUpdate.name = ss.next();
                                    System.out.println("Enter new age (" + studentToUpdate.age + "): ");
                                    studentToUpdate.age = ss.nextInt();
                                    System.out.println("Enter new class (" + studentToUpdate.className + "): ");
                                    studentToUpdate.className = ss.next();
                                } else {
                                    System.out.println("No student with roll no" + rollNumber);
                                }
                                break;
                            case 5:
                                break student_loop;

                            default :
                                System.out.println("INVALID ENTRY");
                                break;
                        }
        }
            }
        }
    }
}
