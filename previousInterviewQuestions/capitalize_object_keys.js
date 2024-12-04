const person = {
  name: 'Sachin',
  address: {
    street: '23,Mumbai',
    contact: {
      mobile: '122432242',
      email: 'test@hotmail.com',
    },
  },
};

const capitalize = (input) => {
  let capitalizedObj = {};
  if (input instanceof Object) {
    const keys = Object.keys(input);
    keys.map((key) => {
      const capitalKey = key.toUpperCase();
      const val = input[key];
      capitalizedObj[capitalKey] =
        val instanceof Object ? capitalize(val) : val;
    });
    return capitalizedObj;
  }
};

console.log(capitalize(person));
