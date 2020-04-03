import java.util.ArrayList;
import java.util.List;

public class Day06 {

    public static void main(String[] args) {
        String input = "69, 102\n" +
                "118, 274\n" +
                "150, 269\n" +
                "331, 284\n" +
                "128, 302\n" +
                "307, 192\n" +
                "238, 52\n" +
                "240, 339\n" +
                "111, 127\n" +
                "180, 156\n" +
                "248, 265\n" +
                "160, 69\n" +
                "58, 136\n" +
                "43, 235\n" +
                "154, 202\n" +
                "262, 189\n" +
                "309, 53\n" +
                "292, 67\n" +
                "335, 198\n" +
                "99, 199\n" +
                "224, 120\n" +
                "206, 313\n" +
                "359, 352\n" +
                "101, 147\n" +
                "301, 47\n" +
                "255, 347\n" +
                "121, 153\n" +
                "264, 343\n" +
                "252, 225\n" +
                "48, 90\n" +
                "312, 139\n" +
                "90, 277\n" +
                "203, 227\n" +
                "315, 328\n" +
                "330, 81\n" +
                "190, 191\n" +
                "89, 296\n" +
                "312, 255\n" +
                "218, 181\n" +
                "299, 149\n" +
                "151, 254\n" +
                "209, 212\n" +
                "42, 76\n" +
                "348, 183\n" +
                "333, 227\n" +
                "44, 210\n" +
                "293, 356\n" +
                "44, 132\n" +
                "175, 77\n" +
                "215, 109";

        String testInput = "1, 1\n" +
                "1, 6\n" +
                "8, 3\n" +
                "3, 4\n" +
                "5, 5\n" +
                "8, 9";

        populateGraph(input);
    }

    public static void populateGraph(String input) {
        String nodeCoordinates[] = input.split("[\n]");
        String[][] field = new String[10][10];
        List<Day06Node> nodes = new ArrayList<Day06Node>();

        Day06Node nodeA = new Day06Node();
        Day06Node nodeC = new Day06Node();

        nodeA.setX(1);
        nodeA.setY(1);
        nodeA.setName("A");
        field[nodeA.getX()][nodeA.getY()] = nodeA.getName();

        nodeC.setX(8);
        nodeC.setY(3);
        nodeC.setName("C");
        field[nodeC.getX()][nodeC.getY()] = nodeC.getName();

        nodes.add(nodeA);
        nodes.add(nodeC);


        for (int xField = 0; xField < field.length; xField++) {
            for (int yField = 0; yField < field[9].length; yField++) {

                int lowestManhattanDistance = Integer.MAX_VALUE;
                for (Day06Node node : nodes) {
                    int manhattanDistance = Math.abs(xField - node.getX()) + Math.abs(yField - node.getY());
                    if(manhattanDistance<lowestManhattanDistance){
                        lowestManhattanDistance =manhattanDistance;
                    } else if(manhattanDistance==lowestManhattanDistance){
                        lowestManhattanDistance = 0;
                    }
                }

                if (lowestManhattanDistance != 0) {
                    field[xField][yField] = String.valueOf(lowestManhattanDistance);
                }
            }
        }
        System.out.println();

        for (int yField = 0; yField < field[9].length; yField++) {
            for (int xField = 0; xField < field.length; xField++) {
                System.out.print(field[xField][yField] + " ");
            }
            System.out.println();
        }
    }
}
