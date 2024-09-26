let sentence = "the sky is blue";

let reverse = str => {
  // return str.split(' ').reverse().join(' ');

  let out = '';
  let rightPointer = i = str.length -1, leftPointer = i = str.length -1;
  while (leftPointer >=0) {
    if (str[leftPointer] === ' ' || leftPointer === 0) {
      out += str.slice(leftPointer, rightPointer + 1) + (leftPointer !== 0 ? ' ': '');
      rightPointer = leftPointer;
    }

    leftPointer--;
  }
  return out;
};

console.log(reverse(sentence));

