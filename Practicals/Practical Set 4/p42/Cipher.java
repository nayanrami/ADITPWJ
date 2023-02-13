public abstract class CipherDemo {
    private String plaintext;
    private int key;

    CipherDemo(String plaintext, int key) {
        this.plaintext = plaintext;
        this.key = key;
    }

    abstract String enryption();

    abstract String decryption();
}
