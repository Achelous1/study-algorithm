import java.io.*;
import java.util.*;

public class Solve {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputs = br.readLine().split(" ");
        System.out.println(Double.valueOf(inputs[0]) / Double.valueOf(inputs[1]));
    }
}
