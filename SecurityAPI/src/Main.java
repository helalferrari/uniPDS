import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        String texto = "Hello World";
        System.out.println(texto);
        System.out.println("Criptogrando...");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();
        //System.out.println("Chave: " + secretKey);
        String textoCriptografado = criptografar(texto,secretKey);
        System.out.println(textoCriptografado);

        String textoDescriptografado = decriptografar(textoCriptografado,secretKey);
        System.out.println(textoDescriptografado);
    }

    public static String criptografar(String textoOriginal, SecretKey chave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, chave);
        byte[] textoBytes = cipher.doFinal(textoOriginal.getBytes());
        return Base64.getEncoder().encodeToString(textoBytes);
    }

    public static String decriptografar(String textoCripto, SecretKey chave) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, chave);
        byte[] cryptoByte = Base64.getDecoder().decode(textoCripto.getBytes());
        byte[] textoBytes = cipher.doFinal(cryptoByte);
        return new String(textoBytes);
    }
}