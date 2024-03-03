package sortingArray;

public class SortingArray {

    public static void bubbleSort(int[] arr) { // Сортировка пузырьком
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // если перестановок не было, массив отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) { // Тестирование
        int[] arrayToSort = {63, 34, 25, 12, 22, 11, 5};
        bubbleSort(arrayToSort);
        System.out.println("Отсортированный массив:");
        for (int value : arrayToSort) {
            System.out.print(value + " ");
        }
    }
}