import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to TO-DO App");
        displayMenu();
        int choice = Integer.parseInt(sc.nextLine());
        if(choice<1 && choice >5){
            System.out.println("Please enter a valid option");
            displayMenu();
        }
        while(choice!=5){
            if(choice==1){
                createToDo();
                System.out.println("1. Add more ToDos");
                System.out.println("2. Back to main menu");
                int num=Integer.parseInt(sc.nextLine());
                if(num==1){
                    createToDo();
                }
                else if(num==2){
                    displayMenu();
                }
                else{
                    System.out.println("Enter a valid response");
                    createToDo();
                }
            }
            else if(choice==2){
                listAllToDos();
            }
            else if(choice==3){
//                yourHistory();
            }
            else if(choice==4){
//                editOptions();
            }
            else{
                System.out.println("Thank you for your time...!");
            }
        }
    }

    private static void listAllToDos() {
        System.out.println(ToDo.todos);
    }

    private static void createToDo() {
        System.out.println("Enter ToDo Id");
        int id=Integer.parseInt(sc.nextLine());
        System.out.println("Enter a goal");
        String goal=sc.nextLine();

        Task task=new Task(id,goal);
        ToDo.todos.add(String.valueOf(task));
    }

    private static void displayMenu() {
        System.out.println("1. Create a To-Do");
        System.out.println("2. List all To-Dos");
        System.out.println("3. Your History");
        System.out.println("4. Edit Options");
        System.out.println("5. Exit");
        System.out.println();
        System.out.println("Enter your choice: ");
    }
}


