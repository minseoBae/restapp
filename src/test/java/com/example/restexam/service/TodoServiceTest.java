package com.example.restexam.service;

import com.example.restexam.domain.Todo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional
class TodoServiceTest {
    @Autowired TodoService todoService;
    private static final Logger log = LoggerFactory.getLogger(TodoServiceTest.class);

    @Test
    void getTodos() {
        List<Todo> todos = todoService.getTodos();
        assertNotNull(todos);
        assertTrue(todos.size() > 0);

        todos.forEach(todo -> log.info("Todo ::: " + todos));
    }

    @Test
    void getTodo() {
        Todo todo = todoService.getTodo(1L);
        assertNotNull(todo);
        log.info("Todo ::: " + todo);
    }

    @Test
    void addTodo() {
        Todo todo1 = todoService.addTodo("Todo1");
        Todo todo2 = todoService.addTodo("Todo2");
        Todo todo3 = todoService.addTodo("Todo3");
        Todo todo4 = todoService.addTodo("Todo4");
        Todo todo5 = todoService.addTodo("Todo5");
        log.info("Todo ::: " + todo1);
    }

    @Test
    void updateTodo() {
        log.info("Before Todo :::::::::" + todoService.getTodo(1L));
        Todo todo = todoService.updateTodo(1L);
        log.info("after Todo ::::::::" + todo);
    }

    @Test
    void deleteTodo() {
        log.info("Todo :::::" + todoService.getTodo(1L));
        todoService.deleteTodo(1L);
        log.info("Todo :::::" + todoService.getTodo(1L));
    }
}