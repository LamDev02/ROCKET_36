
-- Cau 1
SELECT * FROM `account` acc
INNER JOIN  department dep
ON acc.DepartmentID = dep.DepartmentID;

-- Cau 2
SELECT * FROM `account`
WHERE CreateDate > '2012/12/20';

-- Cau 3
SELECT * FROM `account` acc
INNER JOIN `Position` pos
ON acc.PositionID = pos.PositionID
WHERE pos.PositionName = 'Dev';

-- Cau 4
SELECT DepartmentName, COUNT(DepartmentID) FROM `account` acc
INNER JOIN `Department` dep
ON acc.DepartmentID = dep.DepartmentID 
GROUP BY acc.DepartmentID
HAVING COUNT(DepartmentID) > 3 ;

-- Cau 5 
SELECT QuestionID, COUNT(*) AS ExamCounter
FROM ExamQuestion
GROUP BY QuestionID
ORDER BY COUNT(*) DESC
LIMIT 1;
-- Cau 5 loi giai
SELECT q.QuestionID, q.Content, COUNT(1) AS solanxuathien FROM question q
INNER JOIN examquestion eq
ON  q.QuestionID = eq.QuestionID
GROUP BY q.QuestionID HAVING solanxuathien = (
SELECT MAX(listxuathien) FROM (SELECT COUNT(1) AS listxuathien FROM examquestion GROUP BY QuestionID) AS temp_table
);
-- Cau 6
SELECT CategoryID, COUNT(*) AS QuestionCounter
FROM Question
GROUP BY CategoryID;

-- Cau 7
SELECT QuestionID, COUNT(*) AS ExamCounter
FROM ExamQuestion
GROUP BY QuestionID;

-- Cau 8
SELECT QuestionID, COUNT(*) AS AnswerCounter
FROM Answer
GROUP BY QuestionID
ORDER BY COUNT(*) DESC
LIMIT 1;

-- Cau 8 loi giai
SELECT q.QuestionID, q.Content, COUNT(1) AS total_sltl FROM question q
INNER JOIN answer ans
ON q.QuestionID = ans.QuestionID
GROUP BY q.QuestionID HAVING total_sltl = (SELECT MAX(listmax) FROM
(SELECT COUNT(1) AS listmax FROM answer ans GROUP BY QuestionID) AS findmaxTb
);

-- Cau 9(error)
SELECT GroupID, COUNT(*) AS AccountCount FROM `Account` acc
JOIN `group` gr 
ON acc.GroupID = gr.GroupID
GROUP BY GroupID;

-- Cau 10
SELECT PositionName, COUNT(*) AS EmployeeCounter
FROM Position
GROUP BY PositionName
ORDER BY COUNT(*) ASC
LIMIT 5;

-- Cau 10 loi giai
SELECT pos.PositionID, pos.PositionName, COUNT(1) AS tongsonguoi FROM `account` acc
INNER JOIN position pos
ON acc.PositionID = pos.PositionID
GROUP BY pos.PositionID HAVING tongsonguoi = (SELECT MIN(listmin) FROM
(SELECT COUNT(0) AS listmin FROM `account` GROUP BY PositionID) AS findmin);

-- Cau 11
SELECT d.DepartmentName, p.PositionName, COUNT(1) AS total FROM `account` a
INNER JOIN department d ON a.DepartmentID = d.DepartmentID
INNER JOIN position p ON a.PositionID = p.PositionID
GROUP BY d.DepartmentID, p.PositionID;

SELECT  d.DepartmentID, COUNT(1) FROM `account` a
INNER JOIN department d ON a.DepartmentID = d.DepartmentID
GROUP BY a.DepartmentID;

SELECT p.PositionID, p.PositionName, COUNT(1) FROM `account` a
INNER JOIN position p ON a.PositionID = p.PositionID
GROUP BY p.PositionID;

-- Cau 12
SELECT q.Content, tq.TypeName, acc.FullName, ans.Content FROM question q 
INNER JOIN typequestion tq ON q.TypeID = tq.TypeID
INNER JOIN `account` acc ON q.CreatorID = acc.AccountID
INNER JOIN answer ans ON q.QuestionID = ans.QuestionID;

-- Cau 13
SELECT tq.TypeID,tq.TypeName, COUNT(1) AS totalQ FROM Question q
INNER JOIN typequestion tq ON q.TypeID = tq.TypeID
GROUP BY q.TypeID;

-- Cau 14 + 15
SELECT * FROM groupaccount ga
RIGHT JOIN `group` gr ON ga.GroupID = gr.GroupID
WHERE ga.AccountID IS NULL;
-- Cau 16
SELECT * FROM answer a
RIGHT JOIN question q ON a.QuestionID = q.QuestionID
WHERE a.AnswerID IS NULL;
-- Cau  17 
SELECT a.FullName FROM `account` a
INNER JOIN groupaccount ga ON a.AccountID = ga.AccountID
WHERE ga.GroupID = 1
UNION
SELECT a.FullName FROM `account` a
INNER JOIN groupaccount ga ON a.AccountID = ga.AccountID
WHERE ga.GroupID = 2;

-- Cau 18
SELECT g.GroupName, COUNT(ga.GroupID) AS SL FROM groupaccount ga
JOIN `group` g ON ga.GroupID = g.GroupID
GROUP BY ga.GroupID HAVING COUNT(ga.GroupID) >=5
UNION
SELECT g.GroupName, COUNT(ga.GroupID) AS SL FROM groupaccount ga
JOIN `group` g ON ga.GroupID = g.GroupID
GROUP BY ga.GroupID HAVING COUNT(ga.GroupID) <= 7