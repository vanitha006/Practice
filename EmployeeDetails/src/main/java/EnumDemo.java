import static java.lang.String.valueOf;
import java.util.*;

enum Direction {
    NORTH(90, "dsds", "dsad"),
    SOUTH(270, "dsds", "dsad"),
    EAST(0, "dsds", "dsad"),
    WEST(180, "dsds", "dsad");


    private final String s;
    private final String s1;
    private int value;

    Direction(final int value, String s, String s1) {
        this.value = value;
        this.s = s;
        this.s1 = s1;

    }

    public int returnVal() {
        return value;
    }
}

public class EnumDemo {
    public static void main(String args[]) {
        Direction d1 = Direction.NORTH;
        Direction d2 = Direction.SOUTH;
        //System.out.println("Test");
        System.out.println("value: "+d1.returnVal());
        System.out.println("Name: "+d1.name());
        System.out.println("Ordinal: "+d2.ordinal());
        System.out.println("Compare: "+d2.compareTo(d1));
        System.out.println("Equals: "+d1.equals(d2));
        System.out.println("Declaring class: "+d1.getDeclaringClass());
        System.out.println("Get enum name for string: "+Enum.valueOf(Direction.class,"NORTH"));
        //System.out.println("Get enum name for string: "+Enum.
        Direction[] names =Direction.values();
        for (Direction d: names){
            System.out.println(d.name()+": "+d.returnVal());
        }
        int val=90;
        for (Direction d: names){
            if(d.returnVal()==val) {
                System.out.println(d.name() + ": " + d.returnVal());
                continue;
            }
        }
    }
}
