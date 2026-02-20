import java.util.LinkedList;

public class RecentAccessHistory {
    private static final int LIMIT = 5;
    private LinkedList<String> accesses = new LinkedList<>();

    public void registerAccess(String username) {
        accesses.addFirst(username);
        if (accesses.size() > LIMIT) {
            accesses.removeLast();
        }
    }

    public void printHistory() {
        System.out.println("Recent accesses:");
        for (String username : accesses) {
            System.out.println(username);
        }
    }

    public static void main(String[] args) {
        RecentAccessHistory history = new RecentAccessHistory();
        history.registerAccess("Alice");
        history.registerAccess("Bob");
        history.registerAccess("Charlie");
        history.registerAccess("David");
        history.registerAccess("Eve");
        history.registerAccess("Frank");
        history.printHistory();
    }
}