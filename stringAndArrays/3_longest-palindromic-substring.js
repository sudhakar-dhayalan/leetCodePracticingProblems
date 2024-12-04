const longestPalindromeOwnLogic = (str) => {
  let palind = '';
  
  for (let i = 0; i < str.length; i ++) {
    const oddPal = eachCharAsCenterAndExpand(str, i, i);
    const evenPal = eachCharAsCenterAndExpand(str, i, i + 1);

    if (oddPal.length > palind.length) {
      palind = oddPal;
    }
    if (evenPal.length > palind.length) {
      palind = evenPal;
    }
  }

  return palind;
};

const eachCharAsCenterAndExpand = (str, i, j) => {
  let pal = '';
  for (let index = i; index >= 0;) {
    if (str[index] != str[j]) {
      break;
    } else {
      if (index === j) {
        pal = str[index]
      } else {
        pal = str[index] + pal + str[j]
      }
      ++j;
      --index;
    }
  }
  return pal;
}

console.log(longestPalindromeOwnLogic('babad')); // bab
console.log(longestPalindromeOwnLogic('abad')); // abba
console.log(longestPalindromeOwnLogic('abba')); // abba


// uses 2 pointer concept
/**
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * @param {string} input
 * @return {string}
 */
let longestPalindrome = function (input) {
  if (input.length < 1 || input === null) return '';

  let longest = '';
  for (let i = 0; i < input.length; i++) {
    let oddPalindrome = expandFromCenter(input, i, i);
    let evenPalindrome = expandFromCenter(input, i - 1, i);

    if (oddPalindrome.length > longest.length) {
      longest = oddPalindrome;
    }
    if (evenPalindrome.length > longest.length) {
      longest = evenPalindrome;
    }
  }
  return longest;
};

let expandFromCenter = (str, left, right) => {

  // if (input[left] && input[left] === input[right]) {
  //   // initally left & right pointer points to the same character
  //   // matches means we move left one step and right one step - for palindrome of odd length
  //   // and the process repeats
  // }

  // if (input[left - 1] && input[left - 1] === input[right]) {
  //   // initally left & right pointer points to the adjacent character
  //   // matches means we move left one step and right one step - for palindrome of odd length
  //   // and the process repeats
  // }

  let j = 0;
  while (str[left - j] && str[left - j] === str[right + j]) {
    j++;
  }
  j--; // loop fails and so going back to succeeded position
  return str.slice(left - j, right + j + 1);
};

console.log(longestPalindrome('malayalam')); // malayalam
console.log(longestPalindrome('babad')); // bab
// console.log(longestPalindrome('abbad')); // abba
