package arryss;

public class App {
    public static void main(String[] args) {
     Arrays arrays = new Arrays();

        System.out.println(java.util.Arrays.toString(arrays.arr1));
        System.out.println(java.util.Arrays.toString(arrays.arr2));
        System.out.println(java.util.Arrays.toString(arrays.arr3));

        System.out.println("\nArray 1 and array 2: "
                + arrays.getArr1(arrays.arr1, arrays.arr2));
        System.out.println("Array 1 and array 3: "
                + arrays.getArr3(arrays.arr1, arrays.arr3));
    }
}
