/**
 * https://leetcode.com/problems/remove-element/
 * 27. Remove Element
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
let removeElement = function (nums, val) {
  let left = 0,
    right = nums.length - 1;
  while (left <= right) {
    if (nums[right] === val) {
      right--;
      nums.pop();
    } else if (nums[left] === val) {
      let temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
      nums.pop();
    } else {
      left++;
    }
  }
  return nums;
};

console.log(removeElement([3, 2, 2, 3], 3)); // [2, 2]
console.log(removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2)); // [2, 2]
