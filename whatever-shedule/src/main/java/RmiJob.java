import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RmiJob implements Job {
    public static final String MESSAGE = "msg";

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        JobKey jobKey = context.getJobDetail().getKey();

        String message = (String)context.getJobDetail().getJobDataMap().get("msg");

        System.out.println(dateFormat.format(new Date()) + " : " + jobKey + " 执行 " );
        System.out.println("SimpleJob: msg: " + message);
    }

}