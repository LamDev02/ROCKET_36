import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập quê quán sinh viên: ");
        String hometown = scanner.nextLine();
        Student student1 = new Student(name, hometown);
        student1.setDiemHocLuc(7.5);
        student1.inThongTinSV();
        scanner.close();

    }
}