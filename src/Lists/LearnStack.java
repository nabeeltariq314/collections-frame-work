package Lists;

import java.util.Stack;

public class LearnStack {
   public static void main(String[] args){

//       Stack<String> animals = new Stack<>();
//
//       animals.push("cat");
//       animals.push("dog");
//       animals.push("elephant");
//       animals.push("duck");
//       animals.push("horse");
//       animals.push("");
//
//       System.out.println("animals" + animals);
//
//       System.out.println(animals.peek());

       Stack<Integer> count = new Stack<>();

       count.push(9);
       count.push(5);
       count.push(3);
       count.push(8);
       count.push(6);


       System.out.println("animals" + count);

       System.out.println(count.peek());

//       animals.pop();

       System.out.println(count.pop());
   }
}
