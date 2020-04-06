import java.util.HashMap;
import java.util.Map;

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

        int fieldDimension = 400;

        String[][] populatedGraph = populateGraph(input, fieldDimension);
        printGraph(populatedGraph, fieldDimension);
        Map<String, Integer> countedNodes = countNodeAreas(populatedGraph, fieldDimension);
        System.out.println("Biggest area that is not infinite is: " + findMaxValueInMap(countedNodes));
    }

    public static String[][] populateGraph(String input, int fieldDimension) {
        String nodeCoordinates[] = input.split("[\n]");
        String[][] field = new String[fieldDimension][fieldDimension];


        for (int xField = 0; xField < field.length; xField++) {
            for (int yField = 0; yField < field[fieldDimension - 1].length; yField++) {

                int lowestManhattanDistance = Integer.MAX_VALUE;
                int lowestSameManhattanDistancOfTwoPoints = 0;
                int selectedNode = 0;

                if (xField == 4 && yField == 4) {
                    System.out.println("");
                }
                for (int nodeNumber = 0; nodeNumber < nodeCoordinates.length; nodeNumber++) {
                    String[] nodePosition = nodeCoordinates[nodeNumber].split(",");
                    int xNode = Integer.valueOf(nodePosition[0].trim());
                    int yNode = Integer.valueOf(nodePosition[1].trim());
                    int manhattanDistance = Math.abs(xField - xNode) + Math.abs(yField - yNode);

                    if (manhattanDistance == 0) {
                        lowestManhattanDistance = 0;
                        selectedNode = nodeNumber;
                    } else if (manhattanDistance == lowestManhattanDistance) {
                        lowestSameManhattanDistancOfTwoPoints = manhattanDistance;
                        lowestManhattanDistance = -1;
                        selectedNode = nodeNumber;
                    } else if (manhattanDistance < lowestManhattanDistance) {
                        selectedNode = nodeNumber;
                        lowestManhattanDistance = manhattanDistance;
                    } else if (manhattanDistance < lowestSameManhattanDistancOfTwoPoints) {
                        selectedNode = nodeNumber;
                        lowestManhattanDistance = manhattanDistance;
                        lowestSameManhattanDistancOfTwoPoints = 0;
                    } else if (manhattanDistance == lowestManhattanDistance) {
                        selectedNode = nodeNumber;
                        lowestManhattanDistance = -1;
                    }
                }

                if (lowestManhattanDistance > 0) {
//                    field[xField][yField] = String.valueOf(lowestManhattanDistance);
                    field[xField][yField] = String.valueOf(selectedNode);
                } else if (lowestManhattanDistance == -1) {
                    field[xField][yField] = ".";
                } else if (lowestManhattanDistance == 0) {
                    field[xField][yField] = String.valueOf(selectedNode);
//                    field[xField][yField] = "0";
                }
            }
        }
        return field;
    }

    public static void printGraph(String[][] field, int fieldDimension) {
        for (int yField = 0; yField < field[fieldDimension - 1].length; yField++) {
            for (int xField = 0; xField < field.length; xField++) {
                System.out.print(field[xField][yField] + " ");
            }
            System.out.println();
        }

    }

    public static Map<String, Integer> countNodeAreas(String[][] field, int fieldDimension) {
        Map<String, Integer> nodeSize = new HashMap<String, Integer>();
        int test = 0;

        for (int xField = 0; xField < field.length; xField++) {
            for (int yField = 0; yField < field[fieldDimension - 1].length; yField++) {
                if (field[xField][yField].equals("3")) {
//                    System.out.println(++test);
                }
                if (nodeSize.containsKey(field[xField][yField])) {
                    int currentValue = 0;
                    if (xField == 0 || yField == 0 || xField == fieldDimension-1 || yField == fieldDimension-1) {
                        currentValue = Integer.MIN_VALUE;
                    } else {
                    currentValue = nodeSize.get(field[xField][yField]);
                    }
                    nodeSize.put(field[xField][yField], ++currentValue);
                } else {
                    nodeSize.put(field[xField][yField], 1);
                }
            }
        }
        return nodeSize;
    }

    public static <K, V extends Comparable<V>> V findMaxValueInMap(Map<K, V> nodeSize) {
        Map.Entry<K, V> maxEntry = null;
        for (Map.Entry<K, V> entry : nodeSize.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getValue();
    }
}
