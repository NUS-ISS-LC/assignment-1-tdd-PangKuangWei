package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ToDoListTest  {
    // Define Test Fixtures
    private String s1;
    private String s2;
    private Task t1;
    private Task t2;

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
        
        assertEquals(t1, toDoList.getTask(s1));
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
        
        assertEquals(t1, toDoList.removeTask(s1));
        assertEquals(0, toDoList.getAllTasks().size());
    }

    @Test
    public void testGetCompletedTasks() {
        ToDoList toDoList = new ToDoList();
        assertEquals(0, toDoList.getAllTasks().size());
        toDoList.addTask(t1);
        assertEquals(1, toDoList.getAllTasks().size());
        toDoList.addTask(t2);
        assertEquals(2, toDoList.getAllTasks().size());
    }
}