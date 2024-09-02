package org.aptech.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//connected to Chatlist
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> orderList = new LinkedList<>();
        orderList.add("King");
        orderList.add("Prince");
        orderList.add("Daniel");
        orderList.add("Korede");

        Iterator<String> iterator = orderList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        String peek = orderList.peek();
//        System.out.println(peek);
        String remove = orderList.remove();
        System.out.println(remove);
        String peek = orderList.peek();
        System.out.println(peek);


        Queue<ChatList> chats = new LinkedList<>();
//        ChatList chat1 = new ChatList(1, "Mike");
        chats.add(new ChatList(1, "Mike"));
        chats.add(new ChatList(2, "Korede"));
        chats.add(new ChatList(3, "Prince"));
        chats.add(new ChatList(4, "Daniel"));
        System.out.println(chats.size() +"users before you");
        chats.poll();
//      poll checks the new person next, removes the first and removes the second, combine both peek() & poll() functional features
        ChatList removeIt = chats.remove();
        System.out.println(chats.size());
    }
}
