import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    /* 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder
        of two numbers , takes two numbers as input   */

/*
        System.out.print("Please enter the first number: ");
        Integer firstNumber = input.nextInt();
        System.out.print("Please enter the second number: ");
        Integer secondNumber = input.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber)); */





        /* 2.Write a Java program that takes a number as input and prints its multiplication table up to 10.*/

        /*
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        for(int i = 1; i <=10; i++) {
           int result= number *i;
            System.out.println(number + " x " + i + " = " + result); }
        */




/* 3.Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586 */

        /*
        System.out.print("Radius= ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is= " + perimeter);
        System.out.println("Area is= " + area);
        */




/* 4. Java program to find out the average of a set of integers */

      /*  System.out.println("Enter the count of numbers: ");
        int countnumbers = input.nextInt();

        double sum =0;
        for (int i = 0; i < countnumbers; i++) {
            System.out.println("Enter an integer: " );
             int number = input.nextInt();
             sum += number;
        }
        double average = sum / countnumbers;
        System.out.println("The average is: "+average); */




/* 5.Write a Java program that accepts three integers as input, adds the first two integers together,
 and then determines whether the sum is equal to the third integer.*/

        /*
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        System.out.print("Input the third number: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 ;
        boolean sumequals= true;
        if (sumequals=sum==num3 ) {
        System.out.println("The result is: " + sumequals);}
        else{
            System.out.println("The result is: " + sumequals);
        } */





/* 6.Write a Java program to reverse a word. */

       /* System.out.println("Please enter a word to reverse it:  ");
        String word = input.nextLine();
        StringBuilder reverseword = new StringBuilder(word);
        reverseword.reverse();
        System.out.print("Reverse word: " + reverseword.toString()); */






        /*7.Java program to check whether the given number is even or odd. */

       /*  System.out.println("Please enter a number:  ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else{
            System.out.println("The number is odd");
        } */





/* 8 - Java program to convert the temperature in Centigrade to Fahrenheit */

      /*  System.out.println("Enter the temperature in Centigrade: ");
        double temperature = input.nextDouble();
        double fahrenheit = temperature * 1.8 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit); */






/* 9.Write a Java program that takes a string and a number from the user,
then prints the character in the given index.*/


       /* System.out.println("Please enter a string: ");
        String str = input.nextLine();
        System.out.println("Please enter a number: ");
        int index = input.nextInt();
        System.out.println(str.substring(index, index+1)); */






/*10. Write a Java program to print the area and perimeter of a rectangle. */

        /*
        System.out.print("Width= ");
        double width = input.nextDouble();
        System.out.print("Height= ");
        double height= input.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " +width + "*" + height + " = " + area);
        System.out.println("Perimeter is "+"2*(" +width+ "+" + height + ") = " + perimeter) ;
*/




/*11.Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39 */


/*
        System.out.print("Input first integer:");
        int first = input.nextInt();
        System.out.print("Input second integer:");
        int second = input.nextInt();

        if (first != second && first <= second) {
            System.out.println(first + " !=" + second);
            System.out.println(first + " <= " + second);

    }
        if (first < second){
            System.out.println(first + " < " + second);
            } */





 /* 12.Write a Java program to convert seconds to hours, minutes and seconds.
 Sample Output:
  Input seconds: 86399
  23:59:59 */

        /*  System.out.println("Input seconds: ");
        int seconds = input.nextInt();
        System.out.println("Convert seconds to hours: " );
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;
        System.out.print(hours+":" + minutes+":" + second );  */




/* 13. Write a Java program that accepts four integers from the user and prints equal
if all four are equal, and not equal otherwise.
Sample Output:
Input first number: 25 Input second number: 37 Input third number: 45
Input fourth number: 23 Numbers are not equal!*/

        /*
        System.out.print("Input first number:");
        int firstdnumber = input.nextInt();
        System.out.print("Input second number:");
        int secondnumber = input.nextInt();
        System.out.print("Input third number:");
        int thirdnumber = input.nextInt();
        System.out.print("Input fourth number:");
        int fourthnumber = input.nextInt();

        boolean allequallfour= true ;

        if (fourthnumber != secondnumber){
            allequallfour= false;
        }
        else if (firstdnumber != thirdnumber){
            allequallfour= false;
        }
        else if (firstdnumber != thirdnumber){
            allequallfour= false;
        }

        if(allequallfour){
            System.out.println("Numbers are Equal!");
        } else {
            System.out.println("Numbers are Not equal!");
        }
*/




/* 14. Write a Java program that reads an integer and check whether it is
negative, zero, or positive.
Test Data
Input a number: 7
Expected Output :
Number is positive */

    /*    int number=0;
        boolean validinput =false;

        do{
            System.out.print("Please enter a number: ");
            number = input.nextInt();



            if (number > 0) {
                System.out.println("Number is positive");
            }
            else if (number < 0) {

                System.out.println("Number is negative");}
            else {
                System.out.println("Number is zero");;
            }
             break;
        }
        while(!validinput);   */




 /* 15.Write a program to enter the numbers till the user wants and at the end it should display
  the count of positive, negative and zeros entered
  (End loop use -1 , Don’t count -1). */

  /* int positivecount=0;
  int negativecount=0;
  int zerocount=0;
  int number=0;

  do {
      number = input.nextInt();

      if (number > 0) {
          positivecount++;
      }
      else if (number < 0 && number != -1) {
          negativecount++;
      } else if (number == 0) {
          zerocount++;
      }


  }while(number!= -1);
        System.out.println(positivecount + " Positives");
        System.out.println(zerocount + " Zero");
        System.out.println(negativecount + " Negatives"); */






/* 16.Write a program that prompts the user to input an integer and then outputs
 the number with the digits reversed.
 For example, if the input is 12345, the output should be 54321.*/

 /* int num;
 int temp;
        System.out.println("Please enter an integer: ");
         num = input.nextInt();

         if (num<0){
             num=-num;
         }
         while (num>0){
             temp = num%10;

             num=num/10;

             System.out.print(temp);
         } */





/*17 - Write a program to enter the numbers till the user wants and at the end
 the program should display the largest and smallest numbers entered.
 enter the number : 4 enter the number : 5
 enter the number : -1 enter the number : 9
 the large number : 9 the small number : -1
 */

    /*    int smallest =0;
        int largest=0 ;
        int num=0;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <number ; i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num < smallest) {
                smallest = num;
            }

            if (num > largest) {
                largest = num;
            }

        }
        System.out.println("The largest number is: " + largest);
        System.out.println("The Smallest number is: " + smallest); */







/*18 - Determine and print the number of times the character ‘a’ appears in the input
entered by the user.
Enter String: Java bootcamp
Output: Number of a's: 3 */

       /* System.out.println("Please enter a String: ");
        String inputstring = input.nextLine();

        int counter=0;

        for(int i=0 ; i < inputstring.length() ;i++){
            if(inputstring.charAt(i)=='a'){
                counter++;
            }
        }
        System.out.println("Number of a's: " + counter); */

















    }
}