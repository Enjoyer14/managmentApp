package modules.Tasks.Timed;

import modules.Tasks.Task;

import java.time.LocalDateTime;

public class TimedTask extends Task {

    private LocalDateTime plannedTime;

    public TimedTask(){
        super();
    }

    public TimedTask(Integer statusID, String name, String description){
        super(statusID, name, description);
    }
    public TimedTask(Integer statusID, String name, String description, LocalDateTime plannedTime){
        this(statusID, name, description);
        this.plannedTime = plannedTime;
    }


    public void setPlannedTime(LocalDateTime time){
        this.plannedTime = time;
    }

}
