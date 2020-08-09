# Text-Message-AWS-SNS-SpringBoot

### Amazon Simple Notification Service is a notification service provided as part of Amazon Web Services. It provides user to send text and email messages. 

Get Request
~~~
curl -X GET "http://localhost:8080/message/text?to=9040010697&text=Hello%20Dhananjaya" -H "accept: */*"
~~~

### Dependencies: 

~~~
        <aws-java-sdk-version>1.11.133</aws-java-sdk-version>
 
 
        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-java-sdk</artifactId>
            <version>${aws-java-sdk-version}</version>
        </dependency>

        <dependency>
            <groupId>com.amazonaws</groupId>
            <artifactId>aws-java-sdk-sns</artifactId>
        </dependency>
        
        
        <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.amazonaws</groupId>
                <artifactId>aws-java-sdk-bom</artifactId>
                <version>${aws-java-sdk-version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
~~~

