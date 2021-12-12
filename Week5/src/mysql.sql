#1
CREATE TABLE cqupt_student(
                              studentid VARCHAR(10),
                              name VARCHAR(20),
                              sex VARCHAR(2),
                              age INTEGER,
                              Fee DECIMAL(10,2),
                              address VARCHAR(50),
                              memo VARCHAR(300)
);
#2
CREATE TABLE CourseAa(
                         Aa1 VARCHAR(20),
                         Aa2 INTEGER,
                         Aa3 VARCHAR(10)
);
#3
CREATE TABLE chooseBb(
                         Bb1 VARCHAR(30),
                         Bb2 INTEGER,
                         Bb3 DECIMAL(6)
);
#4
ALTER TABLE ChooseBb ADD Bb4 VARCHAR(20) NOT NULL DEFAULT "系统测试值";
#5
ALTER TABLE ChooseBb ADD Bb5 VARCHAR(10) PRIMARY KEY;
#6
CREATE VIEW View_Choosebb (View_bb1,View_bb2,view_bb3) AS SELECT Bb1,Bb4,Bb5 FROM ChooseBb;
#7
DROP VIEW view_choosebb;
#8
CREATE INDEX Index_bb2 ON ChooseBb(Bb2);
CREATE INDEX Index_bb4 ON ChooseBb(Bb4);
#9
DROP INDEX Index_bb2 ON ChooseBb;
#10
CREATE TABLE test(
                     Name VARCHAR(20),
                     Age INTEGER,
                     Score NUMERIC(10,2),
                     Address VARCHAR(60)
);
#11
INSERT INTO test (Name,Age,Score,Address) VALUES ("赵一",20,580.00,"重邮宿舍12-3-5");
INSERT INTO test (Name,Age,Score,Address) VALUES ("钱二",19,540.00,"南福苑5-2-9");
INSERT INTO test (Name,Age,Score,Address) VALUES ("孙三",21,555.50,"学生新区21-5-15");
INSERT INTO test (Name,Age,Score,Address) VALUES ("李四",22,505.00,"重邮宿舍8-6-22");
INSERT INTO test (Name,Age,Score,Address) VALUES ("周五",20,495.50,"学生新区23-4-8");
INSERT INTO test (Name,Age,Score,Address) VALUES ("吴六",19,435.00,"南福苑2-5-12");
#12
CREATE TABLE test_temp(
                          Name VARCHAR(20),
                          Age INTEGER,
                          Score NUMERIC(10,2),
                          Address VARCHAR(60)
);
#13
INSERT INTO test_temp (Name,Age,Score,Address) VALUES ("郑七",21,490.50,"重邮宿舍11-2-1");
INSERT INTO test_temp (Name,Age,Score,Address) VALUES ("张八",20,560.00,"南福苑3-3-3");
INSERT INTO test_temp (Name,Age,Score,Address) VALUES ("王九",10,515.00,"学生新区19-7-1");
#14
INSERT INTO test(Name,Age,Score,Address) SELECT * FROM test_temp;
#15
UPDATE test SET Score=Score+5 WHERE Age<=20;
#16
UPDATE test SET Age=Age-1 WHERE Address LIKE '南福苑%';
#17
DELETE FROM test WHERE Age>=21 AND Score>=500;
#18
DELETE FROM test WHERE Score<550 AND Address LIKE '重邮宿舍%';
#19
CREATE TABLE Student (
                         SNO VARCHAR(20),
                         Name VARCHAR(10),
                         Age INTEGER,
                         College VARCHAR(30)
);
#20
CREATE TABLE Course(
                       CourseID VARCHAR(15),
                       CourseName VARCHAR(30),
                       CourseBeforeID VARCHAR(15)
);
#21
CREATE TABLE Choose(
                       SNO VARCHAR(20),
                       CourseID VARCHAR(30),
                       Score DECIMAL(5,2)
);
#22
INSERT INTO Student (SNO,Name,Age,College) VALUES ("S00001","张三",20,"计算机学院");
INSERT INTO Student (SNO,Name,Age,College) VALUES ("S00002","李四",19,"通信学院");
INSERT INTO Student (SNO,Name,Age,College) VALUES ("S00003","王五",21,"计算机学院");
#23
INSERT INTO Course (CourseID,CourseName) VALUES ("C1","计算机引论");
INSERT INTO Course (CourseID,CourseName,CourseBeforeID) VALUES ("C2","C语言","C1");
INSERT INTO Course (CourseID,CourseName,CourseBeforeID) VALUES ("C3","数据结构","C2");
#24
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00001","C1",95);
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00001","C2",80);
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00001","C3",84);
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00002","C1",80);
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00002","C2",85);
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00003","C1",78);
INSERT INTO Choose (SNO,CourseID,Score) VALUES ("S00003","C3",70);
#25
SELECT SNO,Name FROM student WHERE College="计算机学院";
#26
SELECT Age FROM student WHERE Age BETWEEN 20 AND 23;
#27
SELECT COUNT(*) FROM student;
#28
SELECT MAX(Score) FROM Choose WHERE CourseID="C1";
SELECT MIN(Score) FROM Choose WHERE CourseID="C1";
SELECT SUM(Score) FROM Choose WHERE CourseID="C1";
SELECT AVG(Score) FROM Choose WHERE CourseID="C1";
#29
SELECT CourseID,CourseName FROM Course WHERE CourseBeforeID IS NULL;
#30
SELECT student.SNO,Name,CourseName,Score FROM student,Course,Choose;
#31
SELECT * FROM student a WHERE EXISTS(SELECT * FROM student b WHERE b.College=a.College AND b.Name="张三");
#32
SELECT SNO,Score
FROM Choose
WHERE CourseID="C1" AND Score<(
    SELECT SCore
    FROM Choose,student
    WHERE student.SNO=Choose.SNO AND Name="张三" AND CourseID="C1");
#33
SELECT SNO FROM Choose WHERE CourseID="C1"
UNION
SELECT SNO FROM Choose WHERE CourseID="C3";
#34
SELECT DISTINCT SNO FROM Choose WHERE CourseID="C1"
UNION
SELECT DISTINCT SNO FROM Choose WHERE CourseID="C3";

