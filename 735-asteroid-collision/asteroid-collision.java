class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>(); // To Perform Operation

        for (int i = 0; i < asteroids.length; i++) {
            int asteroidSize = asteroids[i];

            if (!stack.isEmpty() && stack.peek() > 0 && asteroidSize < 0) {

                if (Math.abs(asteroidSize) == Math.abs(stack.peek())) {
                    stack.pop();
                } 
                else if (Math.abs(asteroidSize) > Math.abs(stack.peek())) {
                    stack.pop();
                    i--; // recheck current asteroid
                }

            } else {
                stack.push(asteroidSize);
            }
        }

        int[] finalCollide = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            finalCollide[i] = stack.pop();
        }

        return finalCollide;
    }
}