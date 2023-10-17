//public class PasswordException extends Exception {
//    public void verifyPassword(String pwd) throws PasswordException {
//
//        if (pwd.length() <8){
//            PasswordException pe = new PasswordException();
//            throw pe;
//        }
//        System.out.println("Strong Password");
//    }
//}

public class PasswordException extends RuntimeException {
    public void verifyPassword(String pwd) {

        if (pwd.length() <8){
            PasswordException pe = new PasswordException();
            throw pe;
        }
        System.out.println("Strong Password");
    }
}