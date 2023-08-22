import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
       // Finding last number of the input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = sc.nextInt();

        while(no>0) {
            System.out.println(no%10);
            no = no/10;
        }


//        Then why we putting again and again the same lines, here we can use loops

//        This is the waste of memory when we use reference variable like this, it sitting idle after one use
//        So we can use `no` variable again


//        int no2 = no/10;
//        System.out.println(no2%10);
//
//        int no3 = no2/10;
//        System.out.println(no3%10);
//
//        int no4 = no3/10;
//        System.out.println(no4%10);
//
//        int no5 = no4/10;
//        System.out.println(no5%10);
    }
}
