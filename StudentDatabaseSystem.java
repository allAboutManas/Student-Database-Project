import java.util.*;

class Students {
     String name;
     int rollNo;
     int age;
     int marks;

    // Contructor are the methods those have same name as class and they do not have return type
    

    public Students(String name, int rollNo, int age, int marks) {

        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

   

    public void viewStudent() {
        System.out.println("Name " + name);
        System.out.println("RollNo. " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Marks " + marks);
    }
}

public class StudentDatabaseSystem {
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Students> database = new HashMap<>();

        while (true) {
            System.out.println("1. Add Student ");
            System.out.println("2. View Student ");
            System.out.println("3. Search Students ");
            System.out.println("4. Calculate Average ");
            System.out.println("5.Exit ");
            System.out.print("Enter Your Input: ");
            int Input = sc.nextInt();
            sc.nextLine();

            switch (Input) {
                case 1:
                    System.out.println("Enter Your Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter Your RollNo.: ");
                    int rollNo = sc.nextInt();

                    System.out.println("Enter Your Age: ");
                    int age = sc.nextInt();

                    System.out.println("Enter Your Marks: ");
                    int marks = sc.nextInt();

                    Students std = new Students(name, rollNo, age, marks);
                    database.put(rollNo, std);

                    System.out.println("Student Added");
                    break;

                case 2:
                    System.out.println("List of Students: ");
                    for (Students i : database.values()) {
                        i.viewStudent();
                    }
                    break;

                case 3:

                    System.out.println("Enter Your rollNo.: ");
                    int roll = sc.nextInt();
                    Students data=database.get(roll);

                    if(data!=null){
                        data.viewStudent();
                    }else{
                        System.out.println("Student not found");
                    }
                    System.out.println("--------*----------*---------*----------*------");
                    break;


                case 4:
                    int totalStudent = database.size();
                    int totalMarks = 0;
                    for (Students j : database.values()) {
                        totalMarks = totalMarks + j.marks;
                    }
                    double average = (double) totalMarks / totalStudent;
                    System.out.println("Average Marks " + average);

                    break;

                case 5:
                    System.exit(0);

                    default: System.out.println("Invalid Input");

            }
        }
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
