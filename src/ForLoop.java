public class ForLoop {
    public static void main(String[] args) {
        ForLoop obj = new ForLoop();
//        obj.forLoop1();
//        obj.forNestedLoop2();
//        obj.forNestedLoop3();
//        obj.forNestedLoop4();
//        obj.forNestedLoop5();
//        obj.forNestedLoop6();
//        obj.forNestedLoop7();
        obj.forNestedLoop8();
    }

    private void forNestedLoop8() {
        for (int j = 1; j<=5; j++) {
            for (int i = 1; i <j; i++) {
                System.out.print(" " + " ");
            }
            for (int star = 5; star >= j; star--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void forNestedLoop7() {
        for (int j = 1; j<=5; j++) {
            for (int i = 1; i <j; i++) {
                System.out.print(j + " ");
            }
            for (int star = 5; star >= j; star--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void forNestedLoop6() {
//        1 * * * * *
//        2 2 * * * *
//        3 3 3 * * *
//        4 4 4 4 * *
//        5 5 5 5 5 *

        for (int j = 1; j<=5; j++) {
            for (int i = 1; i <=j; i++) {
                System.out.print(j + " ");
            }
            for (int star = 5; star >= j; star--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    private void forNestedLoop5() {
//        1
//        3 5
//        7 9 11
//        13 15 17 19

        int num = 1;
        for (int j=1; j<=4; j++) {
            for(int i = 1; i <=j;i++) {
                System.out.print(num + " ");
                num+=2;
            }
            System.out.println();
        }
    }

    private void forNestedLoop4() {

//        1                             // We will try to make starts with that format
//        2 3
//        4 5 6
//        7 8 9 10


        int num = 1;
        for (int j=1; j<=4; j++) {
            for(int i = 1; i <=j;i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
//        int row = 1; int i = 1; int j = 1;
//        for (int k=1; k<=4; k++) {
//            for (int col= row; col <= j; col++) {
//                System.out.print(col);
//            }
//            System.out.println();
//            row+=i;
//            i++;
//            j+=i;                   // This is complex
    }

    private void forNestedLoop3() {
//        1
//        2 3
//        3 4 5
//        4 5 6 7
//        5 6 7 8 9
//
        int max = 1;
        for (int i = 1; i <=5; i++) {
            for (int col = i; col <= max; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
            max+=2;
        }
    }

    private void forNestedLoop2() {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for (int row = 1; row <=5; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    private void forLoop1() {
        // 1            row 5
        // 2 2          row 4
        // 3 3 3        row 3
        // 4 4 4 4      row 2
        // 5 5 5 5 5    row 1


        for (int row = 1; row <=5; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
