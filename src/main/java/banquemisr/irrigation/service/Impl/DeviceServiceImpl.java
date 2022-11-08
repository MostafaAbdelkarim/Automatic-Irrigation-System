package banquemisr.irrigation.service.Impl;

import banquemisr.irrigation.DTO.request.SensorDeviceDTO;
import banquemisr.irrigation.model.Plot;
import banquemisr.irrigation.model.SensorDevice;
import banquemisr.irrigation.repository.SensorDeviceRepository;
import banquemisr.irrigation.service.DeviceService;
import banquemisr.irrigation.utils.CheckExistenceUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

    private final SensorDeviceRepository sensorDeviceRepository;
    private final CheckExistenceUtils checkExistenceUtils;


    @Override
    public SensorDevice saveNewSensorDevice(String id, SensorDeviceDTO sensorDeviceDTO) {
        Plot plot = checkExistenceUtils.checkExistenceOfPlotById(Long.valueOf(id));
        SensorDevice sensorDevice = checkExistenceUtils.checkExistenceOfSensorDeviceById(sensorDeviceDTO.getDeviceId());
        sensorDevice.setPlot(plot);
        sensorDevice.setDeviceName(sensorDeviceDTO.getDeviceName());
        sensorDevice.setDeviceId(sensorDeviceDTO.getDeviceId());
        sensorDevice.setWaterPressure(sensorDeviceDTO.getWaterPressure());
        return sensorDeviceRepository.save(sensorDevice);
    }
}
