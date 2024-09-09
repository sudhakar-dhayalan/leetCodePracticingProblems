var A = [
  { id: 10, status: true },
  { id: 20, status: false },
  { id: 30, status: true },
];
var B = [
  { id: 10, value: '100', somevalue: '100' },
  { id: 20, value: '200' },
  { id: 30, value: '300' },
];

var newArr = [];
A.forEach((obj_1) => {
  B.forEach((obj_2) => {
    if (obj_1.id === obj_2.id) {
      newArr.push({ ...obj_1, ...obj_2 });
    }
  });
});
console.log(newArr);
