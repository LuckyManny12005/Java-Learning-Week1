public class Program04_TypeCasting {
    public static void main(String[] args) {

        //IMPLICIT CASTING(Smaller type --> Larger type Automatic)
        //Byte->Short->Int->long->float->double
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);

        long myLong = myInt;
        System.out.println("myLong: " + myLong);

        //EXPLICIT CASTING -- larger type --> smaller type (manual, risk of data loss)


        double price = 99.99;
        int priceInt = (int) price;
        System.out.println("double: " + price);
        System.out.println("Int: " + priceInt + " <- trunacted decimal");

        double temp = -7.8;
        int tempInt = (int) temp;
        System.out.println("double: " + temp);
        System.out.println("Int " + tempInt + " <- Truncated temperature");

        //THE CRITICAL AVERAGE TRAP(most common in leetcode)
        System.out.println("=== THE AVERAGE TRAP===");
        int totalMarks = 251;
        int subjects = 3;
         //Trap Integer / Integer = Integer(decimal lost before assignment)
        double wrongAverage = totalMarks / subjects;
        System.out.println("Wrong: " + wrongAverage);

        //CORRECT: cast numerator to Double
        double rightAverage = (double) totalMarks / subjects;
        System.out.println("RIGHT: " + rightAverage);
        //PRINTS = 83.0

        //STRING:- Number Conversion
        String ageStr = "20";
        String gpaStr = "8.75";
        String priceStr = "1499.99";

        int age = Integer.parseInt(ageStr);
        double gpa = Double.parseDouble(gpaStr);
        double itemPrice = Double.parseDouble(priceStr);

        System.out.println("\"20\" as int: " + age);
        System.out.println("\"8.75\" as double" + gpa);
        System.out.println("\"1499.9\" as double " + itemPrice);

        //Number to STRING
        int year = 2026;
        String yearStr = String.valueOf(year);

        System.out.println("int 2026 as String: \"" + yearStr + "\"" );




    }
}
