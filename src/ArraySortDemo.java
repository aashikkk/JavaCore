import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {
    public static void main(String[] args) {

        int[] no = {9,3,18,2,1};
        for (int i:no){
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(no);
        for (int i:no){
            System.out.print(i+ " ");
        }

        System.out.println();

        String[] st = {"P", "A", "Y"};
        for(String s:st){
            System.out.print(s + " ");
        }

        System.out.println();

        Arrays.sort(st);  // Natural ascending order
        for(String s:st){
            System.out.print(s + " ");
        }

        System.out.println();

        Arrays.sort(st,new MyComp());
        for(String s:st){
            System.out.print(s + " ");
        }
    }
}
