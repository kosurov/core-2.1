import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++) {
            intList.add(intArray[i]);
        }

        Iterator iterator = intList.iterator();
        while (iterator.hasNext()) {
            int i = (int)iterator.next();
            if (i < 0 || i == 0 || i % 2 != 0) {
                iterator.remove();
            }
        }

        intList.sort(Comparator.naturalOrder());
        for (Integer i : intList) {
            System.out.println(i);
        }
    }
}
