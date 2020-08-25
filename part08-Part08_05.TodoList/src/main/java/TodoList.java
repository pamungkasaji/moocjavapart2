
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jere
 */
public class TodoList {

    private List<String> toDo;

    public TodoList(){
        toDo = new ArrayList<>();
    }

    public void add(String task){
        toDo.add(task);
    }

    public void remove(int number){
        toDo.remove(number - 1);
    }

    public void print(){
        for (String string : toDo){
            System.out.println((toDo.indexOf(string) + 1) + ": " + string);
        }
    }
}
