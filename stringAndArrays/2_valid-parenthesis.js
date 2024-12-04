/**
 * @param {string} s
 * @return {boolean}
 */
let isValid = function (s) {
  if (s.length%2 !== 0) {
    return false;
  }

  let validParen = '() {} []';
  
  let i = 0;
  let stack = [];
  while (i < s.length) {
    stack.push(s[i]);
    i++;

    const open = stack[stack.length - 2];
    const closed = stack[stack.length - 1];
    let paren = open + closed;
    if (validParen.includes(paren)) {
      stack.pop();
      stack.pop();
    }
  }
  return stack.length === 0;
};

console.log(isValid('([])')); // true
console.log(isValid('([)')); // false
console.log(isValid('([)]')); // false
console.log(isValid('([]){}')); // true
