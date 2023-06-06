package algorithms.sort;

public final class MergeSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    int[] tempNumbers = new int[numbers.length];
    sort(numbers, tempNumbers, 0, numbers.length);
  }

  private void sort(int[] numbers, int[] tempNumbers, int start, int end) {
    int length = end - start;
    switch (length) {
      case 0:
        return;
      case 1:
        return;
      case 2:
        if (numbers[start] > numbers[start + 1]) {
          swap(numbers, start, start + 1);
        }
        return;
    }
    int middle = start + length / 2;
    sort(numbers, tempNumbers, start, middle);
    sort(numbers, tempNumbers, middle, end);
    merge(numbers, tempNumbers, start, middle, end);
  }

  private void swap(int[] numbers, int i, int j) {
    int t = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = t;
  }

  private void merge(int[] numbers, int[] tempNumbers, int start, int middle, int end) {
    int left = start;
    int right = middle;
    int current = start;
    while (left < middle && right < end) {
      if (numbers[left] < numbers[right]) {
        tempNumbers[current] = numbers[left];
        left++;
      } else {
        tempNumbers[current] = numbers[right];
        right++;
      }
      current++;
    }
    if (left != middle) {
      for (int i = left; i < middle; i++) {
        tempNumbers[current] = numbers[i];
        current++;
      }
    } else {
      for (int i = right; i < end; i++) {
        tempNumbers[current] = numbers[i];
        current++;
      }
    }
    System.arraycopy(tempNumbers, start, numbers, start, end - start);
  }

}
