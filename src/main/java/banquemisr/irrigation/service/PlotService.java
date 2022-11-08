package banquemisr.irrigation.service;

import banquemisr.irrigation.DTO.request.PlotDTO;
import banquemisr.irrigation.model.Plot;

import java.util.List;

public interface PlotService {

    Plot saveNewPlot(Long id, PlotDTO plotDTO);

    List<Plot> getAllPlots();

}
