package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {
        String prefix = "Hello";

        String name = "John Doe";

        String message = prefix + ", " + name + "!";

        System.out.println(message);

        message = message + 444;

        System.out.println(message);

        boolean b = message.equals("Hello, John Doe!");
        System.out.println(b);

        boolean c = message.equals("Hello, John Doe!444");
        System.out.println(c);

        String e = "Abcde";
        System.out.println(e.length());
        System.out.println(e.charAt(0) + ", " + e.charAt(2));
        System.out.println(e.substring(0,2));
    }
}
