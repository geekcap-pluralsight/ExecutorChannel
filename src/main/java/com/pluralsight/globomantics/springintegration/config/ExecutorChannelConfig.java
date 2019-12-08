package com.pluralsight.globomantics.springintegration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.ExecutorChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableIntegration
public class ExecutorChannelConfig {
    @Bean
    public MessageChannel executorChannel(TaskExecutor taskExecutor) {
        return new ExecutorChannel(taskExecutor);
    }
}