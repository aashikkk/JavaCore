import java.util.Scanner;

public class ExceptionHandlDemo {
    public static void main(String[] args) {
        ExceptionHandlDemo ed = new ExceptionHandlDemo();
        ed.divide();
//        ed.add();
    }

    private void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition");
        System.out.print("Enter the number 1: ");
        int no1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int no2 = sc.nextInt();

        int result = no1+no2;
        System.out.println("Addition is "+result);
    }

    private void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Division");
        try {
            System.out.print("Enter the number 1: ");   // InputMismatchException
            int no1 = sc.nextInt();
            System.out.print("Enter the number 2: ");
            int no2 = sc.nextInt();
            int result = no1/no2;
            System.out.println("Divide is "+result);
        }
        catch (Exception ae){
            System.out.println("Enter the correct value");  // Arithmetic Exception
            divide();
        }
        add();
    }
}

// If I don't know the exception, can simply give catch(Exception e)
// Arithmetic Exception
// InputMismatchException

/*
* add()
* divide()
* main
*
* Stack
* */
