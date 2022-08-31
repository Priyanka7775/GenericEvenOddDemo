import java.util.ArrayList;
import java.util.List;

public class GenericEvenOdd {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        int count = 0;
        int sum = 0;
        for (Integer element : integerList) {
            if (element % 2 == 0) {
                count++;
            }
            else {
                sum=sum+element;
            }
        }
        System.out.println(count);
        System.out.println("sum = " + sum);
    }
}
