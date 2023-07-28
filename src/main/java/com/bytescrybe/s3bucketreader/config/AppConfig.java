package com.bytescrybe.s3bucketreader.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class AppConfig {
    @Bean
    public S3Client s3Client(@Value("${aws.accessKeyId}") String accessKeyId,
                             @Value("${aws.secretKey}") String secretKey) {

        AwsBasicCredentials credentials = AwsBasicCredentials.create(accessKeyId, secretKey);
        return S3Client.builder()
                                .region(Region.US_EAST_1)
                                .credentialsProvider(StaticCredentialsProvider.create(credentials))
                                .build();
    }
}
