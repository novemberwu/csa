package ch6_searching;

public class TowerOfHanoi {

    /**
     * Helper method to print the movement of a single disk.
     */
    public static void moveDisk(int diskNumber, String fromPeg, String toPeg) {
        System.out.println("Move disk " + diskNumber + " from " + fromPeg + " to " + toPeg);
    }

    /**
     * Recursive method to solve the Tower of Hanoi puzzle.
     */
    public static void solve(int n, String start, String helper, String end) {
        // 1. Base Case: If n == 1, use the moveDisk helper
        if (n == 1) {
            moveDisk(1, start, end);
            return;
        }


        // 2. Recursive Case (n > 1):
        // Step A: Move n-1 disks from 'start' to 'helper' (using 'end' as the temporary peg)
        solve(n - 1, start, end, helper);


        // Step B: Use moveDisk to move the nth (largest) disk from 'start' to 'end'
        moveDisk(n, start, end);


        // Step C: Move n-1 disks from 'helper' to 'end' (using 'start' as the temporary peg)
        solve(n - 1, helper, start, end);

    }

    public static void main(String[] args) {
        int numberOfDisks = 3;
        solve(numberOfDisks, "Peg A", "Peg B", "Peg C");
    }
}

