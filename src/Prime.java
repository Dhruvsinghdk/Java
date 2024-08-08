
public class Prime {
    int prime ;

    public void isprime(){
        int number = 22;
        int count = 0;

        for (int i = 0; i < number; i++) {
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not a prime");
        }
    }
}
