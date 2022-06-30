package ru.greatstep.vacationcalendar;

import ru.greatstep.vacationcalendar.Models.Vacation;
import ru.greatstep.vacationcalendar.Models.VacationTimeTable;
import ru.greatstep.vacationcalendar.Models.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) throws Exception {




            LocalDate start1 = LocalDate.parse("2022-02-01");

            LocalDate end1 = LocalDate.parse("2022-02-14");

            Vacation vacation = new Vacation(start1, end1);

            LocalDate start2 = LocalDate.parse("2022-02-12");

            LocalDate end2 = LocalDate.parse("2022-02-18");

            Vacation vacation2 = new Vacation(start2, end2);


            List<Vacation> vacations = new ArrayList<>();

            vacations.add(vacation);
            vacations.add(vacation2);
                Worker worker1 = new Worker("Dmitriy Tkachenko", 28, vacations);



        VacationTimeTable vacationTimeTable = new VacationTimeTable();
            List<Worker> workers = new ArrayList<>();
            workers.add(worker1);
            vacationTimeTable.setWorkerList(workers);
    }
}
