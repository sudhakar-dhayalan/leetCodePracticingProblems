/**
 * https://leetcode.com/problems/palindrome-number/description/
 * 9. Palindrome Number
 * @param {number} x
 * @return {boolean}
 */
let isPalindrome = function (x) {
  if (x < 0) return false;
  let reverse = '';
  let num = x;
  while (num >= 10) {
    reverse += num % 10;
    num = Math.floor(num / 10);
  }
  reverse += num % 10;
  if (x === +reverse) return true;
  return false
};

console.log(isPalindrome(1001));
console.log(isPalindrome(11));
console.log(isPalindrome(19));
console.log(isPalindrome(121));
console.log(isPalindrome(-121));
console.log(isPalindrome(121));
