package com.example.mail.receiver;

import com.example.vhrmodel.MailConstants;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.messaging.Message;
import org.thymeleaf.TemplateEngine;

import java.io.IOException;

public class MailReceiver {

        public static final Logger logger= LoggerFactory.getLogger(MailReceiver.class);

        @Autowired
        JavaMailSender javaMailSender;

        @Autowired
        MailProperties mailProperties;

        @Autowired
        TemplateEngine templateEngine;

        @Autowired
        StringRedisTemplate redisTemplate;

        @RabbitListener(queues = MailConstants.MAIL_QUEUE_NAME)
        public void handler(Message message, Channel channel) throws IOException{



        }



}
