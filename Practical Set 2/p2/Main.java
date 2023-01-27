
public class Main {
    public static void main(String[] args) {

        String plaintext = args[0];
        int key = Integer.parseInt(args[1]);

        System.out.println("Message : " + plaintext);
        System.out.println("Key : " + key);

        Secret secret = new Secret();

        String ciphertext = secret.encrypt(plaintext, key);
        System.out.println("Encrypted Text :" + ciphertext);

        String pt = secret.decrypt(ciphertext, 3);
        System.out.println("Decrypted Text : " + pt);

    }
}

class Secret {

    public String encrypt(String plaintext, int key) {
        // convert String to char[]
        char[] pt = plaintext.toCharArray();
        // create char[] with size of plaintext
        char[] ct = new char[pt.length];
        for (int i = 0; i < pt.length; i++) {
            // convert char to integer and add key to it
            int value = (int) pt[i] + key;
            // convert int to char and add in char[]
            ct[i] = (char) value;
        }
        // convert char[] to String
        return String.valueOf(ct);
    }

    public String decrypt(String ciphertext, int key) {
        char[] pt = ciphertext.toCharArray();

        char[] ct = new char[pt.length];
        for (int i = 0; i < pt.length; i++) {
            int value = (int) pt[i] - key;
            ct[i] = (char) value;
        }
        return String.valueOf(ct);
    }
}
