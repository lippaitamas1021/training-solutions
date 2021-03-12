package exam03retake02;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public List<Todo> getTodos() {
        return new ArrayList<>(todos);
    }

    public int getNumberOfItemsLeft() {
        int counter = 0;
        for (Todo todo : todos) {
            if (todo.getState().equals(State.NON_COMPLETED)) {
                counter++;
            }
        }
        return counter;
    }

    public List<String> getMostImportantTodosText() {
        List<String> importantTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getPriority() == 1) {
                importantTodos.add(todo.getText());
            }
        }
        if (importantTodos.isEmpty()) {
            for (Todo todo : todos) {
                if (todo.getPriority() == 2) {
                    importantTodos.add(todo.getText());
                }
            }
        }
        return importantTodos;
    }

    public void deleteCompleted() {
        todos.removeIf(todo -> todo.getState() == State.COMPLETED);
    }
}
