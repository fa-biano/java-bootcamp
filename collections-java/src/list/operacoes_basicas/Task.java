package list.operacoes_basicas;

public class Task {
    private String description;

    public Task(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        // return "{ description: " + description + " }";
        return description;
    }
}
