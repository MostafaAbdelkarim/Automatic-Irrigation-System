package banquemisr.irrigation.DTO.request;

import banquemisr.irrigation.model.Plot;
import lombok.Data;

import java.util.Set;

@Data
public class ConfigureLandDTO {

    private String landName;
    private Double landWidth;
    private Double landLength;
    private Set<Plot> plots;

}
