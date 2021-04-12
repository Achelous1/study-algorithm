import java.util.Scanner;

public class Main {

    private final static String GREATER = ">";
    private final static String LESS = "<";
    private final static String EQUAL = "==";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numA = scanner.nextInt();
        Integer numB = scanner.nextInt();
        
        System.out.println(compareTwoNumbers(numA, numB));
    }

    private static String compareTwoNumbers(Integer a, Integer b){
        return (a > b)? GREATER : (a < b)? LESS : EQUAL;
    }
}
