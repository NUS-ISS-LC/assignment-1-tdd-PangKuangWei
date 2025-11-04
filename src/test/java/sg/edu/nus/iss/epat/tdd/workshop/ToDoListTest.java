package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ToDoListTest  {
    // Define Test Fixtures
    public String s1;
    public String s2;
    public Task t1;
    public Task t2;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        s1 = "Test String 1";
        s2 = "Test String 2";
        t1 = new Task(s1, false);
        t2 = new Task(s2, true);
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
    }

    @Test
    public void testAddTask() {
        ToDoList toDoList =  new ToDoList();
        toDoList.addTask(t1);
        
        assertEquals(toDoList.getTask(s1), t1);
    }

    @Test
    public void testGetStatus() {
        ToDoList toDoList =  new ToDoList();
        toDoList.addTask(t1);
        assertFalse(toDoList.getStatus(s1));

        toDoList.addTask(t2);
        assertTrue(toDoList.getStatus(s2));
    }

    @Test
    public void testRemoveTask() {
        ToDoList toDoList =  new ToDoList();
        toDoList.addTask(t1);
        
        assertEquals(toDoList.removeTask(s1), t1);
    }

    @Test
    public void testGetCompletedTasks() {
        ToDoList toDoList = new ToDoList();
        assertEquals(toDoList.getAllTasks().size(), 0);
        toDoList.addTask(t1);
        assertEquals(toDoList.getAllTasks().size(), 1);
        toDoList.addTask(t2);
        assertEquals(toDoList.getAllTasks().size(), 2);
    }
}