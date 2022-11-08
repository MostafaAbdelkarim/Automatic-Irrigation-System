package banquemisr.irrigation.service;

import banquemisr.irrigation.model.TimeSlot;

import java.util.List;

public interface TimeSlotService {

    TimeSlot saveTimeSlot(TimeSlot timeSlot);

    List<TimeSlot> getAllTimeSlots();

}
