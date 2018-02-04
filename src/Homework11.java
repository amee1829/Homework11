import java.util.Scanner;

public class Homework11 {
    static int counter = 0;

    public static void main (String [] args){
        //
        Scanner keyboard1 = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);

        int grade = 0;

        System.out.println("Input number of students: ");
        int numberOfStudents = keyboard1.nextInt();

        String [] students = new String[numberOfStudents];
        char [] letterGrades = new char[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter Student" + (i + 1) + " Name:  ");
            String studentName = keyboard2.next();
            students[i] = studentName;
            System.out.println();

            System.out.println("Enter Average Grade: ");
            int averageGrade = keyboard3.nextInt();

            // Validate averageGrade
            grade = validateGrade(averageGrade);

            System.out.println();

            char letterGrade;
            if ((grade >= 90) && (grade <= 100))
                letterGrades[i] = 'A';
            else if ((grade >= 80) && (grade <= 89))
                letterGrades[i] = 'B';
            else if ((grade >= 70) && (grade <= 79))
                letterGrades[i] = 'C';
            else if ((grade >= 60) && (grade <= 69))
                letterGrades[i] = 'D';
            else
                letterGrades[i] = 'F';
        }


        for (int x = 0; x < numberOfStudents; x++) {
            System.out.println("Student" + (x + 1) + " Name: " + students[x]);
            System.out.println("Letter Grade: " + letterGrades[x]);
            System.out.println();
        }

    }

    public static int validateGrade(int grade){
        Scanner keyboard4 = new Scanner(System.in);

        while((grade < 0) || (grade > 100)) {
            counter++;
            System.out.println("Enter a grade between 0 and 100...");
            grade = keyboard4.nextInt();
            if (counter > 2)
                System.exit(0);
        }
        return grade;
    }

}
