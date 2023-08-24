package list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();

        for(Task task : taskList){
            if (task.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(task);
            }
        }

        taskList.removeAll(tasksToRemove);
    }

    public int getTasksQty() {
        return taskList.size();
    }

    public void getTasksDescription() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        System.out.println("O número total de tarefas é " + taskList.getTasksQty());
        
        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 2");
        System.out.println("O número total de tarefas é " + taskList.getTasksQty());
        
        System.out.println("Tarefas: ");
        taskList.getTasksDescription();
        taskList.removeTask("Tarefa 1");
        System.out.println("O número total de tarefas é " + taskList.getTasksQty());
        
    }
}
