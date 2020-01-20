package java13;

public class TextBlockDemo {

    /**
     * JEP 355: Preview Feature
     */
//    @SuppressWarnings("preview")
    public static void main(String[] args) {
        String textBlock = """
                Hi
                Hello
                Yes""";

        String str = "Hi\nHello\nYes";

        System.out.println("Text Block String:\n" + textBlock);
        System.out.println("Normal String Literal:\n" + str);

        System.out.println("Text Block and String Literal equals() Comparison: " + (textBlock.equals(str)));
        System.out.println("Text Block and String Literal == Comparison: " + (textBlock == str));

        System.out.println("=".repeat(100));
        String output = String.format("""
                Name: %s
                Phone: %d
                Salary: $%.2f
                """, "Pankaj", 123456789, 2000.5555);

        System.out.println(output);

        String htmlTextBlock = """
                <html>
                <body>
                <p>Hello</p>
                </body>
                </html>""";


    }

}
