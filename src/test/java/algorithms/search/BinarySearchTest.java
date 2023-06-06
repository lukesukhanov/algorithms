package algorithms.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BinarySearch")
class BinarySearchTest {

  private final Search search = new BinarySearch();

  @Test
  @DisplayName("search(int[], int) - normal return 1")
  final void search_normalReturn1() {
    int[] numbers = { 1, 3, 3, 4, 6, 6 };
    int number = 3;
    assertEquals(this.search.search(numbers, number), Arrays.binarySearch(numbers, number));
  }

  @Test
  @DisplayName("search(int[], int) - normal return 2")
  final void search_normalReturn2() {
    int[] numbers = { 1, 3, 3, 4, 6 };
    int number = 3;
    assertEquals(this.search.search(numbers, number), Arrays.binarySearch(numbers, number));
  }

  @Test
  @DisplayName("search(int[], int) - number not found 1")
  final void search_numberNotFound1() {
    int[] numbers = { 1, 3, 3, 4, 6, 6 };
    int number = 2;
    assertEquals(this.search.search(numbers, number), Arrays.binarySearch(numbers, number));
  }

  @Test
  @DisplayName("search(int[], int) - number not found 2")
  final void search_numberNotFound2() {
    int[] numbers = { 1, 3, 4, 6, 6 };
    int number = 2;
    assertEquals(this.search.search(numbers, number), Arrays.binarySearch(numbers, number));
  }

  @Test
  @DisplayName("search(int[], int) - empty array")
  final void search_normalReturn4() {
    int[] numbers = {};
    int number = 3;
    assertEquals(this.search.search(numbers, number), Arrays.binarySearch(numbers, number));
  }

}
