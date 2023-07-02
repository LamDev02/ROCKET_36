create database Testing_System_Assignment_2;
use Testing_System_Assignment_2;

CREATE TABLE Department(
	DepartmentID TINYINT PRIMARY KEY,
    DepartmentName CHAR(50)
);

CREATE TABLE `Position` (
    PositionID TINYINT PRIMARY KEY,
    PositionName CHAR(50)
);

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

CREATE TABLE `Group` (
	GroupID TINYINT PRIMARY KEY,
    GroupName CHAR(50),
    CreatorID TINYINT,
    CreateDate DATE
);

CREATE TABLE GroupAccount(
	GroupID TINYINT,
	AccountID TINYINT,
    JoinDate DATE,
    FOREIGN KEY (GroupID) REFERENCES `Group` (GroupID),
    FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

CREATE TABLE TypeQuestion(
	TypeID TINYINT PRIMARY KEY,
    TypeName VARCHAR(50)
);

CREATE TABLE CategoryQuestion(
	CategoryID TINYINT PRIMARY KEY,
    CategoryName VARCHAR(50)
);

CREATE TABLE Question(
	QuestionID TINYINT PRIMARY KEY,
    Content VARCHAR(50),
    CategoryID TINYINT,
    TypeID TINYINT,
    CreatorID TINYINT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion (CategoryID),
    FOREIGN KEY (TypeID) References TypeQuestion (TypeID) 
);

CREATE TABLE Answer(
	AnswerID TINYINT PRIMARY KEY,
    Content VARCHAR(50),
    QuestionID TINYINT,
    isCorrect BIT(1),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

CREATE TABLE Exam(
	ExamID TINYINT PRIMARY KEY,
    `Code` TINYINT,
    Title VARCHAR(30),
    CategoryID TINYINT,
    Duration TIME,
    CreatorID TINYINT,
    CreateDate DATE,
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)
);

CREATE TABLE ExamQuestion(
	ExamID TINYINT,
    QuestionID TINYINT,
    FOREIGN KEY (QuestionID) REFERENCES Question (QuestionID),
    FOREIGN KEY (ExamID) REFERENCES Exam (ExamID)
);




