import java.util.Scanner;

public class CombineStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        StringBuffer result = new StringBuffer();

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        if (a.length() > b.length()) {
            result.append(a.substring(min));
        } else if (b.length() > a.length()) {
            result.append(b.substring(min));
        }

        System.out.println(result);

        sc.close();
    }
}
