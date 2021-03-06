import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day02 {

    public static void main(String[] args) {
        String input = "kqzxdenujwcsthbzgvyioflcsp\n" +
                "vqwxdenujwcsthbmggyioflarp\n" +
                "kqzxienujwcsthbmglyioclarp\n" +
                "kuzxdetujwcsthbmgvyioflcrp\n" +
                "kqnxdenujwcsthbmgvlooflarp\n" +
                "kqzxdknpjwcsthwmgvyioflarp\n" +
                "kgzxdenujwcsthbfgvyicflarp\n" +
                "kqzxdenujrnsthbmgjyioflarp\n" +
                "lqzxdeeujwcsthbmrvyioflarp\n" +
                "iqfxdenujwcsthbmgvyiofyarp\n" +
                "kvzxbenujwcstabmgvyioflarp\n" +
                "kmzxdenujwcsthbmglyioolarp\n" +
                "kqzxdenujhcsthbmgbyioflanp\n" +
                "nqzxdenujwcsehbmgvsioflarp\n" +
                "kqzlgenujwcsthbmgvyiofjarp\n" +
                "kqzxdyfujwcsihbmgvyioflarp\n" +
                "kqzxdsnujwcqthbmgvyiorlarp\n" +
                "kqzxdenuywcsthbmgvyinflmrp\n" +
                "knzxderujwcsthbmgvyioflaop\n" +
                "kqxxdenujwczthbmgvyioflajp\n" +
                "kqzxdevujwcsthbmgvyqoxlarp\n" +
                "kqzxdenujwclmhbmgvyioslarp\n" +
                "kqzldenujwcsthbmgvnisflarp\n" +
                "kjtxdenujwcsthbmgvyfoflarp\n" +
                "kqzxwenujwcstxbmgvyihflarp\n" +
                "kqzxdenuhecsthbmgvyeoflarp\n" +
                "kqzxdenhjwesthbmgvyioklarp\n" +
                "kqkxdenujwcsthbcgvyiofgarp\n" +
                "kqyxmenujwcsthbmgvyioflara\n" +
                "kqzxdqnrjwcwthbmgvyioflarp\n" +
                "kqzxdenufwcgyhbmgvyioflarp\n" +
                "lqzxdenujwcsthbmtvyiofearp\n" +
                "kqzxdenujwcsthbvgvthoflarp\n" +
                "kqzxeenujwcsahbmgvyioflamp\n" +
                "pqzxdenujwcsshbmjvyioflarp\n" +
                "kqzxdesujwcstdbmgvyioflatp\n" +
                "kqzxpenujwcsthimgvyioflhrp\n" +
                "kqzxdmkujwcsthbmgvpioflarp\n" +
                "kszxdenujwcsthbybvyioflarp\n" +
                "kqzxdvnujwcsthbmgvyqoslarp\n" +
                "kkzxdetujwcsthbmgvyiofltrp\n" +
                "kqzxdenujwcsthomgvyiozlaro\n" +
                "cqzfdenubwcsthbmgvyioflarp\n" +
                "kqzxdenyjwcsthbmhvyiofldrp\n" +
                "kqzxdenujwcsthbmghfiofxarp\n" +
                "kmqxdebujwcsthbmgvyioflarp\n" +
                "kqzxdenufwcsthbmvvypoflarp\n" +
                "kqnxdenujwcsthbmgvtzoflarp\n" +
                "bqzxdenujwcithbmgvyiohlarp\n" +
                "kqzxdenurwrsthbmgvyioelarp\n" +
                "kqzxdenujwcsthbmgpyiodlarl\n" +
                "kqzxdengjwcxthbmgvjioflarp\n" +
                "kizxdenujwcsnhqmgvyioflarp\n" +
                "jqzxdenajwcsthbmnvyioflarp\n" +
                "kqzcdenujwcsphbigvyioflarp\n" +
                "kezxdenujwcsthbfgvyioflaqp\n" +
                "kqzxdenujwcstybmgvyivfyarp\n" +
                "kqzxdenujwcsthbmgvbiofsnrp\n" +
                "kqzxdenujwcsthbmgvyhxfnarp\n" +
                "kvzxdenqjfcsthbmgvyioflarp\n" +
                "kqzxywnljwcsthbmgvyioflarp\n" +
                "kqzxdenujwcsbhbzgvyioxlarp\n" +
                "kqkxdenufwcsthbmgvyiofxarp\n" +
                "dqzxddnujwcsthsmgvyioflarp\n" +
                "yqrxdenujwcsthbagvyioflarp\n" +
                "kqzxdenujwcsajbmgvyiovlarp\n" +
                "kqztdunujwcsthbmgvyioilarp\n" +
                "kqzxdequjwcsthbmgvyyoflarm\n" +
                "kqzxdlnujwksthbmgvkioflarp\n" +
                "tqvxdenujwcsthbmgveioflarp\n" +
                "kqzndezupwcsthbmgvyioflarp\n" +
                "kqzctsnujwcsthbmgvyioflarp\n" +
                "kqzxdenujwmstkbmgvyioflgrp\n" +
                "kqzxdenujwzsthdmgvyiofdarp\n" +
                "kqzxdynujwcsthcmgvyioflasp\n" +
                "kqzxdesujwcstybmgcyioflarp\n" +
                "kqzxdenujwcsthbvgvyiyglarp\n" +
                "kqzxpenujwcsthbogvyioflard\n" +
                "khzxdenujwcsthbmgvyikflaep\n" +
                "kqzxdedujwchthbmgvyeoflarp\n" +
                "kxzxsepujwcsthbmgvyioflarp\n" +
                "xqzxdenujwcsthbpgvyioelarp\n" +
                "jfzxdenujwcsthbmgvyiollarp\n" +
                "kqzxcenujwcethbmgvwioflarp\n" +
                "kqzxdenujwcithbmgvysoflarg\n" +
                "kqlxdenujwnsthbmgvyiotlarp\n" +
                "wqzydenujwcsthbmgvyioftarp\n" +
                "kqzxienuwwcsthbmgayioflarp\n" +
                "kqzxdetujwcsthbmgvyhoflawp\n" +
                "kqzxdqnujwrsthbmgvyxoflarp\n" +
                "kqzxdenujwcvthbmgjiioflarp\n" +
                "kqzxdenujwcjthbxgvaioflarp\n" +
                "kqzxpenujwcsthymgvyioklarp\n" +
                "kqzxdenujwcsthbmswygoflarp\n" +
                "kqzxdenujwcsthbmgvyiaxiarp\n" +
                "kqzxdenudkcsthbmgvyzoflarp\n" +
                "kqzxdvndjwcsthbmgvyioflaxp\n" +
                "kqzxdenujwcsthbmdvymoflvrp\n" +
                "kqzxvenujwcsihbmgvyiofllrp\n" +
                "kqzxdqnujwcsthbmgtyioflprp\n" +
                "kqzxdenuuwcathbmgvsioflarp\n" +
                "kqzrdenujwesthbjgvyioflarp\n" +
                "kqzxdexujwcstzbmgvyyoflarp\n" +
                "kqzxpenujwjstabmgvyioflarp\n" +
                "kozxdenejwcsthbmgvpioflarp\n" +
                "kbzxdenvjwcsthbmgvyiofsarp\n" +
                "kolxdenujwcjthbmgvyioflarp\n" +
                "kqzxdenujwcsthbmgvyiffsakp\n" +
                "kqzxdelujwcsthbmlvyioflxrp\n" +
                "kqzxdenugwcsthrmgvyioflprp\n" +
                "kqzxdelujwcsthqmgvyiozlarp\n" +
                "kqzxienujwosthbmgvykoflarp\n" +
                "kqzxdeuujwicthbmgvyioflarp\n" +
                "kqzxdenbjwcsthbmcvyaoflarp\n" +
                "krzxdqnujwcsthbmgvyioflerp\n" +
                "wqzxzenujwcsthbmgvyioclarp\n" +
                "kqzxyenujwcsthbmgejioflarp\n" +
                "kqzxdenujwcstsbmgvtidflarp\n" +
                "kqnxdenejwcsthbmgvyioflara\n" +
                "kqzsdmnujwcsthbmgvyioflaep\n" +
                "kqzxdedujwnsthymgvyioflarp\n" +
                "kqzxdenujwusthbmgnyioflarx\n" +
                "kqzxlenujwcsthbmgayvoflarp\n" +
                "kqzxdenujwcsthbmgvyiofngrh\n" +
                "zqzxdenujwcsthbmgvyiofvxrp\n" +
                "kqzydenujwmsthbmgvyiuflarp\n" +
                "kqzxdenujkrsthbmdvyioflarp\n" +
                "kqzxdlnujocsthbmgvyiofaarp\n" +
                "kqzxdenujwcstybmgvyiofrwrd\n" +
                "kqzxdenupwksthbmgvyiofbarp\n" +
                "khzxdentjwcsthbmbvyioflarp\n" +
                "kqzxdenujwcuphbmgvyihflarp\n" +
                "kqzxdenhjwcgthbmgvyioflrrp\n" +
                "kqzxdenujwcsthbmgvyiofakhp\n" +
                "kqzxdenujwcstfkmgvyioflamp\n" +
                "kqzxdenujqcsthbmgvkiorlarp\n" +
                "kqzxdenujwcstvbmgvyioilasp\n" +
                "kqzxdxnujwcsthbpgayioflarp\n" +
                "kqzxdenupwysthbmgvyiofljrp\n" +
                "kqzxdenujwcdthbmgvymoflarv\n" +
                "kqnxdenujwcstvbmgvyixflarp\n" +
                "kqjxdenujwcsthbmgvyikflurp\n" +
                "kqsxdenulwcsthxmgvyioflarp\n" +
                "bqzxbenujwcsahbmgvyioflarp\n" +
                "vqzxdenujwcsthbmgvjzoflarp\n" +
                "kqzhfenujwcsthimgvyioflarp\n" +
                "eqzxdenujwcshhbmgnyioflarp\n" +
                "kqzxdenujucstubmgvyicflarp\n" +
                "kuzxdenuewcsthbmgvyiofuarp\n" +
                "kqzxdenulwcsthbmgpyigflarp\n" +
                "kqzxdebujwcsthbmgoyioflaro\n" +
                "kqzxdenujwcuthbmgucioflarp\n" +
                "kqzxdenujwcschpmgvyioflhrp\n" +
                "kqzxfenujwcsthbmjvrioflarp\n" +
                "kqzxdenujqcsthbmgvyndflarp\n" +
                "kqzxdgnbjwcsthbmgvywoflarp\n" +
                "kqzxdenujwcsthrmgtbioflarp\n" +
                "yqzxdenyjwcsthbmgvyioflarg\n" +
                "kqzxdenuxwxsthbmsvyioflarp\n" +
                "kqzxdenujwcsthbugqyvoflarp\n" +
                "qqzxdenujwcsahbmgoyioflarp\n" +
                "kqsxdenudwcsthbmguyioflarp\n" +
                "kqzxdenujwcstublgvyioflamp\n" +
                "kqzxdemujwtstqbmgvyioflarp\n" +
                "kqzxqvnajwcsthbmgvyioflarp\n" +
                "kqzxoennjwcstbbmgvyioflarp\n" +
                "kqzxfenujwcsthbmlvyioflwrp\n" +
                "kqzjdunujwcsthhmgvyioflarp\n" +
                "kqzxdenujwcqthbmgvyirfxarp\n" +
                "kqzxdengjwcsthbmgvyiowlgrp\n" +
                "kqgxdenujwcswhbmglyioflarp\n" +
                "mqzxdekuuwcsthbmgvyioflarp\n" +
                "kqzxdenujwdsthbmgbyiovlarp\n" +
                "krzxdenlhwcsthbmgvyioflarp\n" +
                "kqzxdenmjwcstqbmgvyioflanp\n" +
                "kqzxdenujwcmthbmgvtioflyrp\n" +
                "kqzxdenujwcsthbmgvaijflprp\n" +
                "kqzxdenuywysqhbmgvyioflarp\n" +
                "kqzxdenujwfsthbmgvyhoflark\n" +
                "nqzcdefujwcsthbmgvyioflarp\n" +
                "kqzxdenujrcsthgmgyyioflarp\n" +
                "kqzxdqnujwzsthbmgvyioftarp\n" +
                "kqzxdenujwcsthimgvyioolapp\n" +
                "kqzxdenupwcsthbmggyioflyrp\n" +
                "kqzxdjnujwcsthbvgvyioflarf\n" +
                "kqzxdtnujwasthbmgvyiofuarp\n" +
                "kqzxbensjzcsthbmgvyioflarp\n" +
                "kqzxdenujwcsphbmwiyioflarp\n" +
                "kqzgdenuowcsthbmgvyioflarh\n" +
                "kmzxdenujwasthbmgvtioflarp\n" +
                "kqzxdenujwcstybmgvyiofrard\n" +
                "vqzxdenejwcsthbmglyioflarp\n" +
                "kqhxdenujwcsmhbmgvyioflprp\n" +
                "kqzxdnnujwcsthzsgvyioflarp\n" +
                "kczxdenujwcsthbmgvyeoflaop\n" +
                "kqzxdenujwcsxhbmgvaioflaap\n" +
                "kqzxdenujwcsthbmgayiofnprp\n" +
                "kqzxdvnujwcsthbmgvyipjlarp\n" +
                "kqzxdenubwcskhbmgvyiofkarp\n" +
                "kqzxdenujwcsthbgggyigflarp\n" +
                "kqzxdenujncstabvgvyioflarp\n" +
                "kqzxdenujwcstqimqvyioflarp\n" +
                "kqzxeenujwcsdhbmgvyqoflarp\n" +
                "kcpxdenujwcsthbmgvyioilarp\n" +
                "kqwxuenujwcsthbmgvyiyflarp\n" +
                "kqzxdwnujwcstgbmgvyioplarp\n" +
                "kqzxdenuswcstvbmglyioflarp\n" +
                "kqzxdenujwcsthabgvyiwflarp\n" +
                "kqzxdpnujwcsthbmwvyiomlarp\n" +
                "kqzxdenujwcdthbmgvcioffarp\n" +
                "kqzxdenajwcsthbmtvyiofldrp\n" +
                "kqzbnenujwcshhbmgvyioflarp\n" +
                "kqzbdequiwcsthbmgvyioflarp\n" +
                "kqzxdenuswcsohbmgzyioflarp\n" +
                "kvzxdenujwcstdbmjvyioflarp\n" +
                "kqzxoenujwcqthbmpvyioflarp\n" +
                "kqzxhenujwcsthbmgoyiofoarp\n" +
                "klzxdenujwczthbmgvyioflanp\n" +
                "kqpxdenujwcsthbmgvyioflafz\n" +
                "kqkxdenujwcstxbngvyioflarp\n" +
                "kqzepenuxwcsthbmgvyioflarp\n" +
                "bqzxdenujmcithbmgvyioflarp\n" +
                "kdzxdjnujwcstnbmgvyioflarp\n" +
                "kszxdenujwcsthbmgeyiofrarp\n" +
                "kqzxdenijwcsthbmgvhiaflarp\n" +
                "kqzadenujwcbtxbmgvyioflarp\n" +
                "kqkxwenujwcsthbmgvyiowlarp\n" +
                "pqzddenujwcsthbmgvyboflarp\n" +
                "kqzxxenujwcsthbwgvyioflmrp\n" +
                "kqzxdjnujwcsthbmgvyipilarp\n" +
                "pqzxdenujwcsthbmgvyieflark\n" +
                "sqzxdenujtcsthbmgiyioflarp\n" +
                "kqzxdznujwcsthbmgvzioflajp\n" +
                "kqzxdrnujqcsthbmgvyiofvarp\n" +
                "gqzxdenujwcsthemgvlioflarp\n" +
                "kqzxdenujjcsthbmgvuiofljrp\n" +
                "kqzsdenujmcsthbmggyioflarp\n" +
                "kqzxienujwcsthbmgvaioflaip\n" +
                "kqzxdwnujwcstfkmgvyioflarp\n" +
                "kqzqdenujwcithbmzvyioflarp\n" +
                "kqzxdedpjwcsthbmgvyiofbarp\n" +
                "kqzxdeaujwcbtdbmgvyioflarp\n" +
                "kqzewenyjwcsthbmgvyioflarp\n" +
                "kqzxddnujwcsthbmgyyiofrarp\n" +
                "kqzxdtnujwcsthbmgvyiodlard\n" +
                "kqzxdefujwcsthbmgvyiffwarp\n" +
                "xczxdenujwcsthbmgvyooflarp\n" +
                "kuzxdenujucsthbmgvykoflarp\n" +
                "kqzxtenujwcwthbmgvyioplarp\n" +
                "kqzxdencllcsthbmgvyioflarp";

        String testInput = "abcdef\n" +
                "bababc\n" +
                "abbcde\n" +
                "abcccd\n" +
                "aabcdd\n" +
                "abcdee\n" +
                "ababab";

        String[] inputArray = input.split("[\n]");
        int characterOccuredTwice = 0;
        int characterOccuredThrice = 0;

        for (int wordNumber = 0; wordNumber < inputArray.length; wordNumber++) {
            Map<Character, Integer> uniqueCharacters = new HashMap<Character, Integer>();
            for (int charPosition = 0; charPosition < inputArray[wordNumber].length(); charPosition++) {
                char currentCharacter = inputArray[wordNumber].charAt(charPosition);

                if (!uniqueCharacters.containsKey(currentCharacter)) {
                    uniqueCharacters.put(currentCharacter, 1);
                } else {
                    int numberOfCharacterOccurances = uniqueCharacters.get(currentCharacter);
                    uniqueCharacters.put(currentCharacter, ++numberOfCharacterOccurances);
                }
            }
            if(uniqueCharacters.containsValue(2)){
                characterOccuredTwice++;
            }
            if(uniqueCharacters.containsValue(3)){
                characterOccuredThrice++;
            }
            System.out.println(inputArray[wordNumber] + " " + uniqueCharacters);
        }
        System.out.println("Characters twice: " + characterOccuredTwice + " Characters occured Thrice: " + characterOccuredThrice);
        System.out.println(characterOccuredTwice + "*" + characterOccuredThrice + " = " + characterOccuredTwice*characterOccuredThrice);
    }
}
