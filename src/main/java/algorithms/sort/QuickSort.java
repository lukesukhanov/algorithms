package algorithms.sort;

public final class QuickSort implements Sort {

  @Override
  public void sort(int[] numbers) {
    sort(numbers, 0, numbers.length);
  }

  private void sort(int[] numbers, int start, int end) {
    int length = end - start;
    if (length <= 1) {
      return;
    }
    if (length == 2) {
      if (numbers[start] > numbers[start + 1]) {
        swap(numbers, start, start + 1);
      }
      return;
    }
    int chosenNumber = numbers[start];
    int firstGreaterThanChosen = start;
    int lastLesserThanChosen = end;
    while (true) {
      firstGreaterThanChosen = findFirstGreaterThanChosen(numbers, firstGreaterThanChosen + 1,
          lastLesserThanChosen, chosenNumber);
      if (firstGreaterThanChosen == lastLesserThanChosen) {
        swap(numbers, start, firstGreaterThanChosen - 1);
        sort(numbers, start, firstGreaterThanChosen - 1);
        sort(numbers, firstGreaterThanChosen + 1, end);
        return;
      }
      lastLesserThanChosen = findLastLesserThanChosen(numbers, firstGreaterThanChosen + 1,
          lastLesserThanChosen, chosenNumber);
      if (lastLesserThanChosen == firstGreaterThanChosen) {
        swap(numbers, start, firstGreaterThanChosen - 1);
        sort(numbers, start, firstGreaterThanChosen - 1);
        sort(numbers, firstGreaterThanChosen + 1, end);
        return;
      }
      swap(numbers, firstGreaterThanChosen, lastLesserThanChosen);
    }
  }

  private int findFirstGreaterThanChosen(int[] numbers, int start, int end, int chosenNumber) {
    int i;
    for (i = start; i < end; i++) {
      if (numbers[i] > chosenNumber) {
        break;
      }
    }
    return i;
  }

  private int findLastLesserThanChosen(int[] numbers, int start, int end, int chosenNumber) {
    int i;
    for (i = end - 1; i >= start; i--) {
      if (numbers[i] < chosenNumber) {
        break;
      }
    }
    return i;
  }

  private void swap(int[] numbers, int i, int j) {
    int t = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = t;
  }

}
