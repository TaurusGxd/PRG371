USE PRG


CREATE TABLE Register
(register_id INT PRIMARY KEY,
student_id INT,
course_name VARCHAR(100),
student_name VARCHAR(50),
student_address VARCHAR(200),
student_email VARCHAR(200),
student_password VARCHAR(200),
FOREIGN KEY (student_id) REFERENCES Students(student_id)
);

GO