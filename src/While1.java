import java.util.Scanner;

// How to find Custom Pattern
// 1.Starting No?
// 2.Last no?
// 3.Pattern of middle no?

public class While1 {
    public static void main(String[] args) {

        While1 obj = new While1();
//        obj.findAdditionNNumbers();
        obj.factorial();
//        obj.findOddNosAddition();
//        obj.findEvenNosAddition();
//        obj.twoPowerNosAddition();
//        obj.findCustomPattern1();
//        obj.findCustomPattern2();
//        obj.printReverseNos();
//        obj.printReverseNos2();
//        obj.printReverseNos3();
//        obj.printReverseNos4();
//        obj.noOfDigits();
//        obj.additionOfDigits();
        //Modularity
    }

    private void additionOfDigits() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        int count = 0;

        while(no>0) {
            count = count + (no%10);
            no = no/10;
        }
        System.out.println("No of digits: " + count);
    }

    private void noOfDigits() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();
        int count = 0;

        while(no>0) {
            count++;
            no = no/10;
        }
        System.out.println("No of digits: " + count);
    }

    private void printReverseNos4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        while(no>9) {
            System.out.println(no%100);          // 123456 : 56 45 34 23 12
            no = no/10;
        }
    }

    private void printReverseNos3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        while(no>0) {
            System.out.println(no%100);          // 123456 : 56 34 12
            no = no/100;
        }
    }

    private void printReverseNos2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        while(no>0) {
            System.out.println(no%10);          // 123456 : 6 4 2
            no = no/100;
        }
    }

    private void printReverseNos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        while(no>0) {
            System.out.println(no%10);      // 123456 : 6 5 4 3 2 1
            no = no/10;
        }
    }

    private void findCustomPattern2() {
        int total = 0;
        int no=1;
        int i =2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        while(no<=upper){
            total = total + no;     // 1 , 2 , 8 , 48 , 384             // *2, *4, *6, *8
            no = no * i;
            i = i + 2;
        }
        System.out.println(total);
    }

    private void findCustomPattern1() {
        int total = 0;
        int no=1;
        int i =2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        while(no<=upper){
            total = total + no;     // 1 , 2 , 6, 24, 120, 720      // *2 , *3, *4, *5
            no = no * i;
            i = i + 1;
        }
        System.out.println(total);
    }

    private void twoPowerNosAddition() {
        int total = 0;
        int no=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        while(no<=upper){
            total = total + no;     // 1 , 2 , 4 , 8 , 16 , 32 , 64 ,
            no = no * 2;
        }
        System.out.println(total);
    }

    private void findEvenNosAddition() {
        int total = 0;
        int no=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        while(no<=upper){
            total = total + no;     // 1 + 3 + 5 + 7
            no = no + 2;
        }
        System.out.println(total);
    }

    private void findOddNosAddition() {
        int total = 0;
        int no=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        while(no<=upper){
            total = total + no;     // 1 + 3 + 5 + 7
            no = no + 2;
        }
        System.out.println(total);
    }

    // Factorial
    private void factorial() {
        int total =1;
        int a = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the factorial number: ");
        int fact = sc.nextInt();

        while(a<= fact){
            total = total * a;      //
            a =a + 1;
        }
        System.out.println(total);
    }

    private void findAdditionNNumbers() {
        int total = 0;
        int no=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();
        while(no<=upper){
            total = total + no;         // 1 + 2  + 3 + 4 + 5 + 6
            no = no + 1;
        }
        System.out.println(total);
    }
}

// Modularity - Splitting our program logically into small modules  (Units)

