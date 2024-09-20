// Eg: 1
// function multiply(a, b) {
//   // console.log(a, b)
//   return a * b;
// }

// let multiplyByTwo = multiply.bind({}, 2);
// console.log(multiplyByTwo(4));
// console.log(this)
// console.log(multiplyByTwo)

// Eg: 2
// let nameObj = {
//   name: "Tony"
// }

// let PrintName = {
//   name: "steve",
//   sayHi: function () {

//       // Here "this" points to nameObj
//       console.log(this.name); 
//   }
// }

// Eg: 3
// let nameObj = {
//   name: "Tony"
// }

// let PrintName = {
//   name: "steve",
//   sayHi: function (age) {
//       console.log(this.name + " age is " + age);
//   }
// }

// Polyfill of bind with arguments
// Object.prototype.MyBind = function (bindObj, ...args) {
//   bindObj.myMethod = this;
//   return function () {
//       bindObj.myMethod(...args);
//   }
// }
// let HiFun = PrintName.sayHi.MyBind(nameObj, 42);
// HiFun();

// let HiFun = PrintName.sayHi.bind(nameObj);
// HiFun();

// PolyFill of bind
let nameObj = {
  name: "Tony"
}

let PrintName = {
  name: "steve",
  sayHi: function () {
      console.log(this.name);
  }
}

// console.log(Object)
Object.prototype.MyBind = function (bindObj) {

  // Here "this" will be sayHi function
  console.log(bindObj)
  console.log(this); // [function: sayHi]
  bindObj.myMethod = this; // assigning
  console.log(bindObj)
  return function () { // return functioning
      bindObj.myMethod(); // on execution of returned function, call sayHi
  }
}
let HiFun = PrintName.sayHi.MyBind(nameObj);
console.log(HiFun);
HiFun();
