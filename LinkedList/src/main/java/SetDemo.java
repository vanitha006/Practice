import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]){
        Set<Integer> s1=new HashSet<Integer>();
        s1.add(1);
        s1.add(100);
        s1.add(1);
        s1.add(50);
        s1.add(10);
        s1.add(20);
        s1.add(12);
        s1.add(10);
        System.out.println("s1: "+s1);

        LinkedHashSet s2=new LinkedHashSet<Integer>(s1);
        TreeSet s3=new TreeSet<Integer>(s1);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        System.out.println("Size: "+s1.size());
        System.out.println("Contains 100? "+s1.contains(100));
        s1.remove(100);
        System.out.println("After removing 100: "+s1);
        //s1.clear();
        System.out.println("After clear: "+s1.size());

        Set<Integer> s4=new HashSet<Integer>();
        s4.add(1);
        s4.add(10);
        s4.add(12);
        s4.add(15);
        System.out.println("s4: "+s4);

        if(s4.containsAll(s1))
            System.out.println("s4 is a subset of s1");
        else if(s1.containsAll(s4))
            System.out.println("s1 is a subset of s4");
        s4.addAll(s2);
        System.out.println("s4 UNION s2: "+s4);
        s2.retainAll(s1);
        System.out.println("s2 INTERSECTION s1: "+s2);
    }
}
