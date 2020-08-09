package com.awssns;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootLauncher {

    public static void main(String[] args) {
        SpringApplication.run(BootLauncher.class, args);
    }


    @Bean
    public AmazonSNS amazonSNSClient(@Value("${aws.access-key}") String accessKey,
                                     @Value("${aws.secret-key}") String secretKey) {
        return AmazonSNSClient
                .builder()
                .withRegion(Regions.AP_SOUTH_1)
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(accessKey, secretKey)))
                .build();
    }
}
