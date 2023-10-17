import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Enter Account Number: ");
            int accountNo = sc.nextInt();
            System.out.print("Enter PIN number: ");
            int pinNo = sc.nextInt();
            System.out.print("Enter array length: ");
            try {
                int arrayLengthInput = sc.nextInt();
                int[] empDetails = new int[arrayLengthInput];

                for (int i = 0; i < empDetails.length; i++) {
                    empDetails[i] = 20000;
                }
                System.out.println(accountNo / pinNo);
            }
            catch(NegativeArraySizeException nas){
                System.out.println("Array size should be positive");
            }
        }
        catch (InputMismatchException ime){
            System.out.println("Check your account/ Pin Number");
        }
        catch (ArithmeticException ae){
            System.out.println("Check your pin No");
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("Check array length");
        }
        catch (Exception e){
            System.out.println("Incorrect");
        }
        finally {
            System.out.println("finally block");
        }
    }
}
