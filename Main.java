package Assignment1;

/*Code created by Julia Marques Batista
Jan 28, 2025 - 1:27 PM*/

public class Main implements TaskAssigner{

    public static void main(String[] args) {

        //// Implement the functional interface using a lambda expression
        TaskAssigner assigner = ((studentName, task) -> System.out.println("Student: " +studentName + "\nAssigned Task: " + task + "\n"));

        // Demonstrate the program with three examples
        assigner.assignTask("Alice", "Complete the Math worksheet");
        assigner.assignTask("Bob", "Write a Java program using functional interfaces");
        assigner.assignTask("Charlie", "Prepare a presentation on lambda expressions");

    }

    @Override
    public void assignTask(String studentName, String task) {

    }
}//end of class

