package studentinfo.v2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jisha on 5/6/17.
 */
public class TeacherList {

        public static void main(String args[]){
            ArrayList<TeacherInfo> teachers = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

            while (true){
                System.out.println("0. Exit");
                System.out.println("1. Add Teachers");
                System.out.println("2. Remove Teachers");
                System.out.println("3. Print Teachers");
                System.out.println("4. Update");
                System.out.println("\n Enter the Option: ");

                int option = sc.nextInt();

                switch (option){
                    case 0:
                        System.out.println();
                        System.exit(0);
                        break;

                    case 1:
                        TeacherInfo t = new TeacherInfo();

                        System.out.println();
                        System.out.println("Enter teacher regNo");
                        t.regNo = sc.nextInt();
                        System.out.println("Enter teacher name: ");
                        t.name = sc.next();
                        System.out.println("Enter grade");
                        t.grade = sc.nextInt();
                        System.out.println("Enter subject");
                        t.subject = sc.next();

                        teachers.add(t);

                        break;

                    case 2:
                        System.out.println();
                        System.out.println("Enter the teacher register number to be removed: ");
                        int regNo = sc.nextInt();

                        TeacherInfo teacherToRemove = null;

                        for (TeacherInfo t2 : teachers) {
                            if (t2.regNo == regNo) {
                                teacherToRemove = t2;
                                break;
                            }
                        }

                        if (teacherToRemove != null) {
                            teachers.remove(teacherToRemove);
                            System.out.println("Teacher " + teacherToRemove.name+ " removed !");
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
                        int regNumber = sc.nextInt();

                        TeacherInfo teacherToUpdate = null;
                        for (TeacherInfo t3 : teachers) {
                            if (t3.regNo == regNumber) {
                                teacherToUpdate = t3;
                                break;
                            }
                        }

                        if (teacherToUpdate != null) {
                            System.out.println("Enter new name (" + teacherToUpdate.name + "): ");
                            teacherToUpdate.name = sc.next();
                            System.out.println("Enter new grade(" + teacherToUpdate.grade + "): ");
                            teacherToUpdate.grade = sc.nextInt();
                            System.out.println("Enter new subject (" + teacherToUpdate.subject+ "): ");
                            teacherToUpdate.subject= sc.next();
                        } else {
                            System.out.println("No teacher with reg no" + regNumber);
                        }
                        break;

                    default :
                        System.out.println("INVALID ENTRY");
                        break;


                }
            }
        }

    }






