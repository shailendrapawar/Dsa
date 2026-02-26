496
// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]

function find(index, num, nums2) {
  for (let i = index; i < nums2.length; i++) {
    // const num;
    if (num < nums2[i]) {
      return nums2[i];
    }
  }
  return -1;
}

function solve(nums1, nums2) {
  //store all indexs of elements on nums2(parent)
  let map = new Map();
  for (let i = 0; i < nums2.length; i++) {
    map.set(nums2[i], i);
  }

  console.log(map);

  result = [];

  for (const num of nums1) {
    //get index wheere it appreared
    index = map.get(num);
    const gElem = find(index, num, nums2);
    result.push(gElem);
  }

  console.log(result);
  return result;
}

let nums1 = [4, 1, 2],
  nums2 = [1, 3, 4, 2];

solve(nums1, nums2);