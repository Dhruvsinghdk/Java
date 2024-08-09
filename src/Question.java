// WAP to accept a 10digit number from a user as a string and print all even digit of that number



public class Question {
    public static void main(String[] args) {
       String a = "12345678910";

       for (int i = 0; i < a.length(); i++) {
            char digit = a.charAt(i);
            int n = (int) digit;
           if(n%2 == 0){
               System.out.println(digit);
           }
        }
    }
}
