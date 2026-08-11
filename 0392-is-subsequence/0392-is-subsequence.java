class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // pointer for subsequence string
        int j = 0; // pointer for main string
        while(i < s.length() && j < t.length()){
            // if char in both the strings match we increment the pointer of the subsequence
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        // if pointer complete iterate over the subsequence string
        return i == s.length();
    }
}