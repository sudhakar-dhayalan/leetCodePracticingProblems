/**
 * https://leetcode.com/problems/merge-sorted-array/
 * 88. Merge Sorted Array
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
let merge = function (nums1, m, nums2, n) {
  let f = m - 1,
    s = n - 1,
    i = m + n - 1;
  while (s >= 0) {
    if (nums1[f] > nums2[s]) {
      nums1[i] = nums1[f];
      f--;
    } else {
      nums1[i] = nums2[s];
      s--;
    }
    i--;
  }
};

let nums1 = [1, 2, 3, 0, 0, 0],
  m = 3,
  nums2 = [2, 5, 6],
  n = 3;
merge(nums1, m, nums2, n);
console.log(nums1); // [1,2,2,3,5,6]

let testnums1 = [2, 0],
  testm = 1,
  testnums2 = [1],
  testn = 1;
merge(testnums1, testm, testnums2, testn);
console.log(testnums1); // [1,2]
