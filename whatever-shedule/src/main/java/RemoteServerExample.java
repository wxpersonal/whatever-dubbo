import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SchedulerMetaData;
import org.quartz.impl.StdSchedulerFactory;

public class RemoteServerExample {
    public void run() throws Exception {

        System.setProperty("org.quartz.properties", "server.properties");


        SchedulerFactory sf = new StdSchedulerFactory();
        Scheduler sched = sf.getScheduler();
        System.out.println("------- 初始化完成 -----------");
        System.out.println("------- 由远程客户端来安排Job --");

        System.out.println("------- 开始Scheduler ----------------");
        sched.start();
        System.out.println("------- Scheduler调用job结束 -----------------");
        System.out.println("------- 等待10分钟... ------------");
        try {
            Thread.sleep(600000L);
        } catch (Exception e) {
        }

        System.out.println("------- 关闭Scheduler ---------------------");
        sched.shutdown(true);
        System.out.println("------- 关闭完成 -----------------");

        SchedulerMetaData metaData = sched.getMetaData();
        System.out.println("Executed " + metaData.getNumberOfJobsExecuted()
                + " jobs.");
    }

    public static void main(String[] args) throws Exception {
        RemoteServerExample example = new RemoteServerExample();
        example.run();
    }
}
