package DSA.Recursion;

public class Factors {
    public static void printfact(int n){
        for(int i=1;i*i< n;i++){
           if(n%i==0){
            System.out.print(i + " ");
           }
        }
        for(int i= (int) Math.sqrt(n); i>=1 ;i--){
           if(n%i==0 && i != n/i){
            System.out.print(n/i + " ");
           }
        }
    }
    public static void main(String[] args) {
      int n = 48; 
      // System.out.println((int)Math.sqrt(n)); 
      printfact(n);
      //by brute force method
    //   for(int i =1;i< n/i;i++){
    //     if(n%i==0){
    //         System.out.print(i + " ");
    //     }
    //     if(i != n/i){
    //         System.out.print(n/i + " ");
    //     }
    //   }
    }
}
