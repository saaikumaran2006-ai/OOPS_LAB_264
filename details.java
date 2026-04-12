class Person {
String name;
int age;

Person(String name, int age) {
this.name = name;
this.age = age;
}

void displayPerson() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}

class Student extends Person {
int rollNo;
String course;

Student(String name, int age, int rollNo, String course) {
super(name, age);
this.rollNo = rollNo;
this.course = course;
}

void displayStudent() {
super.displayPerson();
System.out.println("Roll No: " + rollNo);
System.out.println("Course: " + course);
}
}

public class details {
public static void main(String[] args) {
Student s = new Student("Saai Kumaran", 20, 101, "CSE");
System.out.println("--- Student Details ---");
s.displayStudent();
}
}