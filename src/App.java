public class App {
    public static void main(String[] args) throws Exception {
        Chess c = new Chess(5, 4, 6, 7);
        int score = 2;
        int cnt = 0;
        int testNum = 1;
        String[] testsA = new String[100];
        System.out.println("board status: " + c);
        // test 1
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getRookRow";
        if (c.getRookRow() == 5)
            ++score;
        score *= 2;
        // test 2
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getRookCol";
        if (c.getRookCol() == 4)
            ++score;
        score *= 2;
        // test 3
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getBishopRow";
        if (c.getBishopRow() == 6)
            ++score;
        score *= 2;
        // test 4
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getBishopCol";
        if (c.getBishopCol() == 7)
            ++score;
        score *= 2;

        // test 5
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getBiggestCol";
        if (c.getBiggestCol() == 7)
            ++score;
        score *= 2;

        c.setBishopCol(4);
        System.out.println("board status: " + c);
        // test 6
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getBiggestCol";
        if (c.getBiggestCol() == 4)
            ++score;
        score *= 2;

        c.setRookCol(6);
        System.out.println("board status: " + c);
        // test 7
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getBiggestCol";
        if (c.getBiggestCol() == 6)
            ++score;
        score *= 2;

        // test 8
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getRookSquareColor";
        if (c.getRookSquareColor() == "Black" || c.getRookSquareColor() == "black")
            ++score;
        score *= 2;

        c.setRookRow(c.getRookRow() + 1);
        System.out.println("board status: " + c);
        // test 9
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "getRookSquareColor";
        if (c.getRookSquareColor() == "White" || c.getRookSquareColor() == "white")
            ++score;
        score *= 2;

        // test 10
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "isOnSameColor";
        if (c.areOnSameColor())
            ++score;
        score *= 2;

        c.setBishopCol(c.getBishopCol() + 1);
        System.out.println("board status: " + c);
        // test 11
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "isOnSameColor";
        if (!c.areOnSameColor())
            ++score;
        score *= 2;

        // test 12
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "colDistance";
        if (c.colDistance() == 1)
            ++score;
        score *= 2;

        c.setBishopCol(c.getRookCol());
        System.out.println("board status: " + c);
        // test 13
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "colDistance";
        if (c.colDistance() == 0)
            ++score;
        score *= 2;

        // test 14
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "isRookInFirstRow";
        if (!(c.isRookInFirstRow()))
            ++score;
        score *= 2;

        c.setRookRow(1);
        System.out.println("board status: " + c);
        // test 15
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "isRookInFirstRow";
        if (c.isRookInFirstRow())
            ++score;
        score *= 2;

        c.setRookCol(8);
        System.out.println("board status: " + c);
        // test 16
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "isRookInFirstRow";
        if (!(c.isRookInFirstRow()))
            ++score;
        score *= 2;

        // test 17
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "rookThreatsBishop";
        if (!(c.rookThreatsBishop()))
            ++score;
        score *= 2;

        c.setBishopCol(8);
        System.out.println("board status: " + c);
        // test 18
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "rookThreatsBishop";
        if ((c.rookThreatsBishop()))
            ++score;
        score *= 2;

        // test 19
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "bishopThreatsRook";
        if (!(c.bishopThreatsRook()))
            ++score;
        score *= 2;

        c.setBishopCol(4);
        c.setRookRow(2);
        System.out.println("board status: " + c);
        // test 20
        System.out.println("Running test number " + testNum++);
        testsA[++cnt] = "bishopThreatsRook";
        if ((c.bishopThreatsRook()))
            ++score;
        score *= 2;

        System.out.println("\n\nTests results:\n---------------------------");

        score /= 2;

        boolean passed = true;
        int tests_num = (int) Math.ceil(log2(score)) - 1;
        // System.out.println("score: " + score + ", in tests: " + tests_num);

        if (tests_num == log2(score) - 1) {
            System.out.println("You Failed all tests: " + tests_num);
        } else {
            while (score > 1) {
                if (score % 2 == 0) {
                    System.out.println("You failed test #" + tests_num + " named: " + testsA[tests_num]);
                    passed = false;
                }
                score /= 2;
                --tests_num;
            }
        }
        if (passed) {
            System.out.println("You Passed all tests");
        }
    }

    public static double log2(int x) {
        return (Math.log(x) / Math.log(2));
    }

}
