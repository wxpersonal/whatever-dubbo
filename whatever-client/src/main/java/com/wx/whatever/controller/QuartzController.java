package com.wx.whatever.controller;

import com.wx.whatever.schedule.QuartzJobFactory;
import com.wx.whatever.schedule.ScheduleJob;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;
import java.util.HashMap;

@Api(description = "任务调度")
//@Controller
@RestController
@RequestMapping("quartz")
public class QuartzController {

    /**
     * 计划任务map
     */
    private static Map<String, ScheduleJob> jobMap = new HashMap<String, ScheduleJob>();

    @Autowired
    @Qualifier("schedulerFactoryBean")
    SchedulerFactoryBean schedulerFactoryBean;

//    Scheduler scheduler = schedulerFactoryBean.getScheduler();

    @ApiOperation(value = "添加一个任务")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(HttpServletRequest request) {
        System.out.println("----------------");
        ScheduleJob job = new ScheduleJob();
        job.setJobId("10001");
        job.setJobName("data_import");
        job.setJobGroup("dataWork");
        job.setJobStatus("1");
        job.setCronExpression("0/5 * * * * ?");
        job.setDesc("数据导入任务");


        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        JobDetail jobDetail = JobBuilder.newJob(QuartzJobFactory.class)
                .withIdentity(job.getJobName(), job.getJobGroup()).build();
        jobDetail.getJobDataMap().put("scheduleJob", job);

        //表达式调度构建器
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job
                .getCronExpression());

        //按新的cronExpression表达式构建一个新的trigger
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName(), job.getJobGroup()).withSchedule(scheduleBuilder).build();

        try {
            scheduler.scheduleJob(jobDetail, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
        return "is ok";
    }

    /**
     * 添加任务
     *
     * @param scheduleJob
     */
    public static void addJob(ScheduleJob scheduleJob) {
        jobMap.put(scheduleJob.getJobGroup() + "_" + scheduleJob.getJobName(), scheduleJob);
    }

}
