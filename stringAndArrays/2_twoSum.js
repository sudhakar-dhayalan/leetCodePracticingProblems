/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 * https://leetcode.com/problems/two-sum/description/
 */
let helperFunc = (arr, val) => arr.indexOf(val);

let twoSum = function (nums, target) {
  let storage = {};
  for (let [index, value] of nums.entries()) {
    if(storage[value] !== undefined) return [storage[value], index];
    storage[target - value] = index;
  }
    /* for (let i = 0; i < nums.length; i++) {
      let remainingVal = target - nums[i];
      let secondNumIndex = nums.indexOf(remainingVal);
      if (secondNumIndex >= 0) {
        return [i, secondNumIndex === 0 ? 1: secondNumIndex];
      }
    } */
};

// console.log(twoSum([2, 7, 11, 15], 9));
// console.log(twoSum([3,2, 3], 6));
console.log(twoSum([2,5,5,11], 10));
