import com.google.common.collect.Sets;
import org.javatuples.Pair;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day07part2 {

    public static void main(String[] args) {
        String input = "Step S must be finished before step B can begin.\n" +
                "Step B must be finished before step Y can begin.\n" +
                "Step R must be finished before step E can begin.\n" +
                "Step H must be finished before step M can begin.\n" +
                "Step C must be finished before step F can begin.\n" +
                "Step K must be finished before step A can begin.\n" +
                "Step V must be finished before step W can begin.\n" +
                "Step W must be finished before step L can begin.\n" +
                "Step J must be finished before step L can begin.\n" +
                "Step Q must be finished before step A can begin.\n" +
                "Step U must be finished before step L can begin.\n" +
                "Step Y must be finished before step M can begin.\n" +
                "Step T must be finished before step F can begin.\n" +
                "Step D must be finished before step A can begin.\n" +
                "Step I must be finished before step M can begin.\n" +
                "Step O must be finished before step P can begin.\n" +
                "Step A must be finished before step L can begin.\n" +
                "Step P must be finished before step N can begin.\n" +
                "Step X must be finished before step Z can begin.\n" +
                "Step G must be finished before step N can begin.\n" +
                "Step M must be finished before step F can begin.\n" +
                "Step N must be finished before step L can begin.\n" +
                "Step F must be finished before step Z can begin.\n" +
                "Step Z must be finished before step E can begin.\n" +
                "Step E must be finished before step L can begin.\n" +
                "Step O must be finished before step X can begin.\n" +
                "Step B must be finished before step V can begin.\n" +
                "Step H must be finished before step Q can begin.\n" +
                "Step T must be finished before step M can begin.\n" +
                "Step A must be finished before step G can begin.\n" +
                "Step R must be finished before step H can begin.\n" +
                "Step S must be finished before step C can begin.\n" +
                "Step N must be finished before step Z can begin.\n" +
                "Step Z must be finished before step L can begin.\n" +
                "Step Q must be finished before step Z can begin.\n" +
                "Step R must be finished before step G can begin.\n" +
                "Step P must be finished before step Z can begin.\n" +
                "Step U must be finished before step M can begin.\n" +
                "Step W must be finished before step D can begin.\n" +
                "Step F must be finished before step L can begin.\n" +
                "Step D must be finished before step P can begin.\n" +
                "Step I must be finished before step E can begin.\n" +
                "Step M must be finished before step E can begin.\n" +
                "Step H must be finished before step N can begin.\n" +
                "Step F must be finished before step E can begin.\n" +
                "Step D must be finished before step L can begin.\n" +
                "Step C must be finished before step E can begin.\n" +
                "Step H must be finished before step Z can begin.\n" +
                "Step W must be finished before step Q can begin.\n" +
                "Step X must be finished before step E can begin.\n" +
                "Step G must be finished before step M can begin.\n" +
                "Step X must be finished before step M can begin.\n" +
                "Step Y must be finished before step P can begin.\n" +
                "Step S must be finished before step I can begin.\n" +
                "Step P must be finished before step X can begin.\n" +
                "Step S must be finished before step T can begin.\n" +
                "Step I must be finished before step N can begin.\n" +
                "Step P must be finished before step L can begin.\n" +
                "Step C must be finished before step X can begin.\n" +
                "Step I must be finished before step G can begin.\n" +
                "Step O must be finished before step F can begin.\n" +
                "Step I must be finished before step X can begin.\n" +
                "Step C must be finished before step Z can begin.\n" +
                "Step B must be finished before step K can begin.\n" +
                "Step T must be finished before step P can begin.\n" +
                "Step Q must be finished before step X can begin.\n" +
                "Step M must be finished before step N can begin.\n" +
                "Step H must be finished before step O can begin.\n" +
                "Step Q must be finished before step M can begin.\n" +
                "Step U must be finished before step F can begin.\n" +
                "Step Y must be finished before step O can begin.\n" +
                "Step D must be finished before step O can begin.\n" +
                "Step R must be finished before step T can begin.\n" +
                "Step A must be finished before step E can begin.\n" +
                "Step A must be finished before step M can begin.\n" +
                "Step C must be finished before step N can begin.\n" +
                "Step G must be finished before step E can begin.\n" +
                "Step C must be finished before step Y can begin.\n" +
                "Step A must be finished before step Z can begin.\n" +
                "Step S must be finished before step X can begin.\n" +
                "Step V must be finished before step Z can begin.\n" +
                "Step Q must be finished before step I can begin.\n" +
                "Step P must be finished before step E can begin.\n" +
                "Step D must be finished before step F can begin.\n" +
                "Step M must be finished before step Z can begin.\n" +
                "Step U must be finished before step N can begin.\n" +
                "Step Q must be finished before step L can begin.\n" +
                "Step O must be finished before step Z can begin.\n" +
                "Step N must be finished before step E can begin.\n" +
                "Step S must be finished before step W can begin.\n" +
                "Step S must be finished before step O can begin.\n" +
                "Step U must be finished before step T can begin.\n" +
                "Step A must be finished before step P can begin.\n" +
                "Step J must be finished before step I can begin.\n" +
                "Step A must be finished before step F can begin.\n" +
                "Step U must be finished before step D can begin.\n" +
                "Step W must be finished before step X can begin.\n" +
                "Step O must be finished before step L can begin.\n" +
                "Step J must be finished before step D can begin.\n" +
                "Step R must be finished before step Z can begin.\n" +
                "Step O must be finished before step N can begin.";

        String testInput = "Step C must be finished before step A can begin.\n" +
                "Step C must be finished before step F can begin.\n" +
                "Step A must be finished before step B can begin.\n" +
                "Step A must be finished before step D can begin.\n" +
                "Step B must be finished before step E can begin.\n" +
                "Step D must be finished before step E can begin.\n" +
                "Step F must be finished before step E can begin.";


        int numberOfWorkers = 5;
        String[] inputArray = testInput.split("\n");
        List<Pair<Integer, Character>> workersList = new ArrayList<>();
        Pair<Integer, Character>[] workersArray = new Pair[numberOfWorkers];
        Set<Character> availableLetters = new HashSet<>();
        List<Character> finalWord = new ArrayList<>();
        List<char[]> relatedLettersList = new ArrayList<>();
        int time = 0;

        for (int line = 0; line < inputArray.length; line++) {

            Pattern pattern = Pattern.compile("Step ([A-Z]).+step ([A-Z]).+");
            Matcher matcher = pattern.matcher(inputArray[line]);

            char firstLetter = '.';
            char lastLetter = '.';
            while (matcher.find()) {
                firstLetter = (matcher.group(1)).charAt(0);
                lastLetter = (matcher.group(2)).charAt(0);
            }
            availableLetters.add(firstLetter);
            availableLetters.add(lastLetter);

            char[] relatedLetters2 = new char[2];
            relatedLetters2[0] = firstLetter;
            relatedLetters2[1] = lastLetter;
            relatedLettersList.add(relatedLetters2);

        }


        while (!relatedLettersList.isEmpty()) {
            Set<Character> preConditions = new HashSet<>();
            Set<Character> postConditions = new HashSet<>();
            SortedSet<Character> candidates = new TreeSet<>();

            for (char[] relatedLetter : relatedLettersList) {
                preConditions.add(relatedLetter[0]);
                postConditions.add(relatedLetter[1]);
            }
            char posledneSlovo = Sets.difference(preConditions, postConditions).iterator().next().charValue();

            for (int line = 0; line < relatedLettersList.size(); line++) {
                char preCondLetter = relatedLettersList.get(line)[0];
                if (!postConditions.contains(preCondLetter)) {
                    candidates.add(preCondLetter);
                }
            }
//                System.out.println(candidates);

            char finalLetter = candidates.iterator().next().charValue();
            Iterator iterator = candidates.iterator();
            int workerNumber = 0;
            while (iterator.hasNext()){
                char candidate = (char) iterator.next();
                int letterTime = candidate-64;
                if(workersList.size()<=numberOfWorkers) {
                    workersList.add(Pair.with(letterTime, candidate));
                }
                workersArray[workerNumber++] = Pair.with(letterTime,candidate);
            }
//            Arrays.sort(workersArray);

            Collections.sort(workersList,(Pair<Integer,Character> p1,Pair<Integer,Character> p2)->p1.getValue0().compareTo(p2.getValue0()));
//            System.out.println(Arrays.toString(workersArray));
            System.out.println(workersList);

            relatedLettersList.removeIf(letter -> letter[0] == finalLetter);
        }

        System.out.println(finalWord.toString().replaceAll(", ", ""));
        System.out.println(time);

    }
}
