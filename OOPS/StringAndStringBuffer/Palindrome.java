import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The given String is a Palindrome");
        } else {
            System.out.println("The given String is not a Palindrome");
        }

        sc.close();
    }
}