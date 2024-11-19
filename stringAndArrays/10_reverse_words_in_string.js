let reverse = s => {
  // return s.split(' ').reverse().join(' ');

  let out = '';
  let rightPointer = s.length -1, leftPointer = s.length -1;
  while (leftPointer >=0) {
    if (s[leftPointer] === ' ' || leftPointer === 0) {
      out += s.slice(leftPointer !== 0 ? leftPointer + 1: leftPointer, rightPointer + 1).trim();

      out = out.trim();
      if (leftPointer !== 0) out += ' ';
      rightPointer = leftPointer - 1;
    }

    leftPointer--;
  }
  return out;
};

console.log(reverse("the sky is blue")); // blue is sky the
console.log(reverse("  hello world  ")); // "world hello"
console.log(reverse("a good   example")); // "example good a"
console.log(reverse(" asdasd df f")); // "f df asdasd" not working

