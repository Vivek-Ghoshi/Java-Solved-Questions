package UserInputBased;

public class Vpattern {
    public static void main(String[] args) {
        int n = 5;
       for(int i= 1;i<=n;i++){
           for(int j =1;j<n;j++){
              if(i == j){
                  System.out.print("* ");
              }else {
                  System.out.print("0 ");
              }
           }
           if(i ==n){
               System.out.println("* ");
           }else{
               System.out.println("0");
           }
       }
    }
}
