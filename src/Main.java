import utils.Decryption;

import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        String filePath = (args.length == 0) ? "19.txt" : args[0]; // path to file with cipher text (ct)
        Decryption decryption = new Decryption(8, filePath);
        decryption.decrypt();
    }
}