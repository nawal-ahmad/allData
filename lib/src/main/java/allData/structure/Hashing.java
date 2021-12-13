package allData.structure;

import java.util.*;

public class Hashing {

    public char findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = input.toCharArray();

        for (var chr : chars) {
            if (map.containsKey(chr)) {
                int count = map.get(chr) + 1;
                map.put(chr, count);
            } else {
                map.put(chr, 1);
            }
        }for (var chr: chars){
            if(map.get(chr)==1){
                return chr;
            }
        }
        return Character.MIN_VALUE;

    }

    public char firstRepeatedChar(String input){
        Set<Character> set = new HashSet<>();

        for (var chr: input.toCharArray()){

            if (set.contains(chr) && chr !=' ')
                return chr;
            set.add(chr);
//            System.out.println(set);
        }
        return Character.MIN_VALUE;
    }

    public boolean sameString(String str1, String str2){
        var first = str1.toCharArray();
        var second = str2.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char chr: first){
            if (!set.contains(chr)){
                set.add(chr);
            }
        }
        for(char chr: second){
            if(!set.contains(chr)){
                return false;
            }
        }
        boolean lat = first.length == second.length;
        return first.length == second.length;
    }

    // Find all the missing numbers between the min and the max number in this array (No built in methods allowed) // array = [0, 5, 4, 9, 3];

}
