package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
    public static void main(String[] args){

        // it stores only unique elements

        HashSet<Integer> set = new HashSet<>();

        // To insert elements
        set.add(2);
        set.add(6);
        set.add(8);
        set.add(1);
        set.add(6);

        System.out.println(set.size());

        System.out.println(set);

        // To search elements
        if(set.contains(6)){
            System.out.println("6 exists");
        }


        if(!set.contains(9)){
            System.out.println("does not contain 8");
        }

        // Delete elements
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("2 has been deleted Successfully!");
        }

        // Iterator
       Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
