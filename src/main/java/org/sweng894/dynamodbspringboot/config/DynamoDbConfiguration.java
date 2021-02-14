package org.sweng894.dynamodbspringboot.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDbConfiguration {
    @Bean
    public DynamoDBMapper DynamoDBMapper() {
        return new DynamoDBMapper(buildAmazonDynamoDb());
    }

    private AmazonDynamoDB buildAmazonDynamoDb() {
        return AmazonDynamoDBClientBuilder
            .standard()
            .withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(
                    "dynamodb.us-east-1.amazonaws.com",
                    "us-east-1"
                )
            )
            .withCredentials(
                new AWSStaticCredentialsProvider(
                    new BasicAWSCredentials(
                        "AKIAQNCWC4ZWWQ3QLTNK",
                        "W4b0qCf5J4ZtzohH+R/9p79LKZ4ViKsjZcXFc2W7"
                    )
                )
            )
            .build();
    }


}