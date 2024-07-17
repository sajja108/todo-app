package first.todoproject.controller;
import first.todoproject.service.todosevice;
import first.todoproject.models.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/todos")
public class todocontroller {
    @Autowired
    private todosevice todoService;
    @GetMapping
    public List<todo> getTodos() {
        return todoService.findAll();
    }
    @GetMapping("/{id}")
    public todo getTodoById(@PathVariable Long id) {
        return todoService.findById(id);
    }
@PostMapping
    public todo createtodo(@RequestBody todo todo) {
        return todoService.save(todo);
}
@PutMapping("/{id}")
    public todo updateTodo(@PathVariable Long id, @RequestBody todo todo) {
        todo.setId(id);
        return todoService.save(todo);
 }
@DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteById(id);
 }
}