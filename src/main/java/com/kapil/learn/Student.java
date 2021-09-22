package com.kapil.learn;

public class Student {
    static int studentCount;

    int id;
    String name;
    String gender;
    int age;
    long phone;
    double gpa;
    char degree;

    double tuitionFees = 12000.0;
    double internationalFees = 5000.0;
    boolean international;

    Student() {
    }

    Student(int id, String name, String gender, int age, long phone, double gpa, char degree) {
        /*
         * this() --> this invocation statement
         *  Rules:
         *   - Must be the first statement
         *   - Only one per constructor
         *   - No recursive constructor invocation
         *   - No instance variable as arguments
         *
         *  Note: parameters/arguments of this Student constructor to the 'this()' invocation.
         *  parameters are considered as local variable, not instance variable
         * */
        this(id, name, gender, age, phone, gpa, degree, false);
    }

    public Student(int id, String name, String gender, int age, long phone, double gpa, char degree, boolean international) {
        /*
         * this. --> this reference
         *   It refers to current object/instance
         * */
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.gpa = gpa;
        this.degree = degree;
        this.international = international;

        studentCount++;
        int nextId = id + 1;

        if (international) {
            tuitionFees = tuitionFees + internationalFees;
        }

        if (gpa > 3.5) {
            tuitionFees = tuitionFees - 1000;
        }

        /*
        System.out.println("\nid: " + this.id);
        System.out.println("nextId: " + nextId);
        System.out.println("name: " + this.name);
        System.out.println("gender: " + this.gender);
        System.out.println("age: " + this.age);
        System.out.println("phone: " + this.phone);
        System.out.println("gpa: " + this.gpa);
        System.out.println("degree: " + this.degree);
        System.out.println("tuitionFees: " + tuitionFees);
        System.out.println("studentCount: " + studentCount);
        */
    }

    void updateName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1000, "Joan", "male", 18, 223_456_7890L, 3.8, 'B');

        Student student2 = new Student(1001, "Raj", "male", 21, 223_456_9999L, 3.4, 'M', true);

        Student student3 = new Student(1002, "Anita", "female", 20, 223_456_8888L, 4.0, 'M', true);

        System.out.println("Student.studentCount: " + Student.studentCount);
        System.out.println("\nName of Student 1: " + student1.name);
        System.out.println("Name of Student 2: " + student2.name);
        System.out.println("Name of Student 3: " + student3.name);

        student1.updateName("John");
        System.out.println("\nUpdated name of Student 1: " + student1.name);

        Student[] students = {student1, student2, student3};
        swap(students, 0, 2);
        System.out.println("\nName of students[0]: " + students[0].name);
        System.out.println("Name of students[1]: " + students[1].name);
        System.out.println("Name of students[2]: " + students[2].name);
    }

    private static void swap(Student[] students, int firstIndex, int secondIndex) {
        Student temp = students[firstIndex];
        students[firstIndex] = students[secondIndex];
        students[secondIndex] = temp;
        System.out.println(go());
    }

    static short go() {
        byte s = 10;
        return s;
    }

    private void printHello() {
        System.out.println("hello");
    }
}
