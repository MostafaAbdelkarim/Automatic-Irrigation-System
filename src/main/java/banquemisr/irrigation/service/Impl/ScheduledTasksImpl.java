package banquemisr.irrigation.service.Impl;

import banquemisr.irrigation.service.ScheduledTasks;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static banquemisr.irrigation.constants.StringConstants.MAX_RETRIES_FOR_SENSOR;
import static banquemisr.irrigation.constants.StringConstants.SENSOR_TIME_INTERVAL;

@Service
public class ScheduledTasksImpl implements ScheduledTasks {

    @Override
    @Scheduled(fixedDelay = 300000)
    public void doScheduledIrrigationForPlots() {
        //Get time slots from DB
        System.out.println("Getting time slots from DB");
        //Set each status of plot to "IN PROGRESS"
        System.out.println("Setting each plot status to IN PROGRESS");
        //Set duration and water amount for each Sensor to work
        System.out.println("Setting duration and water pressure");
        //if no of retries exceeded break
        System.out.println("Breaking as no of retries exceeded: " + MAX_RETRIES_FOR_SENSOR);
        //save plot with status "Finished"
        System.out.println("Finished and will be running again in assigned time: " + SENSOR_TIME_INTERVAL);
    }
}
