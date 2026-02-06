class Solution:
    def isPalindrome(self, s: str) -> bool:
        str1 = re.sub(r'[^a-zA-Z0-9]', '', s)
        str1 = str1.lower()
        return str1 == str1[::-1]


# just converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters nad comparing the strings
        