class Cipher {
    String plainText;
    int key;

    public Cipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }

    // Abstract methods for encryption and decryption
    abstract String Encryption();
    abstract String Decryption();
}

class Substitution_Cipher extends Cipher {
    public Substitution_Cipher(String plainText, int key) {
        super(plainText, key);
    }

    @Override
    String Encryption() {
        char[] plainTextChars = plainText.toLowerCase().toCharArray();
        char[] cipherTextChars = new char[plainTextChars.length];

        for (int i = 0; i < plainTextChars.length; i++) {
            char ch = plainTextChars[i];
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                cipherTextChars[i] = "qazwsxedcrfvtgbyhnujmikolp".charAt(index);
            } else {
                cipherTextChars[i] = ch;
            }
        }

        return new String(cipherTextChars);
    }

    @Override
    String Decryption() {
        char[] cipherTextChars = plainText.toLowerCase().toCharArray();
        char[] plainTextChars = new char[cipherTextChars.length];

        for (int i = 0; i < cipherTextChars.length; i++) {
            char ch = cipherTextChars[i];
            if (ch >= 'a' && ch <= 'z') {
                int index = "qazwsxedcrfvtgbyhnujmikolp".indexOf(ch);
                plainTextChars[i] = (char) ('a' + index);
            } else {
                plainTextChars[i] = ch;
            }
        }

        return new String(plainTextChars);
    }
}

class Caesar_Cipher extends Cipher {
    public Caesar_Cipher(String plainText, int key) {
        super(plainText, key);
    }

    @Override
    String Encryption() {
        char[] plainTextChars = plainText.toCharArray();
        char[] cipherTextChars = new char[plainTextChars.length];

        for (int i = 0; i < plainTextChars.length; i++) {
            char ch = plainTextChars[i];
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                cipherTextChars[i] = (char) ((ch - base + key) % 26 + base);
            } else {
                cipherTextChars[i] = ch;
            }
        }

        return new String(cipherTextChars);
    }

    @Override
    String Decryption() {
        // Decryption in Caesar Cipher is the same as encryption with a negative key
        return new Caesar_Cipher(plainText, 26 - key).Encryption();
    }
}

public class Main {
    public static void main(String[] args) {
        String text = "gcet";
        int key = 3;

        Cipher substitutionCipher = new Substitution_Cipher(text, key);
        System.out.println("Substitution Cipher Encryption: " + substitutionCipher.Encryption());
        System.out.println("Substitution Cipher Decryption: " + substitutionCipher.Decryption());

        Cipher caesarCipher = new Caesar_Cipher(text, key);
        System.out.println("Caesar Cipher Encryption: " + caesarCipher.Encryption());
        System.out.println("Caesar Cipher Decryption: " + caesarCipher.Decryption());
    }
}
