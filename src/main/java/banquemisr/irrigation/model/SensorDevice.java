package banquemisr.irrigation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "sensor_devices")
public class SensorDevice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="device_id", unique = true)
    private String deviceId;

    @Column(name = "water_pressure")
    private String waterPressure;

    @Column(name="device_name", unique = true)
    private String deviceName;

    @OneToOne
    @JoinColumn(name = "plot_id", unique = true)
    @JsonIgnore
    private Plot plot;

}
