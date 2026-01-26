package Portfolio;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); // ✅ consume newline after menu choice

            switch (choice) {

                case 1:
                    int id = service.generatedID();

                    System.out.println("Enter title: ");
                    String title = sc.nextLine();

                    System.out.println("Enter description: ");
                    String description = sc.nextLine();

                    System.out.println("Enter status (true/false): ");
                    boolean status = sc.nextBoolean();
                    sc.nextLine(); // ✅ consume newline after boolean

                    try {
                        service.addTask(new Task(id, title, description, status));
                        System.out.println("Task is added!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage()); // ✅ don't throw
                    }
                    break;

                case 2:
                    List<Task> tasks2 = service.getAllTasks();
                    if (tasks2.isEmpty()) {
                        System.out.println("No tasks!");
                    } else {
                        for (int i = 0; i < tasks2.size(); i++) {
                            System.out.println(tasks2.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task id to activate: ");
                    int id1 = sc.nextInt();
                    sc.nextLine(); // ✅ consume newline

                    boolean tasks1 = service.activateStatusbyId(id1);
                    System.out.println(tasks1 ? "Activated." : "Task not found.");
                    break;

                case 4:
                    System.out.print("Enter task id to delete: ");
                    int id2 = sc.nextInt();
                    sc.nextLine(); // ✅ consume newline

                    boolean tasks3 = service.removeTaskbyId(id2);
                    System.out.println(tasks3 ? "Deleted." : "Task not found.");
                    break;

                case 5:
                    System.out.print("Enter task id to deactivate: ");
                    int id5 = sc.nextInt();
                    sc.nextLine(); // ✅ consume newline

                    boolean tasks4 = service.deactivateStatusbyId(id5);
                    System.out.println(tasks4 ? "Deactivated." : "Task not found.");
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("----------------------------------");
        }

        sc.close();
        System.out.println("Exit");
    }

    public static void printMenu() {
        System.out.println("1. Create new task");
        System.out.println("2. Read tasks");
        System.out.println("3. Update status task");
        System.out.println("4. Delete task by id");
        System.out.println("5. Deactivate status task");
        System.out.println("0. Exit");
    }
}
