package ru.greatstep.vacationcalendar.Models;

import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Data
public class Vacation {
    private LocalDate startVacation;
    private LocalDate endVacation;

    public Vacation(LocalDate startVacation, LocalDate endVacation) {
        this.startVacation = startVacation;
        this.endVacation = endVacation;
    }

    public int getDaysCapacity(){
        return (int) (startVacation.until(endVacation, ChronoUnit.DAYS) + 1);
    }


}
