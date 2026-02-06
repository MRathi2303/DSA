class Solution:
    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1

        while left < right:
            while left < right and not s[left].isalnum(): ## if left < right and is not alphanumeric we skip
                left += 1
            while left < right and not s[right].isalnum(): ## if right > left  and is not alphanumeric we skip
                right -= 1

            if s[left].lower() != s[right].lower():
                return False

            left += 1
            right -= 1

        return True
