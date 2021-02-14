package org.sweng894.dynamodbspringboot.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "getvaccinated")
public class Appointment {

    @DynamoDBAttribute
    private String name;

    @DynamoDBHashKey(attributeName="partitionKey")
    @DynamoDBAutoGeneratedKey
    private String confirmationNumber;

    @DynamoDBRangeKey(attributeName="sortKey")
    private String email;

    @DynamoDBAttribute
    private String status;

    @DynamoDBAttribute
    private String date;
}