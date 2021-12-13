import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(15);
        list.addLast(28);
        list.add(23);
        list.remove(0);
        list.set(1, 33);
        list.addFirst(null);
        List<Integer> anotherList = list; // 1
        System.out.println(anotherList);
    }
}
