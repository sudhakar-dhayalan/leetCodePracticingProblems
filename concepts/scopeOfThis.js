let b = 10;
const obj = {
  name: 'deeecode',
  age: 200,
  print: () => {
    function print2() {
      console.log(this)
      function test() {
        console.log('sudhakar')
        console.log(this)
      }
      test()
    }
    console.log(this)
    print2()
  }
}

obj.print()
