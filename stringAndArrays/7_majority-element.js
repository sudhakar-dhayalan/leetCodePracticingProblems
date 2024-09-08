/**
 * https://leetcode.com/problems/majority-element/
 * 169. Majority Element
 * @param {number[]} nums
 * @return {number}
 */
/*
let majorityElement = function (nums) {
  const ht = {};

  for (const num of nums) {
    ht[num] = ht[num] + 1 || 1;
  }

  const median = Math.ceil(nums.length / 2);
  for (const key in ht) {
    if (ht[key] >= median) {
      return key;
    }
  }
};
*/

let majorityElement = function (nums) {
  let majority = nums[0];
  let votes = 1;
  for (let i = 1; i < nums.length; i++) {
    if (votes === 0) {
      votes++
      majority = nums[i];
    } else if (majority !== nums[i]) {
      votes--;
    } else {
      votes++
    }
  }
  return majority;
}

console.log(majorityElement([3, 2, 3])); // 3
console.log(majorityElement([3, 2, 3, 1])); // 3
console.log(majorityElement([3, 2, 3, 1, 1, 1])); // 1
