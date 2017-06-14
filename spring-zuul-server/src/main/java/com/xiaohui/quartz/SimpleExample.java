package com.xiaohui.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

import static org.quartz.TriggerBuilder.newTrigger;

/**
 * Created by 辉 on 2017/3/18.
 */
public class SimpleExample {
    public void run() throws Exception {
        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        // 下一个整分钟
        Date startTime = DateBuilder.nextGivenSecondDate(null, 3);
        JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group").build();
        CronTrigger  trigger = newTrigger().withIdentity("trigger1", "group1")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?")).build();
        sched.scheduleJob(job, trigger);
        sched.start();


    }

    public static void main(String[] args) throws Exception {
        SimpleExample example = new SimpleExample();
        example.run();
    }
}
