import java.util.Date;

public class Task {
    private int id;
    private String goal;
    private boolean isCompleted=false;
    private Date createdOn;

    public Task(int id,String goal) {

        this.id=id;
        this.goal = goal;
        this.createdOn = new Date();
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public boolean getIsCompleted() {
        return isCompleted;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    @Override
    public String toString() {
        return "Task{" +
                "goal='" + goal + '\'' +
                ", status=" + isCompleted +
                ", createdOn=" + createdOn +
                '}';
    }

    public void done() {
        this.isCompleted=true;
    }

}
