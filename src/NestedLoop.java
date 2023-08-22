import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        NestedLoop obj = new NestedLoop();

//        obj.nestedLoop1();
//        obj.nestedLoop2();
//        obj.nestedLoop3();
//        obj.nestedLoop4();
//        obj.nestedLoop5();
//        obj.nestedLoop6();
//        obj.nestedLoop7();
//        obj.nestedLoop8();
//        obj.nestedLoop9();
//        obj.nestedLoop10();
//        obj.nestedLoop11();
//        obj.nestedLoop12();
        obj.nestedLoop13();


    }

    private void nestedLoop13() {
        // - - - - - *  row 1 - *
        // - - - - * *    row 2 - * *
        // - - - * * *     row 3 - * * *
        // - - * * * *       row 4 - * * * *
        // - * * * * *         row 5 - * * * * *

        int row =1;
        while(row <=5) {
            int i = row;
            while (i <= 5) {
                System.out.print(" " + " ");
                i++;
            }
            int star = 1;
            while (star <= row) {
                System.out.print("*");
                star++;
                System.out.print(" ");
            }
            System.out.println();
            row++;
        }
    }

    private void nestedLoop12() {
        // 1 2 3 4 5 *  row 1 - *
        // 2 3 4 5 * *    row 2 - * *
        // 3 4 5 * * *     row 3 - * * *
        // 4 5 * * * *       row 4 - * * * *
        // 5 * * * * *         row 5 - * * * * *

        int row =1;
        while(row <=5) {
            int i = row;
            while (i <= 5) {
                System.out.print(i + " ");
                i++;
            }
            int star = 1;
            while (star <= row) {
                System.out.print("*");
                star++;
                System.out.print(" ");
            }
            System.out.println();
            row++;
        }
    }

    private void nestedLoop11() {
        // 1 2 3 4 5 * * * * * *  row 1   --> If i want 5 start , i can give a loop there             // 1 2 3 4 5 * * * * * *
        // 2 3 4 5 * * * * * *    row 2
        // 3 4 5 * * * * * *      row 3
        // 4 5 * * * * * *        row 4
        // 5 * * * * * *          row 5

        int j =1;
        while(j <=5) {
            int i = j;
            while (i <= 5) {
                System.out.print(i + " ");
                i++;
            }
            int star = 1;
            while (star <= 5) {
                System.out.print("*");
                star++;
                System.out.print(" ");
            }
            System.out.println();
            j++;
        }
    }

    private void nestedLoop10() {
        // 1 2 3 4 5   row 1
        // 2 3 4 5     row 2
        // 3 4 5       row 3
        // 4 5         row 4
        // 5           row 5

        int j =1;
        while(j <=5) {
            int i = j;
            while (i <= 5) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            j++;
        }
    }

    private void nestedLoop9() {
        // 5 4 3 2 1    row 1
        // 4 3 2 1      row 2
        // 3 2 1        row 3
        // 2 1          row 4
        // 1            row 5

        /*for(int j=5;j>=0;j--) {
            for (int i = j; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        int j =5;
        while (j >=1) {
            int i = j;
            while (i >= 1) {
                System.out.print(i + " ");
                i--;
            }
            System.out.println();
            j--;
        }

    }

    private void nestedLoop8() {
        // 5 5 5 5 5    row 1
        // 4 4 4 4      row 2
        // 3 3 3        row 3
        // 2 2          row 4
        // 1            row 5

        int row =5;
        while (row >= 1) {
            int i = 1;
            while (i <= row) {
//                System.out.print(row);
                System.out.print(row- i);
                i++;
            }
            System.out.println();
            row--;
        }
    }

    private void nestedLoop7() {
        // Output la irunthu question seyanum.

        // 5 5 5 5 5   row 1
        // 3 3 3 3 3   row 2
        // 1 1 1 1 1   row 3

        int row = 5;
        while (row >= 1) {
            int col = 1;
            while (col <= 5) {
                System.out.print(row + " ");
                col++;
            }
            System.out.println();
            row = row - 2;
        }
    }

    private void nestedLoop6() {
        // Output la irunthu question seyanum.
        // 1 2 3 4 5   cols
        // 5 5 5 5 5   row 1    --> no change, row dec by 1.
        // 4 4 4 4 4   row 2
        // 3 3 3 3 3   row 3

        int row =5;
        while (row >=3){
            int col = 1;
            while (col <= 5 ) {
                System.out.print(row);
                col++;
            }
            System.out.println();
            row--;
        }



    }

    private void nestedLoop5() {
        // Output la irunthu question seyanum.
        // 1 2 3 4 5   cols
        // 5 4 3 2 1   row 1    --> col decreasing by 1
        // 5 4 3 2 1   row 2
        // 5 4 3 2 1   row 3

        int row = 1;
        while(row <=3){
            int col = 5;
            while(col >=1) {
                System.out.print(col + " ");
                col--;
            }
            row++;
            System.out.println();
        }
    }

    private void nestedLoop4() {
        // Output la irunthu question seyanum.
        // 1 2 3 4 5    cols
        // 1 2 3 4 5    row 1 --> col increasing by 1
        // 1 2 3 4 5    row 2
        // 1 2 3 4 5    row 3

        int row = 1;
        while(row <=3){
            int col = 1;
            while(col <=5) {
                System.out.print(col + " ");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    private void nestedLoop3() {
        int row =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int maxRow = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int maxCol = sc.nextInt();

        while (row <=maxRow ){
            int cols =1;
            while (cols <=maxCol){
                System.out.print(cols+ " ");          // 1 1 1 1 1
                cols++;                            // 2 2 2 2 2
            }                                       // 3 3 3 3 3
            System.out.println();
            row++;
        }
    }

    private void nestedLoop2() {

        int row =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int maxRow = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int maxCol = sc.nextInt();

        while (row <=maxRow ){
            int cols =1;
            while (cols <=maxCol){
                System.out.print(row+ " ");          // 1 1 1 1 1
                cols++;                            // 2 2 2 2 2
            }                                       // 3 3 3 3 3
            System.out.println();
            row++;
        }
    }

    private void nestedLoop1() {

        int i = 1;
        while ( i <= 3){
            int count = 1;
            while (count <= 5) {
                System.out.print(1 + " ");      // 1 1 1 1 1
                count++;                        // 1 1 1 1 1
            }                                   // 1 1 1 1 1
            System.out.println();
            i++;
        }

    }
}
