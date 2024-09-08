/**
 * https://leetcode.com/problems/valid-parentheses/
 * 20. Valid Parentheses
 * @param {string} s
 * @return {boolean}
 */
let isValid = (input) => {
  let stack = [];
  const validParenthesis = '() [] {}';
  for (let i = 0; i < input.length; i++) {
    stack.push(input[i]);

    // pull last 2 elements in the stack
    const openParen = stack[stack.length - 2];
    const closeParen = stack[stack.length - 1];
    const potentialParen = openParen + closeParen;

    if (validParenthesis.includes(potentialParen)) {
      stack.pop();
      stack.pop();
    }
  }

  // console.log(stack);
  return stack.length === 0;
};

console.log(isValid('()')); // true
console.log(isValid('()[]')); // true
console.log(isValid('([)]')); // false
console.log(isValid('([)[]]')); // false
console.log(isValid('{')); // false
console.log(isValid('{}')); // false
