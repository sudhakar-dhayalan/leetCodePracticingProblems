
/**
 * https://leetcode.com/problems/add-two-numbers/
 * 2. Add Two Numbers
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
let add2TwoNumbers = (l1, l2) => {
  if (l1.length > l2.length) {
    return addingHelper(l1, l2);
  } else {
    return addingHelper(l2, l1);
  }
};

let addingHelper = (l1, l2) => {
  let carry = 0;
  let sum = [];
  let i = 0;
  for (; i < l1.length; i++) {
    let val = 0;
    if (l2[i]) {
      val = l1[i] + l2[i] + carry;
    } else {
      val = l1[i] + carry;
    }
    carry = Math.floor(val / 10); // adding 2 single digit number <= 19
    sum[i] = val % 10;
  }
  if (carry) sum[i] = carry;
  return sum;
}

// // numbers were in reverse
// let l1 = [2, 4, 3, 1, 9], //2 + 40 + 300 = 342
//   l2 = [5, 6, 4]; // 5 + 60 + 400 = 465
// console.log(add2TwoNumbers([2, 4, 3], [5, 6, 4])); // [7, 0, 8]
// console.log(add2TwoNumbers([0], [0])); // [7, 0, 8]
console.log(add2TwoNumbers([9,9,9,9,9,9,9], [9,9,9,9])); // [8,9,9,9,0,0,0,1]
console.log(add2TwoNumbers([9], [9])); // [8,1]