package package2;

import inheritance.Student;
import inheritance.UniversityStudent;

public class Demo {
    public static void main(String[]args){
       UniversityStudent student = new UniversityStudent(1, "Julia", "Adams", "IT");
       Student student1 = new Student(2,"Miley", "Montana");

       System.out.println(student.printStudent());
       System.out.println(student1.printStudent());
    }
}
