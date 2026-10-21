package branching.statementslabeled.pkgbreak.labeled.pkgcontinue;

public class BranchingStatementsLabeledBreakLabeledContinue {

    public static void main(String[] args) {
        stop: {
            for (int row = 1; row <= 5; row++) {
                for (int column = 1; column <= 5; column++) {
                    if (column > row) {
                        continue; 
                    }
                    System.out.print("* "); // Optional: Changed to print to format a triangle
                }
                System.out.println("");
            }
        }
    }
}
