import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------Question 1--------------");
        ArrayList<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student(1,"Nguyen Van A"));
        lstStudent.add(new Student(2,"Nguyen Van B"));
        lstStudent.add(new Student(3,"Nguyen Van C"));
        lstStudent.add(new Student(4,"Nguyen Van A"));
        System.out.println("Tong so phan tu: "+ lstStudent.size());
        System.out.println("Phan tu thu 4: " +lstStudent.get(3).getName());
        System.out.println("Phan tu dau cua student: " +lstStudent.get(0).getName());
        System.out.println("Phan tu cuoi cua student: " +lstStudent.get(lstStudent.size()-1).getName());
        lstStudent.add(0,new Student(1, "Nguyen Van D"));
        lstStudent.add(new Student(5,"Nguyen Van E"));
        ArrayList<Student> reverseStudent = new ArrayList();
        java.util.Collections.reverse(reverseStudent);
        System.out.println("--------------Question 2--------------");
        ArrayList<StudentCompare> students = new ArrayList<>();
        students.add(new StudentCompare(1, "Nguyen Tung Lam", "2000-01-05", 85.0));
        students.add(new StudentCompare(2, "Ngo Anh Vu", "1999-07-15", 90.5));
        students.add(new StudentCompare(3, "Vu Duc Minh", "2001-03-20", 78.5));
        students.add(new StudentCompare(4, "Tran Ngoc Canh", "2000-01-05", 72.5));
        students.add(new StudentCompare(5, "Le Vinh Son", "1998-11-12", 95.0));
        Collections.sort(students);
        System.out.println("Sorted by name:");
        for (StudentCompare studentCompare : students) {
            System.out.println(studentCompare);
        }
    }
}