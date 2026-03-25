public class Program02_Constant {
    public static void main(String[] args){
        //===========================================
        //Constants - Values that CANNOT change
        //Use 'final' keyword + UPPER_SNAKE_CASE name
        //===========================================

        final double PI = 3.1415926;
        final int MAX_CLASS_SIZE = 60;
        final double PASSING_PERCENTAGE = 35.0;
        final String UNIVERSITY_NAME = "Anna University";
        System.out.println("====CONSTANTS====");
        System.out.println("PI     " + PI);
        System.out.println("Max Class Size: " + MAX_CLASS_SIZE);
        System.out.println("Passing Percentage " + PASSING_PERCENTAGE);
        System.out.println("University  " + UNIVERSITY_NAME);

        //Trying to reassign a constant = COMPILE ERROR
        //PI = 3.0

        //NAMING CONVENTIONS(Variable camel case)
        int studentAge =20;
        double semisterGpa=8.5;

        //Circle area calculation with CONSTANT PI
        System.out.println("\n====CIRCLE AREA (using PI Constant) ===");
        double radius = 7.0;
        double area = PI * radius * radius;
        System.out.println("Radius:" + radius + "cm");
        System.out.println("Area of the circle :" + area +"cm");
        System.out.printf("Area (formatted to 2 decimals): %.2f sq cm%n", area);


    }
}
