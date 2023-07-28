package com.bytescrybe.s3bucketreader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class S3BucketReaderApplicationTests {
    @Test
    void contextLoads(ApplicationContext applicationContext) {
        Assertions.assertNotNull(applicationContext);
    }
}
