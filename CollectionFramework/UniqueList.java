package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class UniqueList {
    //print unique list without using hashset;
    public static void main(String[] args) {
       List<Integer> list= new ArrayList<>();
       list.add(10); 
       list.add(20); 
       list.add(30); 
       list.add(10); 
       list.add(20); 
       list.add(30); 
       list.add(40); 
       //main code of geeting the unique list
       ArrayList<Integer> unique=  new ArrayList<>();
       for(int elem : list){
        if(!unique.contains(elem)){
            unique.add(elem);
        }
       }
       System.out.println(unique);
    }
}
