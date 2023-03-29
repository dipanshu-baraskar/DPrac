package zz;

// A Java program to count all possible paths
// from top left to bottom right

class GFG {

    // Returns count of possible paths to reach
    // cell at row number m and column number n
    // from the topmost leftmost cell (cell at 1, 1)
    static int numberOfPaths(int m, int n) {
        System.out.print(m+" ");
        System.out.println(n);
        if (m == 1 || n == 1) {
            return 1;
        }
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1) + numberOfPaths(m - 1, n - 1);
    }

    // Driver code
    public static void main(String args[]) {
        System.out.println(numberOfPaths(2, 2));
    }
}


