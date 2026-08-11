class Solution {
    public boolean isSubsequence(String s, String t) {
        int sub_pointer = 0;
        int seq_pointer = 0;
        while(sub_pointer<s.length() && seq_pointer<t.length()){
            if(s.charAt(sub_pointer) == t.charAt(seq_pointer)){
                sub_pointer++;
            }
            seq_pointer++;
        }
        return sub_pointer == s.length();
    }
}