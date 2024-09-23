import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ToDoList {
    private List<String> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }
    public void updateTask(int index, String newTaskDescription) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTaskDescription);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks in the list:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}

 class ToDoListApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nTo-Do List Application:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    toDoList.displayTasks();
                    System.out.print("Enter the task number to update: ");
                    int updateIndex = scanner.nextInt() - 1;  
                    scanner.nextLine();  
                    System.out.print("Enter the new task description: ");
                    String newDescription = scanner.nextLine();
                    toDoList.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    toDoList.displayTasks();
                    System.out.print("Enter the task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;  
                    toDoList.removeTask(removeIndex);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting To-Do List Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
