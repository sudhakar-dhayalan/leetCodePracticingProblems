let count = 0;
let logData = (event) => {
  console.log(count++, ': ' + event?.target?.value);
}

let debounce = (fun, delay) => {
  let self = this;
  let flag = true;
  return function (event) {
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
