import java.util.*;

public class Bt2 {

    public static void main(String[] args) {
        int[] numArr = {3, 6, 2, 7};
        Map<Integer, Integer> myMap = new TreeMap<>();
        for (int i = 0; i < numArr.length; i++) {
            myMap.put(numArr[i], i);
        }
        ArrayList<Integer> sortArr = new ArrayList<>();
        ArrayList<Integer> indexArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            sortArr.add(entry.getKey());
            indexArr.add(entry.getValue());
        }
        System.out.println(sortArr);
        System.out.println(indexArr);
    }
}
