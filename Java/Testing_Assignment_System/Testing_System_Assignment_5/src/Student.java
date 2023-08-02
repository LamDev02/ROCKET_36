public class Student implements IStudent {
    private int id;
    private String name;
    protected int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    @Override
    public void diemDanh() {
        System.out.println(name + "điểm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(name + "học bài");
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(name + "đi dọn vệ sinh");
    }
}
