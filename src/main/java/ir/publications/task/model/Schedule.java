package ir.publications.task.model;

import ir.publications.task.model.baseModel.Base;
import ir.publications.task.model.enums.Week;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Schedule")
public class Schedule extends Base<Long> {

    @Enumerated(EnumType.STRING)
    private Week day;

    private LocalTime startTime;

    private LocalTime endTime;
}
