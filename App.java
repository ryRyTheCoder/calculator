import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in); 

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram=true) {
            double num1 = getDouble("Enter a double:");
            double num2 = getDouble("Enter another double:");

            String choice = getString ("Do you want to add, subtract, multiply or divide?");
           if (choice.equals("add")){
            System.out.println(Calculator.add(num1, num2));
           }
           if (choice.equals("subtract")){
            System.out.println(Calculator.subtract(num1, num2));
           }
           if (choice.equals("multiply")){
            System.out.println(Calculator.multiply(num1, num2));
           }
           if (choice.equals("divide")){
            System.out.println(Calculator.divide(num1, num2));
           }
           else{
            continueProgram = true;
           }
            String result = getString("Do you want to continue? (yes/no)");
            if (resuwlt.equals("yes")) {
                continueProgram = true;
            } else {
                System.out.println("Goodbye");
                continueProgram = false;
            }
        }
    }
    private static String getString(String prompt) {
        System.out.println(prompt);
        return inputScanner.next();
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }
}
