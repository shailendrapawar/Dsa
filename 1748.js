// 1748
function solve(nums) {
    let map = new Map();

    for (const num of nums) {
        map.set(map.get(num) + 1 || 1);
    }
    let sum = 0;
    for (const [key, value] of map) {
        if (value == 1) {
            sum += key;
        }
    }
    console.log(sum);
}

let nums = [1, 2, 3, 2];

solve(nums);