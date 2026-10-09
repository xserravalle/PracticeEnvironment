public class JavaUniqueGroups {
    // CALCULATE THE NUMBER OF 3-PERSON TEAMS FORMED FROM m MEN AND w WOMEN SUCH THAT
    // EACH GROUP CONTAINS AT LEAST ONE MAN AND ONE WOMAN.
    // VALID CONFIGURATIONS: MMW, WWM

    public static int countTeams (int m, int w) {
        // GUARD CLAUSE: BAIL IF ANY CONDITION FAILS
        if (m < 1 || w < 1 || (m+w) < 3) {
            return 0;
        }

        // RETURN ARITHMETICAL EVALUATION
        return (m * w * (m + w - 2)) / 2;
    }

    public static void main(String[] args) {
        // HAPPY CASES
        System.out.println("Test (m=2, w=2): " + countTeams(2,2));
        System.out.println("Test (m=3, w=4): " + countTeams(3, 4));

        // EDGE CASES
        System.out.println("Test (m=2, w=2): " + countTeams(0,5));
        System.out.println("Test (m=5, w=0): " + countTeams(5, 0));
        System.out.println("Test (m=1, w=1): " + countTeams(1, 1));
    }
}
