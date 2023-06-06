package algorithms.search;

public final class BinarySearch implements Search {

  @Override
  public int search(int[] numbers, int number) {
    if (numbers.length == 0) {
      return -1;
    }
    int left = 0;
    int right = numbers.length - 1;
    while (left != right) {
      int middle = left / 2 + right / 2;
      if (numbers[middle] == number) {
        return middle;
      }
      if (numbers[middle] > number) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    if (numbers[left] == number) {
      return left;
    }
    if (numbers[left] > number) {
      return -left - 1;
    }
    return -left - 2;
  }

}
