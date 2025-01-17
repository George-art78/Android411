package HomeWorks.hm27;

public class PrintArray<T> {
    T[] arr;

    public PrintArray(T[] arr) {
        this.arr = arr;
    }

    public void printArray(T[] arr) {
        System.out.print("Массив: ");
        for (T value : arr) {
            System.out.print(value + " ");
        }
    }
}
