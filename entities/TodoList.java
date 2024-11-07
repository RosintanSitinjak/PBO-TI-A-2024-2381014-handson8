package entities;

public class TodoList {
    private String todo;
    private int id;

//    Constructor
    public TodoList() {
    }
    //Getter - nge get
    public String getTodo() {
        return todo;
    }
    //Setter
    public void setTodo(String todo) {
        this.todo = todo;
    }
    //Getter
    public int getId() {
        return id;
    }
    //Setter - nge set
    public void setId(int id) {
        this.id = id;
    }
}
