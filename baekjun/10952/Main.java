import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numA = 0;
        Integer numB = 0;

        while(true){
            numA = scanner.nextInt();
            numB = scanner.nextInt();
            
            if(numA == 0 && numB == 0){
                return;
            }

            System.out.println(numA + numB);
        }
    }    
}
