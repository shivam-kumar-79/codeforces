import java.util.*;

public class B200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        // Print average with high precision to satisfy error constraints
        System.out.printf("%.10f\n", sum / n);

        sc.close();
    }
}
