import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // Добавляет переданное дело в конец списка
        todoList.add(todo);
        System.out.println("Добавлено дело \"" + todo + "\"");
    }

    public void add(int index, String todo) {
        // Добавляет дело на указаный индекс.
        // Проверяет возможность добавления по индексу.
        // Если проверку не проходит, то добавляет в конец списка

        if (index >= 0 && index <= todoList.size()) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }

        System.out.println("Добавлено дело \"" + todo + "\"");
    }

    public void edit(String todo, int index) {
        // Заменяет дело на index переданным делом,
        // Проверяет возможность изменения.
        // Если проверку не проходит, то ничего не делает.

        if (index >= 0 && index < todoList.size()) {
            String oldValue = todoList.get(index);
            todoList.set(index, todo);
            System.out.println("Дело \"" + oldValue + "\" заменено на \"" + todoList.get(index) + "\"");
        }

    }

    public void delete(int index) {
        // Удаляет дело, находящееся по переданному индексу.
        // Проверяет возможность удаления дела.

        if (index >= 0 && index < todoList.size()) {
            String exValue = todoList.get(index);
            todoList.remove(index);
            System.out.println("Дело \"" + exValue + "\" удалено");
        } else {
            System.out.println("Дело с таким номером не существует");
        }

    }

    public ArrayList<String> getTodos() {
        // Возвращает список дел



//        ArrayList<String> listTodos = new ArrayList<>();
//
//        for (int i = 0; i < todoList.size(); i++) {
//            listTodos.add(i + " - " + todoList.get(i));       //TODO в нужный формат выводить уже в main'е
//        }
//        return listTodos;
        return todoList;
    }

}