package recursion.recursive.methods.part.pkg2;

public class RecursionRecursiveMethodsPart2 {

    // 1. Declare n1, n2, and n3 as static class fields so printFib can access them
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFib(int n) {
        if (n > 0) {
            n3 = n1 + n2;
            n1 = n2;          // Move n2 to n1
            n2 = n3;          // Move the new sum to n2
            System.out.print(" " + n3);
            printFib(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        int num = 5; // Fixed the typo from 'nim' to 'num'
        
        // Print the first two base elements (0 and 1)
        System.out.print(n1 + " " + n2);
        
        // Pass num - 2 since the first two elements are already printed
        printFib(num - 5); 
        System.out.println(); // New line at the end
    }
}
