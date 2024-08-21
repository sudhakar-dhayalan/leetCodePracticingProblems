/**
 * @param {string} s
 * @return {boolean}
 */
let isValid = function (s) {
  console.log(s.length%2)
  if (typeof s === 'string' && s.length%2 !== 0) {
    return "string";
  }
  for (let i = 0; i < s.length; i++) {
    
  }
};

console.log(isValid('()')); // tru
