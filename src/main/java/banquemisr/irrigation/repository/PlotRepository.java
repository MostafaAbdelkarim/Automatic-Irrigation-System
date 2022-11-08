package banquemisr.irrigation.repository;


import banquemisr.irrigation.model.Plot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlotRepository extends JpaRepository<Plot, Long> {
        @Query("SELECT plot FROM Plot plot INNER JOIN plot.timeSlots ts")
        List<Plot> findPlotInnerJoiningTimeSlot();
}
