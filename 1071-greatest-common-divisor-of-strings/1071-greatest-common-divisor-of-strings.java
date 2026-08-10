class Solution {
    public String gcdOfStrings(String str1, String str2) {

      
        String first = str1 + str2;
        String second = str2 + str1;

        if (!first.equals(second)) {
            return "";
        }

        
        int a = str1.length();
        int b = str2.length();

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        
        return str1.substring(0, a);
    }
}