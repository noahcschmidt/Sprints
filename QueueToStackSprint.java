import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueToStackSprint {
    public static void main(String args[]) {
        Queue myStuff = new LinkedList<Integer>();
        myStuff.add(7);
        myStuff.add(39);
        myStuff.add(42);
        myStuff.add(17);
        Stack myStuffMoved = moveItMoveIt(myStuff);
    }

    public static Stack moveItMoveIt(Queue old) {
        Stack newStuff = new Stack<Integer>();
        for (int i = 0; i < old.size(); i++) {
            newStuff.push(old.remove());
        }
        return newStuff;
    }
}
