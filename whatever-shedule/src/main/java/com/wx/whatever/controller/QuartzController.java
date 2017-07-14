package com.wx.whatever.controller;

import com.wx.whatever.job.JobTest1;
import com.wx.whatever.common.ScheduleJob;
import com.wx.whatever.pojo.User;
import com.wx.whatever.service.IUserService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;
import java.util.HashMap;

@Controller
@RequestMapping("quartz")
public class QuartzController {

    /**
     * 计划任务map
     */
    private static Map<String, ScheduleJob> jobMap = new HashMap<String, ScheduleJob>();

    @Autowired
    @Qualifier("schedulerFactoryBean")
    SchedulerFactoryBean schedulerFactoryBean;

    @Autowired
    IUserService userService;

//    Scheduler scheduler = schedulerFactoryBean.getScheduler();

    @RequestMapping(value = "add")
    public String add(HttpServletRequest request) {

        JobTest1 job = new JobTest1();
        job.setJobId("10001");
        job.setJobName("data_import");
        job.setJobGroup("dataWork");
        job.setJobStatus("1");
        job.setCronExpression("0/5 * * * * ?");
        job.setDesc("数据导入任务");

        User byId = userService.getById(1);
        Scheduler scheduler = schedulerFactoryBean.getScheduler();
        JobDetail jobDetail = JobBuilder.newJob(JobTest1.class)
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
