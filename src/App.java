import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Lab DIO - Flow Control");
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            scanner.nextLine();
            printResult(firstNumber, secondNumber);
        } catch (InputMismatchException ime) {
            System.out.println("Error! Enter only numeric values.");            
        } catch (InvalidNumbersException ine) {
            System.out.println(ine.getMessage());
        } finally {
            System.out.println("The End.");
        }    
    }

    static void printResult(int firstNumber, int secondNumber) throws InvalidNumbersException {
        if (firstNumber > secondNumber) {
            throw new InvalidNumbersException("Error! The second number must be greater than the first number!");
        }
        for (int i = 1; i <= (secondNumber-firstNumber); i++) {
            System.out.println("Printing number "+i);
        }
    }
}
