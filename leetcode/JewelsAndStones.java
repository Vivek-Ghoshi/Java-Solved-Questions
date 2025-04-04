package Leetcode;

import java.util.HashSet;

public class JewelsAndStones{
    public static int countStones(String jewels, String stones){
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }
        for(char ch : stones.toCharArray()){
            if(set.contains(ch)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(countStones(jewels, stones));
    }
}
