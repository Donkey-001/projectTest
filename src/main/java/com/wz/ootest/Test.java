package com.wz.ootest;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/13
 * Time: 17:30
 */
public class Test {

    public static void main(String[] args) {

        Person[] students = {new Student("学生康康1", 4, "西湖", "111"),
                            new Student("学生康康2", 4, "西湖", "111"),
                            new Student("学生康康3", 4, "西湖", "111")};
        Person[] teachers = {new Teacher("老师康康1", 4, "西湖", 99999.9999),
                            new Teacher("老师康康2", 4, "西湖", 99999.9999),
                            new Teacher("老师康康3", 4, "西湖", 99999.9999)};
        Person[] doctors = {new Doctor("医生康康1", 4, "西湖", 1),
                            new Doctor("医生康康2", 4, "西湖", 1)};

        for (Person student : students) {
            System.out.print(student.name+"\t");
            student.sayHello();
        }
        for (Person teacher : teachers) {
            System.out.print(teacher.name+"\t");
            teacher.sayHello();
        }
        for (Person doctor : doctors) {
            System.out.print(doctor.name+"\t");
            doctor.sayHello();
        }
    }
}
