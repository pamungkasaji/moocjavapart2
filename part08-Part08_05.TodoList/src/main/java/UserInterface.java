import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Jere
 */
public class UserInterface {

    private TodoList todoList;
    private final Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            switch (command){
                case "add":
                    System.out.print("To add: ");
                    todoList.add(scanner.nextLine());
                    break;
                case "list":
                    todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    todoList.remove(Integer.parseInt(scanner.nextLine()));
                    break;
                case "stop":
                    break;
            }
            if (command.equals("stop")){
                break;
            }
        }
    }
}
