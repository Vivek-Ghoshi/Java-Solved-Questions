package CollectionFramework;

public class ReverseString {
    //reverse the string without using the reverse method;
    public static void main(String[] args) {
        String s = "Hello";
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
