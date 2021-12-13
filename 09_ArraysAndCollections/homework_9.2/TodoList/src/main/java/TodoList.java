import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String todo) {
        // Добавляет переданное дело в конец списка
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        // Добавляет дело на указаный индекс,
        //  проверяет возможность добавления

        if (index <= todoList.size()) {     // TODO добавить проверку индекса на отрицательное значение
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }

//        for (int i = 0; i < todoList.size(); i++) {
//            System.out.println("Task " + (i + 1) + " : " + todoList.get(i));
//        }
    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения

        if (index < todoList.size()) {
            String oldValue = todoList.get(index);
            todoList.set(index, todo);
            System.out.println("Дело \"" + oldValue + "\" заменено на \"" + todoList.get(index) + "\"");
        }

    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return new ArrayList<>();
    }

}