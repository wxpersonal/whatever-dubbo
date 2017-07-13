package com.wx.whatever.job;

import com.wx.whatever.pojo.User;
import com.wx.whatever.service.IUserService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/1.
 */
@DisallowConcurrentExecution
@Component
public class JobTest1 extends ScheduleJob implements Job  {

    @Autowired
    private IUserService userService;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        User user = userService.getById(1);
        ScheduleJob scheduleJob = (ScheduleJob)context.getMergedJobDataMap().get("scheduleJob");
        System.out.println(user.toString());
    }
}
