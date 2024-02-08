import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(9);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);

        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> o = list1.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("not present");
        }

    }
}
