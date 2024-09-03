// uses 2 pointer concept
/*
 * Longest Substring Without Repeating Characters
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */

/**
 * @param {string} s
 * @return {number}
 */
/* let lengthOfLongestSubstring = function (s) {
  let longestChar = '';
  let temp = '';
  for (let i = 0; i < s.length; i++) {
    if (longestChar.includes(s[i])) {
      temp = temp.length > longestChar.length ? temp : longestChar;
      longestChar = s[i];
      for (let j = i - 1; j >= 0; j--) {
        if (longestChar.length && longestChar.includes(s[j])) {
          break;
        } else {
          longestChar += s[j];
        }
      }
    } else {
      longestChar += s[i];
    }
  }
//   console.log(longestChar);
//   console.log(temp);
  return temp.length > longestChar.length ? temp.length : longestChar.length;
}; */

let lengthOfLongestSubstring = function (s) {
  let longestStr = 0;
  let leftPointer = 0;
  let rightPointer = 0;

  let set = new Set();
  while (rightPointer < s.length) {
    if (!set.has(s[rightPointer])) {
      set.add(s[rightPointer]);
      longestStr = Math.max(longestStr, set.size);
      rightPointer++;
    } else {
      set.delete(s[leftPointer]);
      leftPointer++;
    }
  }
  return longestStr;
};

// console.log(lengthOfLongestSubstring("abcabcbb")); // 3
// console.log(lengthOfLongestSubstring("aaaa")); // 1
console.log(lengthOfLongestSubstring('pwwkew')); //3
// console.log(lengthOfLongestSubstring('aab')); // 2
// console.log(lengthOfLongestSubstring('dvdf')); // 2
// console.log(lengthOfLongestSubstring('anviaj')); // 5
