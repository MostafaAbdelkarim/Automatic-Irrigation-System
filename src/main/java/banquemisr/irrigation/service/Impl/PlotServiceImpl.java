package banquemisr.irrigation.service.Impl;

import banquemisr.irrigation.DTO.request.PlotDTO;
import banquemisr.irrigation.model.Land;
import banquemisr.irrigation.model.Plot;
import banquemisr.irrigation.repository.PlotRepository;
import banquemisr.irrigation.service.PlotService;
import banquemisr.irrigation.utils.CheckExistenceUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlotServiceImpl implements PlotService {

    private final PlotRepository plotRepository;
    private final CheckExistenceUtils checkExistenceUtils;

    @Override
    public Plot saveNewPlot(Long id, PlotDTO plotDTO) {
        Land land = checkExistenceUtils.checkExistenceOfLandById(id);
        Plot plot = new Plot();
        plot.setLand(land);
        plot.setPlotName(plotDTO.getPlotName());
        plot.setPlotLength(plotDTO.getPlotLength());
        plot.setPlotWidth(plotDTO.getPlotWidth());
        return plotRepository.save(plot);
    }

    @Override
    public List<Plot> getAllPlots() {
        return plotRepository.findPlotInnerJoiningTimeSlot();
    }

}
