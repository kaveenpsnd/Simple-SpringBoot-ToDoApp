package com.todo.list.service;

import com.todo.list.dtos.ToDoDTO;
import com.todo.list.model.ToDo;
import com.todo.list.repository.ToDoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ToDoService {
    private final ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public ToDo save(ToDoDTO requestDTO) {
        ToDo todo = new ToDo();
        todo.setTitle(requestDTO.getTitle());
        todo.setCompleted(false);
        return toDoRepository.save(todo);

    }

    public ToDo update(Long id, ToDoDTO requestDTO) {
        ToDo todoToUpdate = toDoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
        todoToUpdate.setTitle(requestDTO.getTitle());
        return toDoRepository.save(todoToUpdate);
    }
    public void delete(Long id) {
        toDoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
        toDoRepository.deleteById(id);
    }
    public ToDo toggleCompletion(Long id) {
        ToDo todoToUpdate = toDoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found with id " + id));
        todoToUpdate.setCompleted(!todoToUpdate.isCompleted());
        return toDoRepository.save(todoToUpdate);
    }

}
