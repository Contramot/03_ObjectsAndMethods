import java.util.ArrayList;

public class  Main {
    //private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        TodoList myTodoList = new TodoList();
        myTodoList.add("Learn Java");
        myTodoList.add("perekur");

        myTodoList.add(4,"continue Learn Java");

        myTodoList.edit("no smoking", 1);

        //myTodoList.getTodos();

        //System.out.println(myTodoList.getTodos().get(0));
    }
}
