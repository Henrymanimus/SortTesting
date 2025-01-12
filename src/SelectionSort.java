public class SelectionSort implements ISort {
    @Override
    public int[] sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }

        return numbers;
    }
}
