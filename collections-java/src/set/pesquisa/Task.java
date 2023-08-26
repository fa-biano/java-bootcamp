package set.pesquisa;

public class Task {
    private String description;
    private boolean done;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    @Override
    public String toString() {
        return "Task [description=" + description + ", done=" + done + "]";
    }
}
