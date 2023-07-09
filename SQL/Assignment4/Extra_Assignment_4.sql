-- Give following table:
-- Department (Department_Number, Department_Name)
-- Employee_Table (Employee_Number, Employee_Name,
-- Department_Number)
-- Employee_Skill_Table (Employee_Number, Skill_Code, Date Registered)

CREATE DATABASE Extra_Assignment_4;
USE Extra_Assignment_4;

CREATE TABLE Department(
	Department_Number TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name NVARCHAR (50)
);
-- Them Records vao Department
INSERT INTO Department(Department_Number, Department_Name)
VALUES
	(1, N'Marketing' ),
	(2, N'Sale' ),
	(3, N'Bảo vệ' ),
	(4, N'Nhân sự' ),
	(5, N'Kỹ thuật' ),
	(6, N'Tài chính' ),
	(7, N'Phó giám đốc'),
	(8, N'Giám đốc' ),
	(9, N'Thư kí' ),
	(10, N'Bán hàng' );

CREATE TABLE Employee_Table(
	Employee_Number TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name CHAR(50),
    Department_Number TINYINT UNSIGNED,
    FOREIGN KEY(Department_Number) REFERENCES Department (Department_Number)
);
INSERT INTO Employee_Table(Employee_Number, Employee_Name, Department_Number)
VALUES
(1, 'Nguyen Van A', 2),
(2, 'Nguyen Van B', 4),
(3, 'Nguyen Van C', 2),
(4, 'Nguyen Van D', 5),
(5, 'Nguyen Van E', 6),
(6, 'Nguyen Van F', 9),
(7, 'Nguyen Van G', 9),
(8, 'Nguyen Van H', 2),
(9, 'Nguyen Van I', 2),
(10, 'Nguyen Van J',9);


CREATE TABLE Employee_Skill_Table(
	Employee_Number TINYINT UNSIGNED,
    SkillCode VARCHAR (50),
    Date_Registered DATE,
    FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);
INSERT INTO Employee_Skill_Table(Employee_Number, SkillCode, Date_Registered)
VALUES 
(3, 'JAVA', '2023-07-12'),
(1, 'HTML', '2021-05-25'),
(1, 'CSS', '2022-08-28'),
(3, 'PYTHON', '2020-03-15'),
(4, 'C', '2018-02-07'),
(4, 'C++', '2018-03-11'),
(4, 'C#', '2019-04-30'),
(5, 'RUBY', '2022-09-22'),
(6, 'REACTJS', '2021-08-14'),
(10, 'REACTNATIVE', '2020-01-27');

-- Question 3: Query all Employee (include: name) who has Java skill
-- Instruction: Using UNION

-- Question 4: Query all department which has more than 3 employee
SELECT Department_Name, COUNT(*) AS Employee_Count
FROM Employee_Table ET
INNER JOIN Department d ON ET.Department_Number = d.Department_Number
GROUP BY Department_Name
HAVING COUNT(*) > 3;

-- Question 5: Query all employee of each department.
-- Instruction: Using GROUP BY
SELECT Department_Name, Employee_Name FROM Employee_Table ET
INNER JOIN Department d ON ET.Department_Number = d.Department_Number
GROUP BY Department_Name, Employee_Name;

-- Question 6: Query all Employee (include: name) who has more than 1 skills.
-- Instruction: Using DISTINCT
SELECT DISTINCT Employee_Name FROM Employee_Table et
INNER JOIN Employee_Skill_Table est ON et.Employee_Number = est.Employee_Number
GROUP BY et.Employee_Number HAVING COUNT(*) > 1 ;

DROP DATABASE extra_assignment_4

