import java.util.ArrayList;
import java.util.List;

public class ArrayListDe3 {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add(100);
        l.add("200");
        l.add(300);
        l.add(400);
        l.add(500);
        l.add(600);
        System.out.println(l);

        List l2 = l.subList(3,6);   // 3,4,5 (last exclusive)
        System.out.println("l2 --> " + l2);
    }
}

//        l.set(1,"ABCD");    //  replace
//        List l2 = l.subList(3,3);   // [] return nothing
