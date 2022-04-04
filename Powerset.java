import java.util.*;

public class Powerset {
    static void getPowerset(String str, int i, String curr) {
        if (i == str.length()) {
            System.out.print(curr + ", ");
            return;
        }
        getPowerset(str, i + 1, curr + str.charAt(i));
        getPowerset(str, i + 1, curr);

    }

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int i = 0;
        String curr = "";
        getPowerset(str, i, curr);
    }
}
