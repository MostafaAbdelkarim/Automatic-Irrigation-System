package banquemisr.irrigation.DTO.request;

import lombok.Data;

@Data
public class SensorDeviceDTO {

    private String deviceId;
    private String deviceName;
    private String waterPressure;

}
