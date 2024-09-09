let a = 'abcdefg';
let b = '123411111111111';
let c = '';

for (let i = 0; i < (a.length + b.length); i++) {
  c += (a[i] ? a[i] : '') + (b[i] ? b[i] : '');
}

console.log(c); // a1b2c3d4e1f1g111111111
