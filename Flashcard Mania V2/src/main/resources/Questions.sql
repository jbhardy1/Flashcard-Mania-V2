START TRANSACTION;

DROP TABLE IF EXISTS questions CASCADE;

CREATE TABLE questions(

    question_number serial not null,
    question_type varchar(10) not null,
    question text not null,
    question_answer text not null,
    CONSTRAINT PK_question PRIMARY KEY(question_number)

);

INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is Type Casting', 'Converting data from one type to another, e.g., from string to int');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is Widening', 'type casting from a smaller data type to a larger type. Happens implicitly, or automatically.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is Narrowing', 'type casting from a larger data type to a smaller type. Happens explicitly, meaning you''ll have to apply certain syntax to do so.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is the Java Development Kit?', 'The JDK is a software development kit that is a superset of JRE. It is the foundational component that enables Java application and Java applet development.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab','What is the Java Runtime Environment?', 'The JRE is a set of software tools responsible for execution of the Java program or application on your system.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is the Java Virtual Machine?', 'The JVM is responsible for converting bytecode to machine-specific (binary) code and is necessary in both JDK and JRE. It is also platform-dependent and performs many functions, including memory management and security.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is an Integrated Development Environment?', 'The IDE enables programmers to consolidate the different aspects of writing a computer program.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is a variable?', 'A container for storing data values, e.g., String, int, double, etc..');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is a Primitive Data Type?','A primitive data type specifies the size and type of variable values, and it has no additional methods. Ex: byte, short, int, long');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is a Reference Data Type?', 'A non-primitive data type. It holds the address(reference) of dynamically created objects');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is an array?', 'A group of elements that share the same data type.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is an element?', 'An individual data point in an array.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What does Scope refer to?', 'The region of code where variables and initialized and used.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is parsing?', 'The conversion of data between unlike types');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is the Stack?', 'A static memory area within the JVM where primitive values are stored.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab', 'What is the Heap?', 'A dynamic memory area where reference type values are stored.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Vocab','What does MVC refer to?','Model-View-Controller is a design pattern that emphasises sections of code having specific purposes.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What is the difference between Arrays and Lists?', 'Arrays are immutable but Lists are malleable and can be manipulated.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What is a database driver?', 'Drivers supplied by a vendor to interact with DAOs and databases.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What are the two ways you can achieve polymorphism?', 'Inheritance and Polymorphism.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What is a design pattern?','Toolkits of solutions to common problems in software design');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What are different types of testing you may use as a developer?', 'Unit, integration, functional, end-to-end, acceptance testing, performance testing, and smoke testing.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview','What is a web service?', 'A set of open protocols and standards that allow data to be exchanged between different applications or systems.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What is a Restful Web Service?','Highly scalable, light and maintainable styles applied to web services to create APIs for web based applications');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview', 'What is the difference between Authentication and Authorization?','Authentication is the process of verifying a user, Authorization is verifying what that user has access to.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview','What is the difference between a private variable and a protected variable?','Private variables are only visible in the class they are created in. Protected variables are visible in that class and all subclasses that extend that class.');
INSERT INTO questions (question_type, question, question_answer) VALUES ('Interview','What are the different types of databases?','Relational, Distributed, Hierarchical, OOP and Network DBMS.');

COMMIT;