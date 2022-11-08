package banquemisr.irrigation.repository;


import banquemisr.irrigation.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;


@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> {

    @Query("SELECT t.plot FROM TimeSlot t WHERE t.status = 'IN PROGRESS'")
    List<TimeSlot> findReadySlots(@Param("plotId") Long plotId);

}

