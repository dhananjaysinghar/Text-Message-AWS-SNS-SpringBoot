# Text-Message-AWS-SNS-SpringBoot

### Amazon Simple Notification Service is a notification service provided as part of Amazon Web Services. It provides user to send text and email messages. 

Get Request
~~~
curl -X GET "http://localhost:8080/message/text?to=9040010697&text=Hello%20Dhananjaya" -H "accept: */*"
~~~

### Dependencies: 

~~~
        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-java-sdk-sns</artifactId>
        </dependency>
        
        
        <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.amazonaws</groupId>
                <artifactId>aws-java-sdk-bom</artifactId>
                <version>1.11.133</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
~~~

