/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 * https://leetcode.com/problems/add-two-numbers/description/
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
let getNumFromList = (list) => {
  let multiplier = 1;
  let number = 0;
  for (let [index, value] of list.entries()) {
    if (index !== 0) multiplier = multiplier * 10;
    number += value * multiplier;
  }
  return number;
};

let getListFromNumReversed = (num) => {
  let list = [],
    divisor = 10;
  while (num) {
    list.push(num % divisor); // Eg 807 % 10 = 8
    num = Math.floor(num / divisor); // Eg Math.floor(807 / 10) = Math.floor(80.7) = 80
  }
  return list;
};

let addTwoNumbers = function (l1, l2) {
  let num1 = getNumFromList(l1);
  let num2 = getNumFromList(l2);
  return getListFromNumReversed(num1 + num2); // getListFromNumReversed(807)
};

// numbers were in reverse
let l1 = [2, 4, 3], //2 + 40 + 300 = 342
  l2 = [5, 6, 4]; // 5 + 60 + 400 = 465
console.log(addTwoNumbers(l1, l2)); // [7, 0, 8]
