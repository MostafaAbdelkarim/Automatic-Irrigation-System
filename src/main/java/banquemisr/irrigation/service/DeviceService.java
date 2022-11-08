package banquemisr.irrigation.service;

import banquemisr.irrigation.DTO.request.SensorDeviceDTO;
import banquemisr.irrigation.model.SensorDevice;

public interface DeviceService {

    SensorDevice saveNewSensorDevice(String id, SensorDeviceDTO sensorDeviceDTO);

}
