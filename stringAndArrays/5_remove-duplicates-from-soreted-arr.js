/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 26. Remove Duplicates from Sorted Array
 * @param {number[]} nums
 * @return {number}
 */
let removeDuplicates = function (nums) {
  const uniqueNums = [];
  nums.map((num) => {
    if (!uniqueNums.includes(num)) {
      uniqueNums.push(num);
    }
  });
  return uniqueNums;
};

console.log(removeDuplicates([1, 1, 2]));
console.log(removeDuplicates([1, 1, 2, 3, 4, 5, 5]));
