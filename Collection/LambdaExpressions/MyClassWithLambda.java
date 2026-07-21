interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {
    public static void main(String[] args) {

        // Lambda expression to count words
        WordCount wc = (str) -> {
            if (str == null || str.trim().isEmpty()) {
                return 0;
            }
            return str.trim().split("\\s+").length;
        };

        String text = "Java Lambda Expressions are easy to learn";

        System.out.println("Input String: " + text);
        System.out.println("Number of Words: " + wc.count(text));
    }
}