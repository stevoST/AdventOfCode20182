import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day07 {

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


        String[] inputArray = input.split("\n");
        String[] inputSortedBySecondLetter = new String[101];

        Multimap<Character, Character> preLetterMap = HashMultimap.create();
        Multimap<Character, Character> postLetterMap = HashMultimap.create();
        Set<Character> availableLetters = new HashSet<Character>();


        for (int line = 0; line < inputArray.length; line++) {

            Pattern pattern = Pattern.compile("Step ([A-Z]).+step ([A-Z]).+");
            Matcher matcher = pattern.matcher(inputArray[line]);

            char firstLetter = '.';
            char lastLetter = '.';
            while (matcher.find()) {
                firstLetter = (matcher.group(1)).charAt(0);
                lastLetter = (matcher.group(2)).charAt(0);
            }

            preLetterMap.put(lastLetter, firstLetter);
            postLetterMap.put( firstLetter,lastLetter);
            availableLetters.add(firstLetter);
            availableLetters.add(lastLetter);
        }

        availableLetters.removeAll(preLetterMap.keys());
        char rootLeter = availableLetters.iterator().next().charValue();
        availableLetters.remove(rootLeter);

        Collection<Character> childs = postLetterMap.get(rootLeter);
        for (Character childLetter : childs){
            availableLetters.add(childLetter);
            System.out.println(childLetter);
        }

        LinkedHashSet<Character> finalLetters = new LinkedHashSet<>();
        finalLetters.add(rootLeter);

        char lowestLetter = '^';
        for(Character letter : availableLetters){
            if(letter < lowestLetter){
                lowestLetter = letter;
            }
        }
        finalLetters.add(lowestLetter);
        availableLetters.remove(lowestLetter);



        childs = postLetterMap.get(lowestLetter);
        lowestLetter = '^';
        for(Character letter : childs){
            if(letter < lowestLetter){
                lowestLetter = letter;
            }
        }

        finalLetters.add(lowestLetter);
        childs.remove(lowestLetter);
        availableLetters.addAll(childs);



        childs = postLetterMap.get(lowestLetter);
        lowestLetter = '^';
        for(Character letter : childs){
            if(letter < lowestLetter){
                lowestLetter = letter;
            }
        }
        if(!postLetterMap.get(lowestLetter).isEmpty()) {
            finalLetters.add(lowestLetter);
        }
        childs.remove(lowestLetter);
        availableLetters.addAll(childs);

        char lastLetterInWord = '^';
        Collection<Character> previousLetters = null;
        if(postLetterMap.get(lowestLetter).isEmpty()){
            lastLetterInWord = lowestLetter;
            previousLetters = preLetterMap.get(lastLetterInWord);
            previousLetters.removeAll(finalLetters);
            System.out.println();
        }


        System.out.println();
    }
}
