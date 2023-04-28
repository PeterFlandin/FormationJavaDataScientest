package ex2p3;

public class Lexception extends Exception {

     private String message;

     public Lexception(String message) {
         this.message = message;
     }

     public String getMessage() {
         return message;
     }


}
