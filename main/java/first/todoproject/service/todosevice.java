package first.todoproject.service;
import first.todoproject.models.todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@Service
public class todosevice {
    private List<todo> todos = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

    public List<todo> findAll() {
        return todos;
    }
public todo findById(long id) {
        return todos.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElse(null) ;
}
    public todo save(todo todo) {
        if (todo.getId() == 0) {
            todo.setId(counter.incrementAndGet());
            todos.add(todo);
        } else {
            int index = todos.indexOf(findById(todo.getId()));
            if (index >= 0) {
                todos.set(index, todo);
            }
        }
    return todo ;
}
    public void deleteById(Long id) {
        todos.removeIf(todo -> todo.getId() == id);
    }
}