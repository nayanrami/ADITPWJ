import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(22);
        list.add(9);
        list.add(60);

        Comparator<Integer> c = (item1, item2) -> (item1 > item2) ? 1 : (item1 < item2) ? -1 : 0;

        Collections.sort(list, c);
        Collections.sort(list, new MyCompare());
        System.out.println(list);
        list.stream().forEach(System.out::println);

        List<Integer> l2 = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        System.out.println(l2);
    }
}

class MyCompare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        return (o1 < o2) ? 1 : (o1 > 02) ? -1 : 0;
    }

}