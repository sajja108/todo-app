package first.todoproject.models;

public class todo {
    private long id;
    private String title;
    private boolean completed;

    public todo() {

    }
public todo(long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
}
public long getId() {
        return id;
}
public void setId(long id) {
this.id = id;
        }
public String getTitle() {
        return title;
}
public void setTitle(String title) {
        this.title = title;
}
public boolean isCompleted() {
        return completed;
}
public void setCompleted(boolean completed) {
        this.completed = completed;
 }
}
