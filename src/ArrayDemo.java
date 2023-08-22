public class ArrayDemo {
    public static void main(String[] args) {

        int[] marks = {80, 90, 100};
//        System.out.println(marks);  //[I@3fee733d -- Hashcode
        System.out.println(marks.length); // 3
        System.out.println(marks[0]); // print one value

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
