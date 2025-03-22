package CollectionFramework;

import java.util.HashSet;

public class Substrings {
    public static void subString(String s){
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                set.add(s.substring(i, j));
            }
        } 
        System.out.println(set);
    }
    public static void main(String[] args) {
        subString("hey");
    }
}
