import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak dela");
        list.add("Ok");
        list.add("Goodbye");
//        System.out.println(list);
        List<Integer> list2 = list.stream().map(e -> e.length())
                .collect(Collectors.toList());
        System.out.println(list2);

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(e
                -> {
            if (e % 3 == 0) {
                e = e / 3;
            }
            return e;
        }).toArray();
        System.out.println(Arrays.toString(array));
        Arrays.stream(array).forEach(e -> {e*=2; System.out.println(e);});
//         Arrays.stream(array).forEach(e -> System.out.println(e));
//        Arrays.stream(array).forEach(System.out::print);



        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        map.entrySet().stream()
                .filter(entry -> entry.getValue().startsWith("J"))
                .map(entry -> entry.getKey())
                .forEach(System.out::print);
    }
}
