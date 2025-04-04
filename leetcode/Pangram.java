package Leetcode;

import java.util.HashSet;

public class Pangram {
    public static boolean isPangram(String s){
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ch >='a' && ch<='z'){
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
    public static void main(String[] args) {
        String s = "abcdegfhijklmnopqrstuvwxy";
        System.out.println(isPangram(s));
    }
}
