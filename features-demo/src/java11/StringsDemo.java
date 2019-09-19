package java11;

public class StringsDemo {

    public static void main(String... args) {
        System.out.println("\"\".isBlank() = " + "".isBlank());
        System.out.println("\"dog\".repeat(3) = " + "dog".repeat(3));
        System.out.println("\"  dog  \".strip() = " + "  dog  ".strip());
        System.out.println("\"  dog  \".stripTrailing() = " + "  dog  ".stripTrailing());
        System.out.println("\"  dog  \".stripLeading() = " + "  dog  ".stripLeading());

        "line1\nline2".lines()
                .forEach(System.out::println);

    }
}
