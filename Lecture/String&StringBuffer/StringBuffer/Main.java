public class Main {
    public static void main(String args[]) {
        String message = "Welcome To Adit";

        StringBuffer stringBuffer = new StringBuffer(message);
        stringBuffer.append(" From Department of Information Technology");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.substring(3));
        System.out.println(stringBuffer.reverse());

    }
}