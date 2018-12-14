import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {
    public static  void  main(String args[]){
        LinkedList<Integer> obj=new LinkedList<Integer>();
        Collection<Integer> c1= new ArrayList<Integer>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);

        Collection<Integer> c2= new ArrayList<Integer>();
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(400);

        obj.addAll(c1);
        obj.addAll(1, c2);

        System.out.println("The linked list is: "+obj);
        System.out.println("First element: "+obj.getFirst());
        System.out.println("Last element: "+obj.getLast());
        System.out.println("First element using peek: "+obj.peek());
        System.out.println("Size of linked list: "+obj.size());
        obj.clear();
        System.out.println("Size of linked list after clear: "+obj.size());
    }
}
