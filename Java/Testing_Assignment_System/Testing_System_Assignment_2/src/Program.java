import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args){
        //Department
        Department department1 = new Department();
        department1.DepartmentID = 1;
        department1.DepartmentName = "Sale";

        Department department2 = new Department();
        department2.DepartmentID = 2;
        department2.DepartmentName = "Marketing";


        Department department3 = new Department();
        department3.DepartmentID = 3;
        department3.DepartmentName = "HR";

        //Create Position
        Position position1 = new Position();
        position1.PositionID = 1;
        position1.positionName = PositionName.DEV;

        Position position2 = new Position();
        position2.PositionID = 2;
        position2.positionName = PositionName.SCRUM_MASTER;

        Position position3 = new Position();
        position3.PositionID = 3;
        position3.positionName = PositionName.PM;

        //Create Account
        Account account1 = new Account();
        account1.AccountID = 1;
        account1.Email = "lamnguyentuung@gmail.com";
        account1.Username = "NTL";
        account1.FullName = "Nguyen Tung Lam";
        account1.DepartmentID = department1;
        account1.PositionID = position1;
        account1.CreateDate = "2020-12-10";

        Account account2 = new Account();
        account2.AccountID = 2;
        account2.Email = "ngoanhvuit0406@gmail.com";
        account2.Username = "NAV";
        account2.FullName = "Ngo Anh Vu";
        account2.DepartmentID = department2;
        account2.PositionID = position2;
        account2.CreateDate = "2022-09-28";

        Account account3 = new Account();
        account3.AccountID = 3;
        account3.Email = "gilgames@gmail.com";
        account3.Username = "TLV";
        account3.FullName = "Tran Le Vinh";
        account3.DepartmentID = department3;
        account3.PositionID = position3;
        account3.CreateDate = "2021-11-11";

        //Create Group
        Group group1 = new Group();
        group1.GroupID = 1;
        group1.GroupName = "Nhom A";
        group1.CreatorID = 1;
        group1.CreateDate = "2020-12-10";

        Group group2 = new Group();
        group2.GroupID = 2;
        group2.GroupName = "Nhom B";
        group2.CreatorID = 2;
        group2.CreateDate = "2021-12-19";

        Group group3 = new Group();
        group3.GroupID = 3;
        group3.GroupName = "Nhom C";
        group3.CreatorID = 3;
        group3.CreateDate = "2022-09-29";

        //Create GroupAccount
        GroupAccount GA1 = new GroupAccount();
        GA1.GroupID = group1;
        GA1.AccountID = account1;
        GA1.JoinDate = "2020-11-11";

        GroupAccount GA2 = new GroupAccount();
        GA2.GroupID = group2;
        GA2.AccountID = account2;
        GA2.JoinDate = "2021-12-20";

        GroupAccount GA3 = new GroupAccount();
        GA3.GroupID = group3;
        GA3.AccountID = account3;
        GA3.JoinDate = "2019-5-15";

        //Create TypeQuestion
        TypeQuestion TQ1 =  new TypeQuestion();
        TQ1.TypeID = 1;
        TQ1.typeName = TypeName.ESSAY;

        TypeQuestion TQ2 =  new TypeQuestion();
        TQ1.TypeID = 2;
        TQ1.typeName = TypeName.MULTIPLE_CHOICE;

        //Create CategoryQuestion
        CategoryQuestion CQ1 = new CategoryQuestion();
        CQ1.CategoryID = 1;
        CQ1.CategoryName = "Java";

        CategoryQuestion CQ2 = new CategoryQuestion();
        CQ2.CategoryID = 2;
        CQ2.CategoryName = "SQL";

        CategoryQuestion CQ3 = new CategoryQuestion();
        CQ3.CategoryID = 3;
        CQ3.CategoryName = "ASP.Net";

        //CreateQuestion
        Question q1 = new Question();
        q1.QuestionID = 1;
        q1.Content = "Cau hoi ve Java";
        q1.CategoryID = CQ1;
        q1.TypeID = TQ1;
        q1.CreatorID = 1;
        q1.CreateDate = "2020-09-30";

        Question q2 = new Question();
        q2.QuestionID = 2;
        q2.Content = "Cau hoi ve SQL";
        q2.CategoryID = CQ2;
        q2.TypeID = TQ2;
        q2.CreatorID = 2;
        q2.CreateDate = "2021-07-29";

        Question q3 = new Question();
        q3.QuestionID = 3;
        q3.Content = "Cau hoi ve ASP.Net";
        q3.CategoryID = CQ3;
        q3.TypeID = TQ1;
        q3.CreatorID = 3;
        q3.CreateDate = "2020-07-18";

        //Create Answer
        Answer ans1 = new Answer();
        ans1.AnswerID = 1;
        ans1.Content = "tra loi 01";
        ans1.QuestionID = q1;
        ans1.isCorrect = true;

        Answer ans2 = new Answer();
        ans2.AnswerID = 2;
        ans2.Content = "tra loi 02";
        ans2.QuestionID = q2;
        ans2.isCorrect = false;

        Answer ans3 = new Answer();
        ans3.AnswerID = 3;
        ans3.Content = "tra loi 03";
        ans3.QuestionID = q3;
        ans3.isCorrect = true;

        //Create Exam
        Exam e1 = new Exam();
        e1.ExamID = 1;
        e1.Code = 203;
        e1.Title = "De thi Java";
        e1.CategoryID = 1;
        e1.Duration = "60 minutes";
        e1.CreatorID = 1;
        e1.CreateDate = "2023-07-18";

        Exam e2 = new Exam();
        e2.ExamID = 2;
        e2.Code = 204;
        e2.Title = "De thi SQL";
        e2.CategoryID = 2;
        e2.Duration = "45 minutes";
        e2.CreatorID = 2;
        e2.CreateDate =  "2023-07-17";

        Exam e3 = new Exam();
        e3.ExamID = 3;
        e3.Code = 205;
        e3.Title = "De Thi C#";
        e3.CategoryID = 3;
        e3.Duration = "15 minutes";
        e3.CreatorID = 3;
        e3.CreateDate = "2023-07-16";

        //Create ExamQuestion
        ExamQuestion eq1 = new ExamQuestion();
        eq1.QuestionID = q1.QuestionID;
        eq1.ExamID = e1.ExamID;

        ExamQuestion eq2 = new ExamQuestion();
        eq2.QuestionID = q2.QuestionID;
        eq2.ExamID = e2.ExamID;

        ExamQuestion eq3 = new ExamQuestion();
        eq3.QuestionID = q3.QuestionID;
        eq3.ExamID = e3.ExamID;

        //Testing_system_assignment_2
        //Ex1
        //Quest 1
        if(account2.DepartmentID.DepartmentName == null){
            System.out.println("Nhan vien nay khong co phong ban");
        }else {
            System.out.println("Phong ban cua nhan vien nay la: " + account2.DepartmentID.DepartmentName);
        }
        //Quest 2
        System.out.println("-----------Question 2 ------------");
        System.out.println("---------Question 3----------");
        String message = (account2.DepartmentID == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " +account2.DepartmentID.DepartmentName;
        System.out.println(message);
        System.out.println("---------Question 4----------");
        String checkDev = (account1.PositionID.positionName == PositionName.DEV)
                ? "Đây là Dev"
                : "Người này kp là Dev";
        System.out.println(checkDev);
        System.out.println("---------Question 5----------");
        int numberOfAccountsInGroup1 = 0;
        List<GroupAccount> groupAccounts = new ArrayList<>();
        groupAccounts.add(GA1);
        groupAccounts.add(GA2);
        groupAccounts.add(GA3);
        for (GroupAccount groupAccount : groupAccounts) {
            if (groupAccount.GroupID.GroupID == group1.GroupID) {
                numberOfAccountsInGroup1++;
            }
        }
        switch (numberOfAccountsInGroup1) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
        System.out.println("---------Question 6----------");
        switch(account1.PositionID.positionName){
            case DEV:
                System.out.println("Đây là DEV");
                break;
            case SCRUM_MASTER:
                System.out.println("Đây là Scrum Master");
                break;
            case PM:
                System.out.println("Đây là PM");
                break;
            case TEST:
                System.out.println("Đây là Tester");
                break;
            default:
                System.out.println("Không có chức vụ");
                break;
        }
        System.out.println("---------Question 7----------");
        System.out.println("---------Question 8----------");
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        for (Account account : accountList) {
            String email = account.Email;
            String fullName = account.FullName;
            String departmentName = account.DepartmentID.DepartmentName;
            System.out.println("Email: " + email + ", FullName: " + fullName + ", Phòng ban: " + departmentName);
        }
        System.out.println("---------Question 9----------");
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);
        for (Department department : departmentList) {
            int id = department.DepartmentID;
            String name = department.DepartmentName;
            System.out.println("ID: " + id + "| Name: " + name);
        }
        System.out.println("---------Question 10----------");
        List<Account> listAccount = new ArrayList<>();
        listAccount.add(account1);
        listAccount.add(account2);
        listAccount.add(account3);
        for(int i = 0; i < listAccount.size(); i++){
            Account account = listAccount.get(i);
            String email = account.Email;
            String fullName = account.FullName;
            String departmentName = account.DepartmentID.DepartmentName;
            System.out.println("Thông tin account thứ " + (i+1) + " là: ");
            System.out.println("Email: " + email + "\n FullName: " + fullName + "\n DepartmentName: " + departmentName );
        }

        System.out.println("---------Question 11----------");
        List<Department> listDep = new ArrayList<>();
        listDep.add(department1);
        listDep.add(department2);
        listDep.add(department3);
        for(int i = 0; i < listDep.size(); i++){
            Department department = listDep.get(i);
            int id = department.DepartmentID;
            String DepartmentName = department.DepartmentName;
            System.out.println("Thông tin department thứ " + (i+1) + " là:");
            System.out.println("ID: " + id + "\nDepartmentName: " + DepartmentName);
        }
        System.out.println("---------Question 12----------");
        List<Department> depList = new ArrayList<>();
        depList.add(department1);
        depList.add(department2);
        depList.add(department3);
        int count = 0;
        for(Department department : depList){
            int id = department.DepartmentID;
            String DepartmentName = department.DepartmentName;
            System.out.println("Thông tin thứ " + (count+1) + " là: ");
            System.out.println("ID: " + id + "\nDepartmentName: " + DepartmentName);
            count++;
            System.out.println();
            if(count == 2) {
                break;
            }
        }

        System.out.println("---------Question 13----------");

        System.out.println("---------Question 14----------");
        List<Account> accountList2 = new ArrayList<>();
        accountList2.add(account1);
        accountList2.add(account2);
        accountList2.add(account3);
        for (Account account : accountList2) {
            if(account.AccountID < 4){
                String email = account.Email;
                String fullName = account.FullName;
                String departmentName = account.DepartmentID.DepartmentName;
                System.out.println("Thông tin account thứ "+ account.AccountID +" là:");
                System.out.println("Email: " + email + ", FullName: " + fullName + ", Phòng ban: " + departmentName);
            }
        }
        System.out.println("---------Question 15----------");
        for(int i = 1; i<=20; i++){
            if(i%2 == 0){
                System.out.println("In ra các số chẵn nhỏ hơn hoặc bằng 20: " +i);
            }
        }

        //Exercise 2
        System.out.println("-----------Exercise 2-----------");
        // Question 1
        System.out.println("----------------Question 1-----------------");
        int i = 5;
        System.out.printf("Đây là số nguyên: %d \n", i);
        System.out.println("----------Question 2-----------");
        int n = 1000000000;
        System.out.printf("Đây là số nguyên: %,d \n", n);
        System.out.println("---------Question 3--------");
        double f = 5.567098;
        System.out.printf("Đây là số thực chỉ lấy 4 số đằng sau: %.4f \n",f);
        System.out.println("-----------Question 4----------");
        String fullName = "Nguyễn Văn A";
        System.out.println("Tên tôi là " + fullName + " và tôi đang độc thân");
        System.out.println("-----------Question 5-----------");

//        System.out.println("-----------Exercise 3-----------");
//        System.out.println("-----------Question 1-----------");
//        List<Exam> examList = new ArrayList<>();
//        examList.add(e1);
//        examList.add(e2);
//        examList.add(e3);
//
//        // Display information of the creation date for each exam using for-each loop
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        for (Exam exam : examList) {
//            LocalDateTime createDate = LocalDateTime.parse(exam.CreateDate, formatter2);
//            String formattedCreateDate = createDate.format(formatter2);
//
//            System.out.println("Exam đã tạo ngày: " + formattedCreateDate);
//        }
//        System.out.println("-------------Question 3------------");
//        List<Exam> examList2 = new ArrayList<>();
//        examList2.add(e1);
//        examList2.add(e2);
//        examList2.add(e3);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        for (Exam exam : examList) {
//            LocalDateTime createDate = LocalDateTime.parse(exam.CreateDate, formatter);
//            int year = createDate.getYear();
//
//            System.out.println("Năm của create date là: " + year);
//        }

        System.out.println("----------Exercise 4-----------");
        System.out.println("----------Question 1-----------");
        Random random = new Random();
        int RanNum = random.nextInt();
        System.out.println("So nguyen ngau nhien la: " + RanNum);

        System.out.println("----------Question 2-----------");
        double RanDouble = random.nextDouble();
        System.out.println("So thuc ngau nhien la: " + RanDouble);

        System.out.println("----------Exercise 5-----------");
        System.out.println("----------Question 1-----------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu nhat: ");
        int number1 = scanner.nextInt();
        System.out.println("Nhap so nguyen thu hai: ");
        int number2 = scanner.nextInt();
        System.out.println("Nhap so nguyen thu ba: ");
        int number3 = scanner.nextInt();
        System.out.println("Ba so nguyen ban vua nhap la: " + number1 + ", " + number2 + ", " + number3);


        System.out.println("----------Question 3-----------");
        System.out.println("Nhap ho va ten: ");
        String fullName1 = scanner.nextLine();
        System.out.println("Ho va ten ban vua nhap la: " +fullName1);



    }
}
