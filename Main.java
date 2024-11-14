//import repositories.TodoListRepository;
//import repositories.TodoListRepositorylmpl;
//import services.TodoListService;
//import services.TodoListServicelmpl;
//import views.TodoListTerminalView;
//import views.TodoListView;
//
//public class Main {
//    public static void main(String[] args) {
//        TodoListRepository todoListRepository = new TodoListRepositorylmpl();
//        TodoListService todoListService = new TodoListServicelmpl(todoListRepository);
//        TodoListView todoListView = new TodoListTerminalView(todoListService);
//        todoListView.run();
//    }
//}
//

import config.Database;
import repositories.TodoListRepository;
import repositories.TodoListRepositoryDblmpl;
import services.TodoListService;
import services.TodoListServicelmpl;
import views.TodoListTerminalView;
import views.TodoListView;

public class Main {
    public static void main(String[] args) {

        Database database = new Database("my_database", "root", "", "localhost", "3306");
        database.setup();

        TodoListRepository todoListRepository = new TodoListRepositoryDblmpl(database);
        TodoListService todoListService =new TodoListServicelmpl(todoListRepository);
        TodoListView todoListView = new TodoListTerminalView(todoListService);
        todoListView.run();
    }
}