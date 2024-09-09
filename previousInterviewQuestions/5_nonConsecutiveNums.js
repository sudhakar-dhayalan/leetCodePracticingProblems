// Print non-consecutive numbers
let array = [8, 11, 12, 13, 14, 6, 9, 10, 11, 2, 4, 1, 2];

let output = [];
for (let i = 0; i < array.length; i++) {
  let val = array[i];
  if (val != (array[i+1] - 1) && (val != array[i-1] + 1)) {
    output.push(val);
  }
}

console.log(output); // [ 8, 6, 2, 4 ]
