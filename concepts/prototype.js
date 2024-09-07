function Person(fname, lname) {
  // console.log(this); // {}
  this.fname = fname;
  this.lname = 'Doe';
  // console.log(this);
  this.getFullName = function() {
    return this.fname + '' + this.lname;
  }
}
// let san = new Person('san');

// Person.prototype.getFullName = function() {
//   return this.fname + '' + this.lname;
// }

let san = new Person('san');
// let someone = new Person('someone');

// console.log(someone.getFullName());
console.log(san.getFullName());