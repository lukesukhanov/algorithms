package algorithms.sort;

public final class InsertionSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {
      insertCurrent(numbers, currentIndex);
    }
  }

  private void insertCurrent(int[] numbers, int currentIndex) {
    int currentValue = numbers[currentIndex];
    int i;
    for (i = currentIndex - 1; i >= 0; i--) {
      if (numbers[i] <= currentValue) {
        break;
      } else {
        numbers[i + 1] = numbers[i];
      }
    }
    numbers[i + 1] = currentValue;
  }

}
