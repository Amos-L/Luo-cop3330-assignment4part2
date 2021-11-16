/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Amos Luo
 */

package ucf.assignments.luocop3330assignment4part2;

import java.time.LocalDate;

public class tableVal {
    private String description;
    private String task;
    private LocalDate date;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getDate() {
        return date;
    }

    public tableVal(LocalDate date, String description, String task){
        this.setDate(date);
        this.setDescription(description);
        this.setTask(task);
    }
}
