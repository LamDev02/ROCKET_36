public class Student {
    private int id;
    private String name;
    private String hometown;
    private double diemHocLuc;

    //Cons
    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0.0;
    }


    //Method
    public void setDiemHocLuc(double diem){
        this.diemHocLuc = diem;
    }
    public void congDiemHocLuc(double diemThem) {
        this.diemHocLuc += diemThem;
    }
    public void inThongTinSV(){
        System.out.println("Ten SV: " + name);
        System.out.println("Diem Hoc Luc: " + diemHocLuc);
        System.out.println("Học lực: " + getHocLuc());
    }
    private String getHocLuc(){
        if(diemHocLuc < 4.0){
            return "Yếu";
        } else if (diemHocLuc < 6.0){
            return "Trung bình";
        } else if (diemHocLuc < 8.0) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
}
