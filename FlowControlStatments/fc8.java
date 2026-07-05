public class fc8 {
    public static void main(String[] args) {

        char ch = 'A';

        if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + "->" + Character.toLowerCase(ch));
    }
}