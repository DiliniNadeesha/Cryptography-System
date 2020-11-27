import lk.ijse.dep.crypto.DEPCrypt;

import java.util.Scanner;

public class AppEncoderInitializer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to encode: ");
        String text = scanner.next();
        System.out.print("Enter a key: ");
        String key = scanner.next();
        System.out.println(DEPCrypt.encode(text,key));
    }

}
