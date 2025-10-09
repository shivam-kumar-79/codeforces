import java.util.*;

public class B1650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int h = sc.nextInt();
            int a = sc.nextInt();

            int ans = (h / a) + (h % a);

            int x = h - (h % a) - 1;
            if (x >= l) {
                ans = Math.max(ans, (x / a) + (x % a));
            }

            System.out.println(ans);
        }
        sc.close();
    }
}