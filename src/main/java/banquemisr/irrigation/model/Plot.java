package banquemisr.irrigation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "plot")
public class Plot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plot_name")
    private String plotName;

    @Column(name = "plot_width")
    private Double plotWidth;

    @Column(name = "plot_length")
    private Double plotLength;

    @ManyToOne
    @JoinColumn(name = "land_id")
    @JsonIgnore
    private Land land;

    @OneToMany(mappedBy = "plot", cascade = CascadeType.ALL)
    private Set<TimeSlot> timeSlots;

    @OneToOne(mappedBy = "plot", cascade = CascadeType.ALL)
    private SensorDevice sensor;

}
