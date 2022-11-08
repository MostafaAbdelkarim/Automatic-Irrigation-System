package banquemisr.irrigation.controller;

import banquemisr.irrigation.DTO.request.PlotDTO;
import banquemisr.irrigation.service.PlotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PlotController {

    private final PlotService plotService;

    @PostMapping("/land/{id}/add_plot")
    public ResponseEntity<?> saveNewPlot(@RequestBody PlotDTO plotDTO, @PathVariable("id") Long id){
        return new ResponseEntity<>(plotService.saveNewPlot(id, plotDTO), CREATED);
    }

    @GetMapping("/get_all_plots")
    public ResponseEntity<?> getAllPlotsWithTimeSlots(){
        return new ResponseEntity<>(plotService.getAllPlots(), OK);
    }

}
