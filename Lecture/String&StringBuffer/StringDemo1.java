public class StringDemo1 {

    public static void main(String[] args) {
        String message = "Hello How Are You";

        System.out.println("Length of String Message : " + message.length());
        System.out.println("\nString Tokenization :");
        String data[] = message.split(" ");
        for (String token : data) {
            System.out.println("Token : " + token);
        }

        message = message.replace("H", "B");
        System.out.println("\nReplace H By B : " + message);

        System.out.println("Convert Message To Upper Case: " + message.toUpperCase());
        System.out.println("Convert Message To Lower Case: " + message.toLowerCase());

        if (message.contains("b")) {
            System.out.println("Message Containt 'b' ");
        }
    }

}
