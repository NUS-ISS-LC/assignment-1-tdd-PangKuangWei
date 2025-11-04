package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      // Add code here
      tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      // Add code here
      tasks.get(description).setComplete(true);
   }

   public boolean getStatus(String description) {
      // Add code here
      return tasks.get(description).isComplete();
   }

   public Task getTask(String description) {
      // Add code here
      return tasks.get(description);
   }

   public Task removeTask(String description) {
      // Add code here
      return tasks.remove(description);
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      ArrayList<Task> completedTasks = new ArrayList<>();
      for (Task t : tasks.values()) {
         if (t.isComplete()) {
            completedTasks.add(t);
         }
      }
      return completedTasks;
   }
}
