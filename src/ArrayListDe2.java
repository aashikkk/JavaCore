import java.util.ArrayList;

public class ArrayListDe2 {
    public static void main(String[] args){

        ArrayList l = new ArrayList();
        l.add(100);
        l.add("200");
        l.add(300);
        System.out.println(l);
        System.out.println(l.remove("abc"));

        ArrayList l2 = new ArrayList();
        l2.add(999);
        l2.add(888);
        l2.add(777);
        System.out.println(l2);
        l2.addAll(l);
        System.out.println(l2);
//        l2.removeAll(l);
        l2.retainAll(l);
        System.out.println(l2);
    }
}
