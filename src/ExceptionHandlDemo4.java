public class ExceptionHandlDemo4 {
    public static void main(String[] args) {
        PasswordException pe = new PasswordException();
        try {
            pe.verifyPassword("Vimal");
        } catch (PasswordException e) {
            System.out.println("Too short password");
        }
    }
}

/*
* public static void main(String[] args) throws PasswordException {
        PasswordException pe = new PasswordException();
        pe.verifyPassword("Vimal");
        *
        * */