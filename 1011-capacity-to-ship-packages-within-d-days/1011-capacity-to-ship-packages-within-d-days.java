class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = minimumWeight(weights);
        int right = sumofArray(weights);

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShipWithinDays(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private int minimumWeight(int[] arr) {
        int min = Integer.MIN_VALUE;
        for (int weight : arr) {
            min = Math.max(min, weight);
        }
        return min;
    }

    private int sumofArray(int[] arr) {
        int sum = 0;
        for (int weight : arr) {
            sum += weight;
        }
        return sum;
    }

    private boolean canShipWithinDays(int[] weights, int days, int capacity) {
        int dayCount = 1;
        int currentLoad = 0;

        for (int weight : weights) {
            if (currentLoad + weight > capacity) {
                dayCount++;
                currentLoad = 0;
            }
            currentLoad += weight;

            if (dayCount > days) {
                return false;
            }
        }
        return true;
    }
}