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
        List<String> texts = new ArrayList<>();
        int maxPriority = 5;
        for (Todo todo : todos) {
           if (maxPriority > todo.getPriority()) {
               maxPriority = todo.getPriority();
               texts.clear();
               texts.add(todo.getText());
           } else if (maxPriority == todo.getPriority()) {
               texts.add(todo.getText());
           }
        }
        return texts;
    }

    public void deleteCompleted() {
        todos.removeIf(todo -> todo.getState() == State.COMPLETED);
    }
}
