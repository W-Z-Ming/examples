import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DecryptedPassword {
    public static void main(String[] args) {
        String encryptedPwd = "ODEsODcsNjksNDksNTAsNTMsMTAwLDEwMiwxMDMsNTUsNTEsNTYsNjgsMTE1LDg3LDExOCw1NCw1MSw1NSw1Nyw0OQ==";

        byte[] binaryData = Base64.getDecoder().decode(encryptedPwd);
        String[] strValue = new String(binaryData, StandardCharsets.UTF_8).split(",");
        byte[] bytesValue = new byte[strValue.length];
        for (int i = 0; i < bytesValue.length; i++) {
            bytesValue[i] = Byte.parseByte(strValue[i]);
        }

        System.out.println(new String(bytesValue, StandardCharsets.UTF_8));
    }
}
