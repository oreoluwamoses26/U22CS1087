import java.util.Scanner;
class JavaCalculator{
    public static void main(String[] args){
        double num1, num2, result;
        char operator;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");

        num2 = scanner.nextDouble();
        System.out.print("Enter operator: ");

        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
            result = num1 + num2;
            System.out.print(result);
                break;

                case '-':
            result = num1 - num2;
            System.out.print(result);
                break;

                case '*':
            result = num1 * num2;
            System.out.print(result);
                break;

                case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.print(result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            
                break;
        
            default:
                break;
        }

        }
    }