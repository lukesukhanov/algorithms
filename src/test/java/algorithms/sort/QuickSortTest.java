package algorithms.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("QuickSort")
class QuickSortTest {

  private final Sort sort = new QuickSort();

  @Test
  @DisplayName("sort(int[]) - normal return")
  final void sort_normalReturn() {
    int[] rawNumbers = { 3, 2, 4, 1, 2 };
    int[] sortedNumbers = { 1, 2, 2, 3, 4 };
    this.sort.sort(rawNumbers);
    assertArrayEquals(rawNumbers, sortedNumbers);
  }

  @Test
  @DisplayName("sort(int[]) - empty array")
  final void sort_emptyArray() {
    int[] rawNumbers = {};
    int[] sortedNumbers = {};
    this.sort.sort(rawNumbers);
    assertArrayEquals(rawNumbers, sortedNumbers);
  }

}
