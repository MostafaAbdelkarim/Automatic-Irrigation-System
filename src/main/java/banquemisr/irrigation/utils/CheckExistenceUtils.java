package banquemisr.irrigation.utils;

import banquemisr.irrigation.exception.custom.LandNotFoundException;
import banquemisr.irrigation.model.Land;
import banquemisr.irrigation.model.Plot;
import banquemisr.irrigation.model.SensorDevice;
import banquemisr.irrigation.repository.LandRepository;
import banquemisr.irrigation.repository.PlotRepository;
import banquemisr.irrigation.repository.SensorDeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CheckExistenceUtils {

    private final LandRepository landRepository;
    private final PlotRepository plotRepository;
    private final SensorDeviceRepository sensorDeviceRepository;

    public Land checkExistenceOfLandById(Long id){
        Optional<Land> optionalLand = landRepository.findById(id);
        if(!optionalLand.isPresent()) throw new LandNotFoundException("Land with given id is not found");
        return optionalLand.get();
    }

    public Plot checkExistenceOfPlotById(Long id){
        Optional<Plot> optionalPlot = plotRepository.findById(id);
        if(!optionalPlot.isPresent()) throw new LandNotFoundException("Plot with given id is not found");
        return optionalPlot.get();
    }
    public SensorDevice checkExistenceOfSensorDeviceById(String id){
        Optional<SensorDevice> optionalSensorDevice = sensorDeviceRepository.findByDeviceId(id);
        if(!optionalSensorDevice.isPresent()) throw new LandNotFoundException("SensorDevice with given id is not found");
        return optionalSensorDevice.get();
    }

}
