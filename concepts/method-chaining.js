var person = {};

person.__proto__.setFirstName = function(fName) {
    this.firstName = fName;
    return this;
};

person.__proto__.setLastName = function(lName) {
    this.lastName = lName;
    return this;
};

console.log(person);
console.log(person.setFirstName('Joe').setLastName('Davis'));
