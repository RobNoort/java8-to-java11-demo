package java12;


public class stringDemo {

    public static void main(String[] args) {
        // indent
        System.out.println("text".indent(30));

        // toBeTransformed
        String toBeTransformed = "Base string";

        String transformed =
                toBeTransformed
                        .transform(String::toUpperCase)
                        .transform(s -> s.replace("I", "x"));

        System.out.println(String.format("transformed : %s", transformed));

    }
}
