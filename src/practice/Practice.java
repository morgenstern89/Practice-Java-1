package practice;
import java.util.Scanner;

public class Practice {


    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quiz score");
        int quiz = scan.nextInt();
        System.out.println("Enter mid-term score");
        int midTerm = scan.nextInt();
        System.out.println("Enter final score");
        int finalScore = scan.nextInt();

        double average = (quiz + midTerm + finalScore)/3;
        if (average>=90){
            System.out.println("Your grade is A");
        } else if(average>=70 && average <90){
            System.out.println("Your grade is B");
        } else if (average>=50 && average <70){
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F");
        }

    }

}

          /*
          1. Write Java program to allow the user to input two integer values and then the program print
          the results of subtracting, adding, multiplying and dividing among the two values.

        System.out.println("Enter first number.");
        int a = scan.nextInt();
        System.out.println("Enter second number.");
        int b = scan.nextInt();

        System.out.println("a-b = " +(a-b));
        System.out.println("a+b = " +(a+b));
        System.out.println("a*b = " +(a*b));
        System.out.println("a/b = " +(a/b));


         2. Write Java program to allow users to input radius and then the program will calculate
         the area of the circle.

        public static double areaOfCircle(int r){
        return r*r*Math.PI;
        public static void main(String[]args){
        Scanner scan = new Scanner(System.in);//scanning within a system
        System.out.println("Enter radius.");
        int r = scan.nextInt();
        System.out.println(areaOfCircle(r));



        3. Write Java program to allot the user to input two float values and then the program
    adds the two values together. The result will be assigned to the first variable.

        public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter value one.");
        float a = scan.nextInt();
        System.out.println("Enter value two.");
        float b = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        b=a+b;
        System.out.println(b);


        4. Write Java program to allow the user to input his/her age.
    Then the program will show if the person is eligible to vote. A person who is eligible to vote
    must be older than or equal to 18 years old.

        public static void voting(int a){
        if(a<18 && a>0){
            System.out.println("Not voting");
        } else if(a>=18){
            System.out.println("You are voting");
        }else{
            System.out.println("Invalid age");
        }
    }
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter age.");
        int a = scan.nextInt();
        voting(a);


        5. Is number even

        public static void isEven(int a){
        if(a%2==0){
            System.out.println("Even number.");
        }else{
            System.out.println("Not even");
        }
    }

    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter number.");
        int a = scan.nextInt();
        isEven(a);


        6. Is number positive

         public static void isPositive(int a){
        if(a>=0){
            System.out.println("Positive number.");
        }else{
            System.out.println("Not positive");
        }
    }

    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter number.");
        int a = scan.nextInt();
        isPositive(a);


        7. Input 3 numbers. Determine which one is greater.

        public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers.");

        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        System.out.println("Enter third number");
        int c = scan.nextInt();

        int max = a;
        if (max<b){
            max = b;
        } else if(max<c){
            max=c;
        }
        if(max == a){
            System.out.println("a is the greatest");
        }else if(max == b){
            System.out.println("b is the greatest");
        } else{
            System.out.println("c is the greatest");
        }


        8. Write a java program that determines a student's grade.
            a. The program will read three types of scores(quiz, mid-term, and final scores) and
            determine the grade based on the following rules:
            b. -if the average score >=90%=>grade=A
            c. -if the average score >=70% and <90%=>grade=B
            d. -if the average score >=50% and <70%=>grade=C
            e. -if the average score <50% =>grade=F
            f. See the example output below:
            g. Quiz score:80
            h. Mid-term score:68
            i. Final score:90
            j. Your grade is B.

         */


