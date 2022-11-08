package banquemisr.irrigation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "time_slots")
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "duration_time")
    private String durationTime;

    @ManyToOne
    @JoinColumn(name = "plot_id")
    @JsonIgnore
    private Plot plot;

    @Column(name = "current_status")
    private String status;
}
