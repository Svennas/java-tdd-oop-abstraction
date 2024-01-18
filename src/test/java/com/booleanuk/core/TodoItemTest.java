package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoItemTest {

    @Test
    public void testGetTitle() {
        TodoItem todo = new TodoItem("Morning Exercise", "Finish the morning exercise about abstraction.", "Unfinished");

        Assertions.assertEquals("Morning Exercise", todo.getTitle());
    }
    @Test
    public void testGetDetail() {
        TodoItem todo = new TodoItem("Morning Exercise", "Finish the morning exercise about abstraction.", "Unfinished");

        Assertions.assertEquals("Finish the morning exercise about abstraction.", todo.getDetail());
    }
    @Test
    public void testGetStatus() {
        TodoItem todo = new TodoItem("Morning Exercise", "Finish the morning exercise about abstraction.", "Unfinished");

        Assertions.assertEquals("Unfinished", todo.getStatus());
    }
    @Test
    public void testSetStatus() {
        TodoItem todo = new TodoItem("Morning Exercise", "Finish the morning exercise about abstraction.", "Unfinished");
        todo.setStatus("Finished");

        Assertions.assertEquals("Finished", todo.getStatus());
    }
}
