import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class JoinNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the names:");

        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");

        names.forEach(name -> sj.add(name));

        System.out.println(sj);

        sc.close();
    }
}