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
        ans1.AnswerID = 2;
        ans1.Content = "tra loi 02";
        ans1.QuestionID = q2;
        ans1.isCorrect = false;

        Answer ans3 = new Answer();
        ans1.AnswerID = 3;
        ans1.Content = "tra loi 03";
        ans1.QuestionID = q3;
        ans1.isCorrect = true;

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

        //Print Value
        //Department
        System.out.println("Thong tin phong ban 1:");
        System.out.println("Department ID: " + department1.DepartmentID);
        System.out.println("Department Name: " + department1.DepartmentName);
        System.out.println("\n");

        //Position
        System.out.println("Thong tin vi tri");
        System.out.println("Position ID" + position1.PositionID);
        System.out.println("Position Name: " + position1.positionName);
        System.out.println("\n");

        //Account
        System.out.println("Thong tin ve tai khoan");
        System.out.println("Account ID: " + account1.AccountID);
        System.out.println("Email: " + account1.Email);
        System.out.println("Username: " + account1.Username);
        System.out.println("FullName: " + account1.FullName);
        System.out.println("DepartmentID: " + account1.DepartmentID);
        System.out.println("PositionID: " + account1.PositionID);
        System.out.println("CreateDate: " + account1.CreateDate);
        System.out.println("\n");

        //Group
        System.out.println("Thong tin ve Group");
        System.out.println("GroupID:" + group1.GroupID);
        System.out.println("GroupName: " + group1.GroupName);
        System.out.println("CreatorID: " + group1.CreatorID);
        System.out.println("CreateDate: " + group1.CreateDate);
        System.out.println("\n");

        //Group Account
        System.out.println("Thong tin ve Group Account");
        System.out.println("GroupID: " + GA1.GroupID);
        System.out.println("AccountID" + GA1.AccountID);
        System.out.println("JoinDate" + GA1.JoinDate);
        System.out.println("\n");

        //TypeQuestion
        System.out.println("Thong tin ve Type Question");
        System.out.println("TypeID: " + TQ1.TypeID);
        System.out.println("TypeName: " + TQ1.typeName);
        System.out.println("\n");

        //CategoryQuestion
        System.out.println("Thong tin ve Category Question");
        System.out.println("CategoryID: " + CQ1.CategoryID);
        System.out.println("CategoryName: " + CQ1.CategoryName);
        System.out.println("\n");

        //Question
        System.out.println("Thong tin ve Question");
        System.out.println("QuestionID: " + q1.QuestionID);
        System.out.println("Content: " + q1.Content);
        System.out.println("CategoryID: " + q1.CategoryID);
        System.out.println("TypeID: " + q1.TypeID);
        System.out.println("CreatorID: " + q1.CreatorID);
        System.out.println("CreateDate:" + q1.CreateDate);
        System.out.println("\n");

        //Answer
        System.out.println("Thong tin ve Answer");
        System.out.println("AnswerID: " + ans1.AnswerID);
        System.out.println("Content: " + ans1.Content);
        System.out.println("QuestionID: " + ans1.QuestionID);
        System.out.println("isCorrect" + ans1.isCorrect);
        System.out.println("\n");

        //Exam
        System.out.println("Thong tin ve Exam");
        System.out.println("ExamID: " + e1.ExamID);
        System.out.println("Code: " + e1.Code);
        System.out.println("Title: " + e1.Title);
        System.out.println("CategoryID: " + e1.CategoryID);
        System.out.println("Duration: " + e1.Duration);
        System.out.println("CreatorID: " + e1.CreatorID);
        System.out.println("CreateDate: " + e1.CreateDate);
        System.out.println("\n");

        //ExamQuestion
        System.out.println("Thong tin ve ExamQuestion");
        System.out.println("ExamID: " + eq1.ExamID);
        System.out.println("QuestionID: " +eq1.QuestionID);
        System.out.println("\n");

        //Testing_system_assignment_2
        System.out.println("-----------");
        if(account2.DepartmentID == null){
            System.out.println("Nhan vien nay khong co phong ban");
        }else {
            System.out.println("Phong ban cua nhan vien nay la: " + department2.DepartmentName);
        }
    }
}
