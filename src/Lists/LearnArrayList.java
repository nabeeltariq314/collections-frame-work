package Lists;

import java.util.List;
import java.util.ArrayList;


public class LearnArrayList {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(6);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        for (Integer element: list){
//            System.out.println("element is " + element);
//        }

//        List<String> list = new ArrayList<>();
//        list.add("apple");
//        list.add("banana");
//        list.add("orange");
//        list.add("");
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        for (String element: list){
//            System.out.println("element is " + element);
//        }

//        list.remove(2);
//
//        System.out.println(list);

//        list.set(1, 7);
//        System.out.println(list);

        /*list.add(5);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        list.add(1);
        list.add(2);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(3));*/



    }

}
