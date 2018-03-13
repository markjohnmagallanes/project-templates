package com.example.collector.task;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger LOG = LogManager.getLogger(ScheduledTasks.class);

    @Scheduled(cron = "${collector.task1.cron}")
    public void task1() throws Exception {
        LOG.info("task1 Started: {}", LocalDateTime.now().toString());
        TimeUnit.SECONDS.sleep(5);
        LOG.info("task1 Ended: {}", LocalDateTime.now().toString());
    }

    @Scheduled(cron = "${collector.task2.cron}")
    public void task2() throws Exception {
        LOG.info("task2 Started: {}", LocalDateTime.now().toString());
        LOG.info("task2 Ended: {}", LocalDateTime.now().toString());
    }
}
