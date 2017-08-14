import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class RemoteClientExample {
    public void run() throws Exception {

        System.setProperty("org.quartz.properties", "client.properties");

        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();

        JobDetail job = JobBuilder.newJob(RmiJob.class)
                .withIdentity("remotelyAddedJob", "default").build();

        JobDataMap map = job.getJobDataMap();
        map.put("msg", "向服务端添加Job!");

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("remotelyAddedTrigger", "default")
                .forJob(job.getKey())
                .withSchedule(CronScheduleBuilder.cronSchedule("/5 * * ? * *"))
                .build();

        sched.scheduleJob(job, trigger);

        System.out.println("服务端工作.");
    }

    public static void main(String[] args) throws Exception {
        RemoteClientExample example = new RemoteClientExample();
        example.run();
    }
}
