class Main {
    public static void main(String[] args) {
        String message = "Welcome To Adit";

        char[] message2 = message.toCharArray();
        char[] message3 = new char[message.length()];

        for (int i = 0; i < message2.length; i++) {
            char data;
            if (Character.isUpperCase(message2[i])) {
                data = Character.toLowerCase(message2[i]);
            } else {
                data = Character.toUpperCase(message2[i]);
            }
            message3[i] = data;
        }

        String newmsg = String.valueOf(message3);

        StringBuffer sb = new StringBuffer(newmsg);
        sb.reverse();
        System.out.println(sb);

    }
}