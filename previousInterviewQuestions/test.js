const longestPalindrome = (str) => {
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

console.log(longestPalindrome('babad')); // bab
console.log(longestPalindrome('abad')); // abba
console.log(longestPalindrome('abba')); // abba
