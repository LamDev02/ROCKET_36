public class Main {
    public static void main(String[] args) {
        News news = new News(1, "Sample News", "2023-07-20", "Nguyen Tung Lam", "This is a sample news content.");
        news.Calculate();
        news.Display();

        System.out.println("-------------Exercise 2-------------");
        Student[] students = new Student[10];
        students[0] = new Student(1, "Nguyễn Văn A ", 1);
        students[1] = new Student(2, "Nguyễn Văn B ", 2);
        students[2] = new Student(3, "Nguyễn Văn C ", 1);
        students[3] = new Student(4, "Nguyễn Văn D ", 3);
        students[4] = new Student(5, "Nguyễn Văn E ", 2);
        students[5] = new Student(6, "Nguyễn Văn F ", 1);
        students[6] = new Student(7, "Nguyễn Văn G ", 3);
        students[7] = new Student(8, "Nguyễn Văn H ", 2);
        students[8] = new Student(9, "Nguyễn Văn I ", 1);
        students[9] = new Student(10, "Nguyễn Văn J ", 3);

        // b) Kêu gọi cả lớp điểm danh
        System.out.println("Điểm danh cả lớp:");
        for (Student student : students) {
            student.diemDanh();
        }

        // c) Gọi nhóm 1 đi học bài
        System.out.println("Nhóm 1 đi học bài:");
        for (Student student : students) {
            if (student.group == 1) {
                student.hocBai();
            }
        }

        // d) Gọi nhóm 2 đi dọn vệ sinh
        System.out.println("Nhóm 2 đi dọn vệ sinh:");
        for (Student student : students) {
            if (student.group == 2) {
                student.diDonVeSinh();
            }
        }
    }
}