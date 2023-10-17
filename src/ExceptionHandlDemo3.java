public class ExceptionHandlDemo3 {
    public static void main(String[] args) throws Exception {
        ExceptionHandlDemo3 ed = new ExceptionHandlDemo3();
        ed.display();

    }

    private void display() throws Exception {
        ExceptionHandlDemo ed2 = new ExceptionHandlDemo();
        ed2.divide();

//        try {
//            ed2.divide();
//        }
//        catch (Exception e){
//            System.out.println("Give only numbers");
//        }
    }
}
/*
* Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at ExceptionHandlDemo.divide(ExceptionHandlDemo.java:43)
	at ExceptionHandlDemo3.main(ExceptionHandlDemo3.java:4)

* Exception starting from 4th line when we use throws.
* Method caller should pass the exception.
* */