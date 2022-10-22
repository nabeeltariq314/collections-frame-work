package Maps;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args){

        // Hash map (class) duplicate keys not allowed
        // can have null key only once
        // can have multiple null values

        HashMap<Integer, String> m = new HashMap();

        m.put(101, "cat");
        m.put(102, "dog");
        m.put(103, "elephant");
        m.put(104, "ant");
        m.put(105, "duck");

        System.out.println(m);

        System.out.println(m.get(103)); // return elephant

        m.remove(104); // remove it's complete entry
        System.out.println(m);

        System.out.println(m.containsKey(102));
        System.out.println(m.containsValue("cat"));

        System.out.println(m.keySet()); // return all keys as Set

        for(int i : m.keySet()){
            // return all keys individually
            System.out.println(i);
        }

        System.out.println(m.values()); // return all values as Collection

        for (Object i : m.values()) {
            // return all values individually
            System.out.println(i);
        }

        System.out.println(m.entrySet()); // return all entries as Set

        for(int i : m.keySet()){
            // return all entries individually
            System.out.println(i + "    " + m.get(i));
        }






    }
}
