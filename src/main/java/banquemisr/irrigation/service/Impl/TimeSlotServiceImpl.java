package banquemisr.irrigation.service.Impl;

import banquemisr.irrigation.model.TimeSlot;
import banquemisr.irrigation.repository.TimeSlotRepository;
import banquemisr.irrigation.service.TimeSlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TimeSlotServiceImpl implements TimeSlotService {

    private final TimeSlotRepository timeSlotRepository;

    @Override
    public TimeSlot saveTimeSlot(TimeSlot timeSlot) {
        return timeSlotRepository.save(timeSlot);
    }

    @Override
    public List<TimeSlot> getAllTimeSlots() {
        return timeSlotRepository.findReadySlots(null);
    }
}
