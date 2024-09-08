/**
 * https://leetcode.com/problems/majority-element/
 * 169. Majority Element
 * @param {number[]} nums
 * @return {number}
 */
let majorityElement = function (nums) {
  const ht = {};

  for (const num of nums) {
    ht[num] = ht[num] + 1 || 1;
  }

  const isNumsOfEvenLength = nums.length % 2 === 0;
  const median = Math.floor(nums.length / 2);
  for (const key in ht) {
    if (isNumsOfEvenLength && ht[key] >= median) {
      return key;
    } else if (!isNumsOfEvenLength && ht[key] > median) {
      return key;
    }
  }
};

console.log(majorityElement([3, 2, 3])); // 3
console.log(majorityElement([3, 2, 3, 1, 1, 1])); // 1
