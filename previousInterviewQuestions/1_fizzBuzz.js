const fizbuzz = () => {
  for (let i = 1; i <= 100; i++) {
    if (i % 15 == 0) console.log('fizzbuzz');
    else if (i % 5 == 0) console.log('buzz');
    else if (i % 3 == 0) console.log('fizz');
    else console.log(i);
  }  
}

console.log(fizbuzz());

// var input= "Sun is a hot today";
// output = input.split(' ').reverse().join(' ');
// console.log(output)