package de.gfn.java.ocp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author tlubowiecki
 */
public class QueueTest1 {
    
    public static void main(String[] args) {
        
        Queue<Message> messages = new LinkedList<>();
        
        messages.offer(new Message("Neue E-Mail"));
        messages.offer(new Message("Web-Service gestartet"));
        messages.offer(new Message("Web-Service beendet"));
        messages.offer(new Message("Neue E-Mail"));
        
        while(messages.size() > 0) {
            System.out.println(messages);
            //System.out.println(messages.poll());
            messages.poll();
        }
        
        //messages.remove(); // Exception
        
        System.out.println("-------------");
        
        PriorityQueue<Integer> ints = new PriorityQueue<>(Arrays.asList(2,4,8,10,6,1));
        System.out.println(ints.poll());
        ints.offer(3);
        System.out.println(ints.poll());
        System.out.println(ints.poll());
        System.out.println(ints.poll());
        
        System.out.println("-------------");
        
        Deque<Integer> ints2 = new LinkedList<>();
        
        // LIFO
        ints2.push(10);
        ints2.push(20);
        ints2.push(30);
        while(ints2.size() > 0) {            
            System.out.println(ints2.pop());
        }
        
        // Stack<Integer> stack = new Stack<>();
        
        
        List<Integer> ints3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        
//        for(int i : ints3) {
//            System.out.println(i);
//            ints3.remove(new Integer(i));
//        }
        
        for(int i = 0; i < ints3.size(); i++) {
            System.out.println(i);
            ints3.remove(i);
        }
    }
}
