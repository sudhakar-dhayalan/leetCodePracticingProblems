/*
 * Longest Substring Without Repeating Characters
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3
 */

/**
 * @param {string} s
 * @return {number}
 */
let lengthOfLongestSubstring = function (s) {
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
};

// console.log(lengthOfLongestSubstring("abcabcbb")); // 3
// console.log(lengthOfLongestSubstring("aaaa")); // 1
console.log(lengthOfLongestSubstring("pwwkew")); //3
console.log(lengthOfLongestSubstring("aab")); // 2
// console.log(lengthOfLongestSubstring('dvdf')); // 2
console.log(lengthOfLongestSubstring('anviaj')); // 5
