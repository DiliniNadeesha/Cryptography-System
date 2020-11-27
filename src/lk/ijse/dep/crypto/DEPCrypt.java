package lk.ijse.dep.crypto;

import java.util.Base64;

public class DEPCrypt {

    public static String encode(String input, String key){
        char[] chars = (input + key).toCharArray();
        String encodedString = "";
        for (int i = chars.length-1; i >=0 ; i--) {
            encodedString += chars[i];
        }
        return Base64.getEncoder().encodeToString(encodedString.getBytes());
    }

    public static String decode(String cipher, String key){
        byte[] decode = Base64.getDecoder().decode(cipher.getBytes());
        String decodedString = new String(decode);
        decodedString = new StringBuilder(decodedString).reverse().toString();
        if (!decodedString.endsWith(key)){
            throw new RuntimeException("Invalid key");
        }
        return decodedString.substring(0,decodedString.length() - key.length());
    }
}
