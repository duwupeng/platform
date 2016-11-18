package com.beizhi.cloud.ms.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by eric on 16/11/17.
 */
@Component
public class Task {
    private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @Scheduled(cron = "0,30 * * * * *")
    public void cronJob(){
        logger.info(">cronJob");
        logger.info("There are {} greetings in the data store");
        logger.info("<cronJob");

    }

    @Scheduled(initialDelay = 5000,
            fixedRate = 15000)
    public void fixedRateJobWithInitialDelay(){
        logger.info(">fixedRateJobWithInitialDelay");
        long pause = 5000;
        long start = System.currentTimeMillis();
        do{
            if(start + pause < System.currentTimeMillis()){
                break;
            }
        } while (true);
        logger.info("Processing time was {} seconds.", pause/1000);

        logger.info("<fixedRateJobWithInitialDelay");

    }

    @Scheduled(initialDelay = 5000,
            fixedDelay= 15000)
    public void fixedDelayJobWithInitialDelay(){
        logger.info(">fixedDelayJobWithInitialDelay");
        long pause = 5000;
        long start = System.currentTimeMillis();
        do{
            if(start + pause < System.currentTimeMillis()){
                break;
            }
        } while (true);
        logger.info("Processing time was {} seconds.", pause/1000);

        logger.info("<fixedDelayJobWithInitialDelay");

    }
}
