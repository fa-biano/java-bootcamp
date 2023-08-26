package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class TaskListSet {
    private Set<Task> taskList;

    public TaskListSet() {
        this.taskList = new HashSet<>();
    }

    public void addTask(String description) {
        this.taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        Task taskToRemove = null;

        for (Task task : this.taskList) {
            if (task.getDescription() == description) {
                taskToRemove = task;
                break;
            }
        }

        if (taskToRemove == null) {
            System.out.println("Tarefa não encontrada!");
          }

        this.taskList.remove(taskToRemove);
    }

    public void printTasks() {
        System.out.println(this.taskList);
    }

    public int countTasks() {
        return this.taskList.size();
    }

    public Set<Task> getTasksDone() {
        Set<Task> tasksDone = new HashSet<>();

        for (Task task : this.taskList) {
            if (task.isDone()) {
                tasksDone.add(task);
            }
        }

        return tasksDone;
    }

    public Set<Task> getTasksUndone() {
        Set<Task> tasksUndone = new HashSet<>();

        for (Task task : this.taskList) {
            if (!task.isDone()) {
                tasksUndone.add(task);
            }
        }

        return tasksUndone;
    }

    public Task setTaskDone(String description) {
        Task setDone = null;

        for (Task task : this.taskList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setDone(true);
                setDone = task;
                break;
            }
        }
        return setDone;
    }

    public Task setTaskUndone(String description) {
        Task setUndone = null;

        for (Task task : this.taskList) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                task.setDone(false);
                setUndone = task;
                break;
            }
        }
        return setUndone;
    }

    public void clearTaskList() {
        this.taskList.clear();
        System.out.println("Lista de Tarefas limpa!");
    }

    public static void main(String[] args) {
        TaskListSet taskListSet = new TaskListSet();
        taskListSet.addTask("Tarefa 1");
        taskListSet.addTask("Tarefa 2");
        taskListSet.addTask("Tarefa 3");

        System.out.println("Qtd de Tasks: " + taskListSet.countTasks());
        taskListSet.printTasks();
        
        taskListSet.setTaskDone("Tarefa 1");
        taskListSet.setTaskDone("Tarefa 2");
        System.out.println("Tarefas realizadas:");
        System.out.println(taskListSet.getTasksDone());
        System.out.println("\n");
        
        taskListSet.setTaskUndone("Tarefa 1");
        System.out.println("Tarefas Pendentes:");
        System.out.println(taskListSet.getTasksUndone());
        System.out.println("\n");

        taskListSet.removeTask("Tarefa 3");
        System.out.println("Qtd de Tasks: " + taskListSet.countTasks());
        taskListSet.printTasks();

        taskListSet.clearTaskList();
        taskListSet.countTasks();
    }
}
