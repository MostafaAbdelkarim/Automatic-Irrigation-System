package banquemisr.irrigation.controller;

import banquemisr.irrigation.DTO.request.ConfigureLandDTO;
import banquemisr.irrigation.DTO.request.CreateLandDTO;
import banquemisr.irrigation.model.Land;
import banquemisr.irrigation.service.LandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class LandController {

    private final LandService landService;

    @PostMapping("/add_land")
    public ResponseEntity<?> saveNewLand(@RequestBody CreateLandDTO createLandDTO) {
        return new ResponseEntity<>(landService.saveNewLand(createLandDTO), CREATED);
    }

    @PutMapping("/land/configure/{id}")
    public ResponseEntity<?> configureLandById(@RequestBody ConfigureLandDTO configureLandDTO, @PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(landService.configureLandById(configureLandDTO, id), OK);
    }

    @GetMapping("/land/{id}")
    public ResponseEntity<?> getLandById(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(landService.getLandById(id), OK);
    }

    @GetMapping("/get_all_lands")
    public ResponseEntity<List<Land>> getAllLands() {
        return new ResponseEntity<>(landService.getAllLands(), OK);
    }

}
