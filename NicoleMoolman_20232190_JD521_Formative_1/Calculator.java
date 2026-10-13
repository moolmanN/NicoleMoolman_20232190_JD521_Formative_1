import java.util.InputMismatchException; //importing MismatchException for when the user inputs a value  invalid for the exception type 
import java.util.Scanner; // importing scanner for user input 

class Calculator { // creating class to perform operation

public int add(int num1, int num2) { // method to add two numbers 
    return num1 + num2; 
}

public int subtract (int num1, int num2) { //method to subtract two numbers 
    return num1 - num2;
} 

public int multiply(int num1, int num2){ // method to multiply two numbers 
    return num1 * num2; 
}

public double divide (int num1, int num2){ //method to divide two numbers greater then '0'
    if(num1 == 0) {
        throw new ArithmeticException("Cant divide by zero '0', try again!."); //prevent division by '0' and display message 
    }
    return (double) num1 / num2; 
        }
}

class mainCalculator { //creating class containing the main method 
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in); //creating scanner object for user input 
        Calculator calculator = new Calculator(); //creating a Calculator object 

        try{ 
            System.out.print("Enter 1st Number: "); //getting user input
            int num1 = scanner.nextInt(); 
            
            System.out.print("Select an operator (+ - * /): "); // getting user input 
            char operation = scanner.next().charAt(0);

            System.out.print("Enter 2nd Number: ");//getting user input 
            int num2 = scanner.nextInt(); 

            switch(operation){ //getting output operation based on user input 
                case '+': 
                        System.out.print("Result: " + calculator.add(num1, num2)); //adding two numbers based on user input 
                        break; 
                case '-': 
                        System.out.print("Result: " + calculator.subtract(num1, num2));//subtracting two numbers based on user input 
                        break; 
                case '*': 
                        System.out.print("Result: " + calculator.multiply(num1, num2));// multiplying two numbers based on user input 
                        break;    
                case '/': 
                        System.out.print("Result: "+ calculator.divide(num1, num2));// dividing two numbers based on user input 
                        break; 
                    default: 
                        System.out.print("Invaild. Please try using one of the following operators: + - * /"); //display message 
            

            }

        } catch (InputMismatchException e){
            System.out.print("Invalid. Please enter valid numeric value"); //importing  ArithmeticException to catch if user input is not a number
        }catch (ArithmeticException e ){ //importing ArithmeticException to pick up if theres been division by zero
            System.out.print(e.getMessage()); //displaying message. 
            scanner.close();
        }
        }
        }

        
    
    



