

public class Program03_Operators {
    public static void main(String[] args){
        int a = 15;
        int b = 4;

        System.out.println("=== ARITHMETIC OPERATORS ===");
        System.out.println("a = " + a  +  " , b = " + b);
        System.out.println();
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a*b));
        System.out.println("Division = " + (a/b));
        System.out.println("Modulo = " + (a%b));
        System.out.println("Division(double) = " +(double)a/b);

        //THE INTEGER DIVISION TRAP
        System.out.println();
        int students = 7;
        int groups = 2;

        //Wrong way :both int -> trunacate Decimal
        double wrong = students/groups;
        System.out.println("Wrong way :" + wrong);
        //prints 3.0 not 3.5 Because 7/5 (integer) ->stored as 3.0

        //RIGHT WAY : Cast one to double BEFORE dividing
        double right = (double) students/groups;
        System.out.println("Correct way : " + right);

        //Modulo in practice
        System.out.println();
        System.out.println("/n=== Modulo Operator in Practice==");
        int number =17;
        System.out.println("Is " + number + "even ?" + (number % 2 == 0 ));//false
        System.out.println("Is " + number + "odd ?" + (number % 2 != 0));//true

        int total = 157;
        int perGroup = 10;
        int fullGroups = total / perGroup;
        int leftOver = total % perGroup;
        System.out.println("\n " + total + "students in groups of " + perGroup + ":");
        System.out.println("Full groups :" + fullGroups);
        System.out.println("Leftover :" + leftOver);

        //COMPOUND ASSIGNMENT OPERATORS
        System.out.println("/n ==COMPOUND OPERATORS==");
        int score = 100;
        System.out.println("Start: score = " + score);
        score += 15;
        System.out.println(score);
        score -= 8;
        System.out.println(score);
        score /=3;
        System.out.println(score);
        score *=2;
        System.out.println(score);
        score %=50;
        System.out.println(score);

        //INCREMENT AND DECREMENT
        System.out.println("\n === Increment / Decrement===");
        int counter = 10;
        System.out.println("Counter starts at : " + counter );
        counter++;
        System.out.println("Counter++ Gives: " + counter);
        counter--;
        System.out.println("Counter-- Gives: " + counter);

        //Post Increment VS Pre Increment
        int x = 5;
        System.out.println("\nPost-increment: prints " + x++ + " Then increments");
        System.out.println("After Post-increment: " + x);

        int y = 5;
        System.out.println("\nPre-increment(++y): increment then Prints " + ++y);
        System.out.println("After Pre-increment: " + y);


    }
}
