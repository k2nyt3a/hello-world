public class SortExample {

  public static void main(String[] args) {
    int[] numbers = {5, 2, 8, 1, 3};
    bubbleSort(numbers);
    for (int i = 0; i < numbers.length; ++i) {
      System.out.println(numbers[i]);
    }
  }

  public static void bubbleSort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}

