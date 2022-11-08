package banquemisr.irrigation.DTO.request;

import lombok.Data;

@Data
public class CreateLandDTO {

    private String landName;
    private Double landWidth;
    private Double landLength;

}
