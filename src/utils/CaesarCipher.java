package utils;

public class CaesarCipher {
    private final int key;

    public CaesarCipher(int key) {
        this.key = key % Constants.ALPHA_NUM;
    }

    public String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();

        for (char ch : text.toCharArray()) {
            encrypted.append(getEncryptSub(ch));
        }

        return encrypted.toString();
    }

    public String decrypt(String text) {
        StringBuilder decrypted = new StringBuilder();

        for (char ch : text.toCharArray()) {
            decrypted.append(getDecryptSub(ch));
        }

        return decrypted.toString();
    }

    private char getEncryptSub(char ch) {
        return (char)((((ch - 'a') + key) % Constants.ALPHA_NUM) + 'a');
    }

    private char getDecryptSub(char ch) { // java have problem with negative modulo
        return (char)((((ch - 'a') - key + Constants.ALPHA_NUM) % Constants.ALPHA_NUM) + 'a');
    }
}
