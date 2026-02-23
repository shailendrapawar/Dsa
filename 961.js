// 961
function solve(nums) {
    const freqLimit = nums.length / 2;
    console.log(nums);

    const map = new Map();
    let item = null;

    for (let i = 0; i < nums.length; i++) {
        const n = nums[i];
        // map[n] = map.get(n) + 1 || 1;
        map.set(n, map.get(n) + 1 || 1);
    }

    for (const [key, value] of map) {
        console.log(key);
        if (map.get(key) == freqLimit) {
            item = key;
            break;
        }
    }

    return item;
}

const nums = [1, 2, 3, 3];

solve(nums);