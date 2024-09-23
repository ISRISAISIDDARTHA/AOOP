import java.util.ArrayList;
import java.util.List;

public class LambdaSortDescending {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Peach");
        stringList.add("Orange");
        stringList.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted list in descending order:");
        stringList.forEach(System.out::println);
    }
}
