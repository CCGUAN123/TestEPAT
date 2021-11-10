package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
	   tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
	   tasks.get(description).setComplete(true);
   }

   public boolean getStatus(String description) {
	  if (tasks.get(description).isComplete())
	   return true;
      return false;
   }

   public Task getTask(String description) {
      return tasks.get(description);
   }

   public Task removeTask(String description) {
      // Add code here
      return null;
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      return null;
   }
}
