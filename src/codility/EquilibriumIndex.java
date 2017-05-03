package codility;

import java.util.stream.IntStream;

class EquilibriumIndex {
    /**
     * O(N) solution for Equilibrium Task on Codility
     *
     * https://blog.codility.com/2011/03/solutions-for-task-equi.html
     * @param numbers array of integers
     * @return the index of the equilibrium or -1
     */
    int computeIndex(int[] numbers) {
        if (numbers != null) {
            int leftsum = 0;
            int rightsum = IntStream.of(numbers).sum();

            for (int i = 0; i < numbers.length; i++) {
                rightsum -= numbers[i];

                if (leftsum == rightsum) {
                    return i;
                }

                leftsum += numbers[i];
            }
        }

        return -1;
    }
}