import java.util.ArrayList;
import java.util.List;

public class ArrayListDe {
    public static void main(String[] args) {

        ArrayListDe abc = new ArrayListDe();
        List l = new ArrayList();
        // Collections of objects - Heterogeneous

        l.add(10);      // int --> Integer
        l.add(20);
        l.add(30);
        l.add(332);
        l.add(1);
        l.add("Ramkumar");
        l.add(true);    // boolean --> Boolean
        l.add(1.2f);    // float --> Float
//        l.add(abc); // We can even object of the class. but need to convert the hashcode using toString()
        System.out.println(l.get(3));
        l.add(3, "veera");
        l.add("Ramkumar");

        System.out.println(l.get(3));
        System.out.println(l);
        System.out.println("Ramkumar first positon is " + l.indexOf("Ramkumar"));
        System.out.println("Ramkuamr last position is " +l.lastIndexOf("Ramkumar"));

        System.out.println(l.remove(0));
        System.out.println(l);
        System.out.println(l.remove("Ramkumar"));
        System.out.println(l);

//        System.out.println(l.indexOf(true));
//        System.out.println(l);
//        System.out.println(l.size());
//        System.out.println(l.contains(100));

/*        ArrayList l2 = new ArrayList();
        System.out.println("l2 is empty? " + l2.isEmpty());
        System.out.println(l2);
        l2.add(111);
        l2.add(222);
        l2.add("ABC");
        System.out.println("l2 is empty? " + l2.isEmpty());


//        l2.addAll(l);
        l2.addAll(0,l);
        System.out.println(l2);
        l2.clear();
        System.out.println(l2);
    */
    }
}

// Primitive data type kum Collection kum no relation.
// If add inside List, it is Wrapper Class object.