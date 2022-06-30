package ru.greatstep.vacationcalendar.Models;


import lombok.Data;

import java.util.List;

@Data
public class Worker {

    private String name;
    private int days_vacation;
    private List<Vacation> vacations;

    public Worker(String name,int days_vacation,List<Vacation> vacations) throws Exception {
        this.name = name;
        this.days_vacation = days_vacation;
        setVacations(vacations);
    }

    public void setVacations(List<Vacation> vacations) throws Exception {
        this.vacations = vacations;
        for (Vacation vacation:vacations){
            days_vacation -= vacation.getDaysCapacity();
        }
        if(days_vacation<0){
            throw new Exception("Не достаточно доступных дней отпуска");
        }

    }

    public int getPlainDaysVacations(){
        int plainDaysVacations = 0;
        for(Vacation vacation:vacations){
            plainDaysVacations += vacation.getDaysCapacity();
        }
        return plainDaysVacations;
    }
    @Override
    public String toString() {
        return "Имя работника: " + name +
                "; Не распределено дней отпуска: " + days_vacation +
                "; Кол-во запланированных отпусков: " + vacations.size() +
                "; Дней отпуска запланировано: " + getPlainDaysVacations();
    }
}
