package banquemisr.irrigation.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "land")
public class Land {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "land_name")
    private String landName;

    @Column(name = "land_width")
    private Double landWidth;

    @Column(name = "land_length")
    private Double landLength;

    @OneToMany(mappedBy = "land")
    private Set<Plot> plots;

}
