import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArrayDemo {
    public static void main(String[] args) {
        int i =1;

        ArrayList<Integer> al = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        while( ch=='y' || ch=='Y') {
            al.add(i);
            i++;
            ch = sc.next().charAt(0);
        }
        System.out.println(al);


        Integer a[] = new Integer[al.size()];
        a = al.toArray(a);
        for (int ab:a) {
            System.out.println(ab);
        }
    }
}
