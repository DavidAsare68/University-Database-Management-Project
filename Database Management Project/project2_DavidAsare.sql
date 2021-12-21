
/* Create statements that could have been used to make tables */
/*CREATE TABLE `algomau` (
  `department` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `major` varchar(255) DEFAULT NULL
)  */

/* CREATE TABLE `co-op` (
  `co-op_ID` int DEFAULT NULL,
  `student_ID` int DEFAULT NULL,
  `full_student_name` varchar(255) DEFAULT NULL,
  `co-op_enroll` varchar(255) DEFAULT NULL
) */

/*CREATE TABLE `course` (
  `course_ID` int DEFAULT NULL,
  `course_Name` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `section_ID` int DEFAULT NULL,
  `teacher teaching course` varchar(255) DEFAULT NULL,
  `teacher_ID` int DEFAULT NULL,
  `team_teaching` bit(1) DEFAULT NULL
) */

/* CREATE TABLE `faculty` (
  `teacher_ID` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `birth_date` datetime DEFAULT NULL,
  `address` mediumtext,
  `phone_num` bigint DEFAULT NULL,
  `course_offered` varchar(255) DEFAULT NULL,
  `second_course_offered` varchar(255) DEFAULT NULL,
  `Term` varchar(255) DEFAULT NULL
) */

/* CREATE TABLE `grade` (
  `grading_ID` int DEFAULT NULL,
  `final_grades` int DEFAULT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `teachers_name` varchar(255) DEFAULT NULL,
  `student_ID` int DEFAULT NULL
) */

/* CREATE TABLE `student` (
  `student_ID` int DEFAULT NULL,
  `courses_ID` int DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `birth_date` datetime DEFAULT NULL,
  `address` mediumtext,
  `Phone_Num` bigint DEFAULT NULL,
  `start_date` datetime DEFAULT NULL,
  `end_date` datetime DEFAULT NULL,
  `term` varchar(255) DEFAULT NULL
) */

/* Creating view for student Clark Kent academic summary */

/*create VIEW `Clark_Kent_Academinc_Summary` AS
select project_two.student.student_ID,  first_name, last_name, courses_ID, course_name, final_grades
from student, grade
where student.student_ID = grade.student_ID
and grading_id='501';  */

/*select * from `Clark_Kent_Academinc_Summary` */

/*Creating view for faculty member Tony Stark */
create VIEW `Tony_Stark_Courses_Taught` AS
select teacher_ID, first_name, last_name,course_offered, second_course_offered, Term
from faculty
where teacher_ID= '261'; 







