package com.yupi.usercenter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@SpringBootTest
class UserCenterApplicationTests {

    @Test
    void testDigest() {
        String newPassword = DigestUtils.md5DigestAsHex(("ancd" + "mypassword").getBytes());
        System.out.println(newPassword);
    }

    @Test
    void contextLoads() {

    }

}
