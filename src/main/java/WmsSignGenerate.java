import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import java.nio.charset.StandardCharsets;

public class WmsSignGenerate {
    public static void main(String[] args) {
        String message = "{\"data\":{\"header\":[{\"userId\":\"C0989\",\"postCode\":\"JH\",\"workStarttime\":\"2021-09-20 08:30:00\"}]}}";
        String appSecret = "123456";

        message = appSecret + message + appSecret;
        String md5 = DigestUtils.md5Hex(message.getBytes(StandardCharsets.UTF_8));
        String sign = Base64.encodeBase64String(md5.getBytes(StandardCharsets.UTF_8));
        sign = sign.toUpperCase();
        System.out.println(sign);
    }
}
