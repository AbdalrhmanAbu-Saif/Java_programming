package JavaProgramming2.Part8.ShortRecap.ToDoList;

public class MainPart1 {
    public static void main(String[] args){
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();

        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy rasins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();

    }
}
