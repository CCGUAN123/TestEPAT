package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
	// Define Test Fixtures
	private Task t1;
	private ToDoList newTDL;
	private String desc = "Task 1";
	
   public ToDoListTest() {
      super();
   }

   @Before
   public void setUp() throws Exception {
	   t1 = new Task(desc);
	   newTDL = new ToDoList();
   }

   @After
   public void tearDown() throws Exception {
      // Uninitialise test Fixtures
	   
   }

   @Test
   public void testAddTask() {
	   newTDL.addTask(t1);
	   assertEquals(newTDL.getTask(desc), t1);
   }

   @Test
   public void testGetStatusFalse() {	   
	   newTDL.addTask(t1);
	   assertFalse(newTDL.getStatus(desc));
   }
   
   @Test
   public void testRemoveTask() {
      //fail("Not implemented yet");
   }

   @Test
   public void testGetCompletedTasks() {
     // fail("Not implemented yet");
   }
}
