class Solution:
    def isPalindrome(self, s: str) -> bool:
        s1 = re.sub(r'[^a-zA-Z0-9]', '', s)
        s1 = s1.lower()

        start = 0
        end = len(s1) - 1

        while start < end:
            if s1[start] != s1[end]:
                return False
            start += 1
            end -= 1

        return True

## using two pointer and iterating till the elements are same from start and end 