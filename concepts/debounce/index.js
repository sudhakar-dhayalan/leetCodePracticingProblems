// 1:14
let count = 0;
const getData = function(event) {
  console.log(count++, event.target.value)
}

let debounce = (fun, delay) => {
  let timer;
  return function(event) {
    let self = this;
    let funcToBeCalledAfterDelay = fun;
    clearTimeout(timer);
    timer = setTimeout(funcToBeCalledAfterDelay.bind(self, event), delay)
  }
}

let getDataAfterDelay = debounce(getData, 400);
