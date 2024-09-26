let count = 0;
let logData = (event) => {
  console.log(count++, ': ' + event?.target?.value);
}

let debounce = (fun, delay) => {
  let flag = true;
  return function (event) {
    let self = this;
    if(flag) {
      fun.call(self, event);
      flag = false;
      setTimeout(() => {
        flag = true;
      }, delay)
    }
  }
}

let logDataAfterRegularInterval = debounce(logData, 5000);
