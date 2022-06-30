package ru.greatstep.vacationcalendar.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class VacationTimeTable {
    @Getter
    @Setter
    List<Worker> workerList;

    List<Vacation> allVacations;

    public List<Vacation> getAllVacations() {
        for (Worker worker : workerList) {
            allVacations.addAll(worker.getVacations());
        }
        return allVacations;
    }


}
