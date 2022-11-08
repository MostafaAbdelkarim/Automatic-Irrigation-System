package banquemisr.irrigation.service.Impl;

import banquemisr.irrigation.DTO.request.ConfigureLandDTO;
import banquemisr.irrigation.DTO.request.CreateLandDTO;
import banquemisr.irrigation.model.Land;
import banquemisr.irrigation.repository.LandRepository;
import banquemisr.irrigation.service.LandService;
import banquemisr.irrigation.utils.CheckExistenceUtils;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LandServiceImpl implements LandService {

    private final LandRepository landRepository;
    private final CheckExistenceUtils checkExistenceUtils;
    private final ModelMapper modelMapper;

    @Override
    public Land saveNewLand(CreateLandDTO createLandDTO) {
        Land land = new Land();
        land.setLandName(createLandDTO.getLandName());
        land.setLandWidth(createLandDTO.getLandWidth());
        land.setLandLength(createLandDTO.getLandLength());
        return landRepository.save(land);
    }

    @Override
    public Land configureLandById(ConfigureLandDTO configureLandDTO, Long id) {
        Land land = checkExistenceUtils.checkExistenceOfLandById(id);
        land.setLandLength(configureLandDTO.getLandLength());
        land.setLandName(configureLandDTO.getLandName());
        land.setLandWidth(configureLandDTO.getLandWidth());
        land.setPlots(configureLandDTO.getPlots());
        return landRepository.save(land);
    }

    @Override
    public List<Land> getAllLands() {
        return landRepository.findAll();
    }

    @Override
    public Land getLandById(Long id) {
        return checkExistenceUtils.checkExistenceOfLandById(id);
    }

}
