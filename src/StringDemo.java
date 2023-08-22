public class StringDemo {
    public static void main(String[] args) {

        String s  = new String();
        System.out.println("Hashcode of s " + s);

        StringDemo sd = new StringDemo();
        System.out.println("Hashcode of ds " +sd);
        // StringDemo@5acf9800

        // sd --> StringDemo
        // Every child obejct is an object of parent class
        // An object of one class acting as another class object.

        // Here sd is an object of StringDemo and Object class....
        // Object class is parent class of all classes.

//        What is happening here??
//        When we call s obj of String class there is no Hashcode. but
//        When we use sd obj of StringDemo class there is "package name + class + hashCode"

//        Why this??
//        Object Class is parent class of all Classes. There is a method called toString(). It will automatically call
//        toString() when we write println();

//        public String toString(){
//          return "package name + class +"@"+ hashCode(hd)"
//        }

//        But you can ask we also call println in String class right?
//        Yes, valid question.
//        Because String class override the toString() method THERE. That's the Special attribute of String class.

//        Ex: When we call through String class
//        public String toString(){
//          return ""
//        }

        /*
        * Print Stream
        *
        * println(Object o){
        *   return o.toString();
        * }
        * */

//        Kind of thing happening
//
//
    }
}
