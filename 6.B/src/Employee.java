import java.util.Arrays;
import java.util.Comparator;
interface MaxMin<T> {
    T findMax(T[] array);
    T findMin(T[] array);
}
class MaxMinImpl<T extends Comparable<T>> implements MaxMin<T> {
    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}
 class GenericMaxMin {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        
        MaxMin<Integer> intMaxMin = new MaxMinImpl<>();
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Max: " + intMaxMin.findMax(intArray));
        System.out.println("Min: " + intMaxMin.findMin(intArray));
        Float[] floatArray = {1.1f, 2.2f, 3.3f, 0.4f};
        
        MaxMin<Float> floatMaxMin = new MaxMinImpl<>();
        System.out.println("\nFloat Array: " + Arrays.toString(floatArray));
        System.out.println("Max: " + floatMaxMin.findMax(floatArray));
        System.out.println("Min: " + floatMaxMin.findMin(floatArray));
        String[] stringArray = {"apple", "orange", "banana", "pear"};
        
        MaxMin<String> stringMaxMin = new MaxMinImpl<>();
        System.out.println("\nString Array: " + Arrays.toString(stringArray));
        System.out.println("Max: " + stringMaxMin.findMax(stringArray));
        System.out.println("Min: " + stringMaxMin.findMin(stringArray));
        Character[] charArray = {'a', 'z', 'm', 'b'};
        
        MaxMin<Character> charMaxMin = new MaxMinImpl<>();
        System.out.println("\nCharacter Array: " + Arrays.toString(charArray));
        System.out.println("Max: " + charMaxMin.findMax(charArray));
        System.out.println("Min: " + charMaxMin.findMin(charArray));
    }
}
