# Student Database System

This Java program is a simple student database system. It allows users to perform various operations related to student data management.

## Classes

The program consists of two classes:

1. `Students`: This class represents a student with the following attributes:
    - `name`: The name of the student.
    - `rollNo`: The roll number of the student.
    - `age`: The age of the student.
    - `marks`: The marks obtained by the student.

    The `Students` class also includes a method `viewStudent()` to display the details of a student.

2. `StudentDatabaseSystem`: This class contains the `main` method which drives the program. It uses a `HashMap` to store student data, with the roll number as the key and the `Students` object as the value.

## Features

The program provides the following features:

1. **Add Student**: Allows the user to add a new student to the database. The user is prompted to enter the student's name, roll number, age, and marks.

2. **View Students**: Displays the details of all students in the database.

3. **Search Students**: Allows the user to search for a student using their roll number.

4. **Calculate Average**: Calculates and displays the average marks of all students in the database.

5. **Exit**: Terminates the program.

The program runs in a loop, continuously prompting the user to select an operation until they choose to exit.

## Error Handling

The program includes a `try-catch` block to handle any exceptions that may occur during the execution of the program.

## Usage

To run the program, compile and execute the `StudentDatabaseSystem` class. The program will display a menu of operations. Enter the number corresponding to the desired operation and follow the prompts.

Please note that this is a console-based program and requires user interaction for its operation.
