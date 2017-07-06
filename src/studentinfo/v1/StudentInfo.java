package studentinfo.v1;


/**
 * Created by tecsol on 18/03/17.
 */
public class StudentInfo {

    public int rollNo;
    public String name;
    public String className;
    public int age;

    public void printInfo() {
        System.out.println("Roll no:" + rollNo + " | Name: " +
                name + " | age: " + age + " | Class: " + className);
    }

    public void printInfo1() {
        System.out.println("Roll no:" + rollNo + " | Name: " + name
                + " | age: " + age + " | Class: " + className);
    }

}
