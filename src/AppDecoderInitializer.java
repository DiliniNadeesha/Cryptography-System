import lk.ijse.dep.crypto.DEPCrypt;

import java.util.Scanner;

public class AppDecoderInitializer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a cipher to decode: ");
        String text = scanner.next();
        System.out.print("Enter a key: ");
        String key = scanner.next();
        System.out.println(DEPCrypt.decode(text,key));
    }

}
