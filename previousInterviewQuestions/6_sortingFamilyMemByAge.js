// sorting family members by their age

/*
// For a single family
  var familiesList = [{son: 3 ,spouse: 31 ,self: 32, daughter: 6}];
  let sortedFamilList = [];
  let keyValueList = Object.entries(familiesList[0]);
  console.log(keyValueList)
  keyValueList.sort((a, b) => a[1] - b[1]);
  // console.log(sorted)
  let individualFamily = {};
  for(let keyVal of keyValueList) {
      individualFamily = {...individualFamily, [keyVal[0]]: keyVal[1]};
  }
  sortedFamilList.push(individualFamily);
  console.log( sortedFamilList );
  {
    daughter: 6,
    self: 32,
    son: 3,
    spouse: 31
  }
*/

let familiesList = [
  { son: 3, spouse: 31, self: 32, daughter: 6 },
  { spouse: 25, son: 1, self: 26 },
];
let sortedFamilyList = [];

for (let family of familiesList) {
  let keyValueList = Object.entries(family); // [ 'son', 3 ], [ 'spouse', 31 ], [ 'self', 32 ], [ 'daughter', 6 ]
  console.log(keyValueList);
  keyValueList.sort((a, b) => a[1] - b[1]);
  let individualFamily = {};
  for (let keyVal of keyValueList) {
    individualFamily = { ...individualFamily, [keyVal[0]]: keyVal[1] };
  }
  console.log([individualFamily]);
  sortedFamilyList.push(individualFamily);
}

console.log(sortedFamilyList);
//[
//   { son: 3, daughter: 6, spouse: 31, self: 32 },
//   { son: 1, spouse: 25, self: 26 }
// ]
