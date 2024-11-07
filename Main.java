import repositories.TodoListRepository;
import repositories.TodoListRepositorylmpl;
import services.TodoListService;
import services.TodoListServicelmpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositorylmpl();
        TodoListService todoListService = new TodoListServicelmpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}

