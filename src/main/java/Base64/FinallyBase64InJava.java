package Base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class FinallyBase64InJava {
    public static void main(String[] args) {

        Base64.Encoder encoder = Base64.getEncoder();
        String original = String.join(":","kimhyunjin", "zzm");

        String encoded = encoder.encodeToString(original.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(encoded);
        System.out.println(new String(decoded));

    }
}
