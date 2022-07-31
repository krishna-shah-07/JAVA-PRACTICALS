import java.util.*;
public class p1_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //taking input of string to encrypt
        System.out.print("Enter the String for Encryption: ");
        String message = new String();
        message = sc.next();
        System.out.println("Encrypted message : ");
        System.out.println(encrypt(message, 3));
        System.out.println();
        System.out.println("Decrypted message : ");
        System.out.println(decrypt(encrypt(message, 3), 3));
        sc.close();
    }
    
    //reference string
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    //encrypt the message
    public static String encrypt(String plainText, int shiftKey){
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            //replacing the letters
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
    
    //decrypt the message
    public static String decrypt(String cipherText, int shiftKey){
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
}