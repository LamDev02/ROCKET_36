create database Testing_System_Assignment_2;
use Testing_System_Assignment_2;

CREATE TABLE Department(
	DepartmentID TINYINT PRIMARY KEY,
    DepartmentName CHAR(50)
);
-- Add Data Department
INSERT INTO Department(DepartmentID, DepartmentName)
VALUES  
(1, N'Marketing'),
(2, N'Sale'),
(3, N'Bao Ve'),
(4, N'Nhan Su'),
(5, N'KyThuat');

CREATE TABLE `Position` (
    PositionID TINYINT PRIMARY KEY,
    PositionName CHAR(50)
);
-- Add Data in Position tb
INSERT INTO Position (PositionID, PositionName)
VALUES  
(1, N'Dev'),
(2, N'Tester'),
(3, N'PM'),
(4, N'Scrum Master'),
(5, N'BA');
CREATE TABLE `Account`(
	AccountID TINYINT PRIMARY KEY,
	Email CHAR(50),
	Username VARCHAR(50),
	Fullname VARCHAR(50),
	DepartmentID TINYINT,
	PositionID TINYINT,
	CreateDate DATE,
    FOREIGN KEY (PositionID) REFERENCES `Position` (PositionID),
    FOREIGN KEY (DepartmentID) REFERENCES Department (DepartmentID)
);
INSERT INTO `Account` (AccountID, Email, Username,Fullname, DepartmentID, PositionID, CreateDate)
VALUES  
(1, N'abc@gmail.com', N'abc', N'Nguyen van A', 1, 1, '2020-09-28'),
(2, N'def@gmail.com', N'def', N'Nguyen van B', 2, 2, '2021-07-20'),
(3, N'ghj@gmail.com', N'ghj',N'Nguyen van C', 3, 3, '2022-08-30'),
(4, N'jkl@gmail.com', N'jkl',N'Nguyen van D', 4, 4, '2018-06-10'),
(5, N'xyz@gmail.com', N'xyz',N'Nguyen van E', 5, 5, '2020-05-25');

CREATE TABLE `Group` (
	GroupID TINYINT PRIMARY KEY,
    GroupName CHAR(50),
    CreatorID TINYINT,
    CreateDate DATE
);
INSERT INTO `Group` (GroupID, GroupName,CreatorID,CreateDate)
VALUES  
(1, N'Nhom A', 101, '2020-07-20'),
(2, N'Nhom B', 102, '2021-06-25'),
(3, N'Nhom C', 103, '2019-05-25'),
(4, N'Nhom D', 104, '2019-07-07'),
(5, N'Nhom E', 105, '2022-11-11');

CREATE TABLE GroupAccount(
	GroupID TINYINT,
	AccountID TINYINT,
    JoinDate DATE,
    FOREIGN KEY (GroupID) REFERENCES `Group` (GroupID),
    FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);
INSERT INTO GroupAccount (GroupID, AccountID,JoinDate)
VALUES  
(1, 1, '2020-07-20'),
(2, 2, '2021-06-25'),
(3, 3, '2019-05-25'),
(4, 4, '2019-07-07'),
(5, 5, '2022-11-11');

CREATE TABLE TypeQuestion(
	TypeID TINYINT PRIMARY KEY,
    TypeName VARCHAR(50)
);
INSERT INTO TypeQuestion(TypeID, TypeName)
VALUES
(1, N'Essay'),
(2, N'Multiple-Choice');

CREATE TABLE CategoryQuestion(
	CategoryID TINYINT PRIMARY KEY,
    CategoryName VARCHAR(50)
);
INSERT INTO CategoryQuestion(CategoryID, CategoryName)
VALUES
(1, N'Java'),
(2, N'.Net'),
(3, N'SQL'),
(4, N'RUBY'),
(5, N'PostMan');

CREATE TABLE Question(
	QuestionID TINYINT PRIMARY KEY,
    Content VARCHAR(500),
    CategoryID TINYINT,
    TypeID TINYINT,
    CreatorID TINYINT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion (CategoryID),
    FOREIGN KEY (TypeID) References TypeQuestion (TypeID) 
);
INSERT INTO Question (QuestionID, Content, CategoryID, TypeID, CreatorID, CreateDate)
VALUES 
(1, N'Cac tinh chat cua OOP trong java?', 1,1,1, '2023-5-10'),
(2, N'Hay viet ra cac cu phap truy van Them,Sua, Xoa duoc su dung trong MySQL', 3,1,2, '2023-5-10'),
(3, N'SQL viet tat la gi?', 3,1,3, '2023-5-10'),
(4, N'Cach de in "Hello World"ra man hinh bang ngon ngu Java?', 1,1,4, '2023-5-10'),
(5, N'3 IDE pho bien ma cac LTV su dung de lap trinh Java', 1,1,5, '2023-5-10');

CREATE TABLE Answer(
	AnswerID TINYINT PRIMARY KEY,
    Content VARCHAR(500),
    QuestionID TINYINT,
    isCorrect BIT(1),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);
INSERT INTO Answer(AnswerID, Content, QuestionID, isCorrect)
VALUES
(1, N'Co 4 tinh chat trong OOP la: Dong goi, Truu tuong, Ke thua, Da Hinh', 1, 1),
(2, N'Do chinh la INSERT INTO, UPDATE SET WHERE, DELETE FROM WHERE,', 2, 1),
(3, N'La Structured Querry Language', 3, 1),
(4, N'System.out.Println ("Hello World");', 4, 1),
(5, N'Do la Eclipse, IntelliJ IDEA, NetBeans', 5, 1);

CREATE TABLE Exam(
	ExamID TINYINT PRIMARY KEY,
    `Code` TINYINT,
    Title VARCHAR(30),
    CategoryID TINYINT,
    Duration VARCHAR(50),
    CreatorID TINYINT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)
);
INSERT INTO Exam(ExamID, `Code`, Title, CategoryID, Duration, CreatorID, CreateDate)
VALUES
(1, 1,N'Kiem tra giua ky mon Java', 1, N'45 Minutes' , 1, '2023-5-10'),
(2, 2,N'Kiem tra giua ky mon SQL', 3 ,N'45 Minutes', 2, '2023-5-10'),
(3, 3,N'Kiem tra giua ky mon SQL', 3 ,N'45 Minutes', 3, '2023-5-10'),
(4, 4,N'Kiem tra giua ky mon Java', 1 ,N'45 Minutes', 4, '2023-5-10'),
(5, 5,N'Kiem tra giua ky mon Java', 1 ,N'45 Minutes', 5, '2023-5-10');


CREATE TABLE ExamQuestion(
	ExamID TINYINT,
    QuestionID TINYINT,
    FOREIGN KEY (QuestionID) REFERENCES Question (QuestionID),
    FOREIGN KEY (ExamID) REFERENCES Exam (ExamID)
);

INSERT INTO ExamQuestion(ExamID, QuestionID)
VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5);


Drop Database Testing_System_Assignment_2;






