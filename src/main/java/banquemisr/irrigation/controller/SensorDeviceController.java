package banquemisr.irrigation.controller;

import banquemisr.irrigation.DTO.request.SensorDeviceDTO;
import banquemisr.irrigation.model.SensorDevice;
import banquemisr.irrigation.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SensorDeviceController {

    private final DeviceService deviceService;

    @PostMapping("/plot/{id}/device")
    public ResponseEntity<SensorDevice> addDevice(
            @RequestBody SensorDeviceDTO sensorDeviceDTO,
            @PathVariable(value = "id") String id) {
        return new ResponseEntity<>(deviceService.saveNewSensorDevice(id, sensorDeviceDTO), OK);
    }
}
