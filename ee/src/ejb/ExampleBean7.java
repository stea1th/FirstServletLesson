package ejb;

import javax.annotation.Resource;
import javax.ejb.*;
import java.util.Date;


@Singleton
public class ExampleBean7 {

    @Resource
    TimerService timerService;


    public String getName() {
        return "Max Mutzke";
    }

    public void startSayHello() {
        ScheduleExpression scheduleExpression = new ScheduleExpression().hour("*").minute("*").second("*");
        timerService.createCalendarTimer(scheduleExpression, new TimerConfig("This is timer", true));
    }

//    @Schedule(second = "*", minute = "*", hour = "*", persistent = false)
    @Timeout
    private void print(Timer timer) {
        System.out.println(timer.getInfo());
    }
}
