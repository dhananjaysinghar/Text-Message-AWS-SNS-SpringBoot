package com.awssns;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Pattern;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/message")
@Validated
@Slf4j
public class TextMessageController {

    @Autowired
    private AmazonSNS amazonSNSClient;

    @GetMapping("/text")
    public String sendSms(@Pattern(regexp = "^\\d{10}$", message =
            "mobile number should be 10 digit") String to, String text) {
        try {
            String defaultCountryCode = "+91";
            Map<String, MessageAttributeValue> smsAttributes = new HashMap<>();
            smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue()
                    .withStringValue("Transactional")
                    .withDataType("String"));

            amazonSNSClient
                    .publish(new PublishRequest()
                            .withMessageAttributes(smsAttributes)
                            .withMessage(text)
                            .withPhoneNumber(defaultCountryCode + to));

            return "Sms Sent Successfully!!";
        } catch (Exception e) {
            log.error("Error occurred during sending email {}", e.getMessage());
            throw new RuntimeException("Error occurred during sending email");
        }
    }
}
