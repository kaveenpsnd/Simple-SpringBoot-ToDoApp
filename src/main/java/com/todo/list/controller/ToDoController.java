package com.todo.list.controller;

import com.todo.list.dtos.ToDoDTO;
import com.todo.list.model.ToDo;
import com.todo.list.service.ToDoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    @GetMapping
    public List<ToDo> getAllTodos(){
        return  toDoService.findAll();

    }
    @PostMapping
    public ToDo createToDo(@Valid @RequestBody ToDoDTO requestDTO){
       return toDoService.save(requestDTO);


    }
    @PutMapping("/{id}")
    public ToDo updatedTODo(@PathVariable Long id, @Valid  @RequestBody ToDoDTO requestDTO){
        return toDoService.update(id, requestDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable Long id){
        toDoService.delete(id);
    }
    @PatchMapping("/{id}/toggle")
    public ToDo toggleToDoCompletion(@PathVariable Long id){
        return toDoService.toggleCompletion(id);
    }


}
