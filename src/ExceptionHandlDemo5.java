public class ExceptionHandlDemo5 {
    public static void main(String[] args) {
        ExceptionHandlDemo5 ed5 = new ExceptionHandlDemo5();
        try {
            ed5.m1();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void m1() {
        m2();
    }

    private void m2() {
        m3();
        System.out.println(10/0);
    }

    private void m3() {
    }
}

/*
* java.lang.ArithmeticException: / by zero
	at ExceptionHandlDemo5.m2(ExceptionHandlDemo5.java:18)
	at ExceptionHandlDemo5.m1(ExceptionHandlDemo5.java:13)
	at ExceptionHandlDemo5.main(ExceptionHandlDemo5.java:5)
	*
	* We can easily trace out the error
* */