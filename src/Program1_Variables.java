public class Program1_Variables {
    public static void main(String[] args){
        //INTEGER-WHOLE NUMBERS
        int age = 20;
        int year =2026;
        int negativeTemp = -5; //Integer can have negative number

        //2.Double-Decimal Numbers
        double gpa = 8.5;
        double height = 5.9;
        double pi = 3.14159;

        //3.Boolean -true or false ONLY
        boolean isStudent = true;
        boolean hasJob = false;
        boolean isAbove18 = true;

        //4.CHAR --exactly ONE Character(single quotes)
        char grade='A';
        char firstInitial = 'R';
        char symbol = '@';

        //5.STRING-text(double quotes)-Not a Primitive
        String name = "Rahul";
        String college = "Tier 3 Engineering College";
        String branch = "Electronics and Communication";


        //Print All Variables
        System.out.println("=============================");
        System.out.println("    MY COMPLETE PROFILE      ");
        System.out.println("=============================");
        System.out.println("NAME: " + name );
        System.out.println("AGE: " + age);
        System.out.println("YEAR: " + year);
        System.out.println("GPA: " + gpa);
        System.out.println("HEIGHT: " + height);
        System.out.println("COLLEGE: " + college);
        System.out.println("BRANCH: " + branch);
        System.out.println("GRADE: " + grade);
        System.out.println("INITIAL: " + firstInitial);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Has Job: " + hasJob);
        System.out.println("Pi: " + pi);
    //Variable Assignment
        System.out.println("\n---Quick Math---");
        System.out.println("Before:  age = " + age);
        age=21;
        System.out.println("After: age = " + age);

    //ARITHMETIC with Variables
        System.out.println("\n---Quick Math---");
        int marks1 = 78;
        int marks2 = 82;
        int marks3 = 91;
        int total = marks1 + marks2 + marks3;
        double average = (double) total / 3;
        System.out.println("Subject1: " + marks1);
        System.out.println("Subject2: " + marks2);
        System.out.println("Subject3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
