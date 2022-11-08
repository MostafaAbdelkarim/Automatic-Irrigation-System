package banquemisr.irrigation.service;

import banquemisr.irrigation.DTO.request.ConfigureLandDTO;
import banquemisr.irrigation.DTO.request.CreateLandDTO;
import banquemisr.irrigation.model.Land;

import java.util.List;

public interface LandService {

    Land saveNewLand(CreateLandDTO createLandDTO);

    Land configureLandById(ConfigureLandDTO configureLandDTO, Long id);

    List<Land> getAllLands();

    Land getLandById(Long id);
}
