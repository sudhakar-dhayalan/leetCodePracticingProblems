let pushZeroToEnd = (input) => {
  let left = 0;
  right = input.length - 1;

  while (left <= right) {
    if (input[left] === 0) {
      if (input[right] !== 0) {
        let temp = input[right];
        input[right] = input[left];
        input[left] = temp;
        left++;
        right--;
      } else {
        right--;
      }
    } else {
      left++;
    }
  }

  return input;
};

console.log(pushZeroToEnd([1, 0, 2, 0, 3, 4, 0, 0, 6]));
