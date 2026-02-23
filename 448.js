// 448 -leetcode
var findDisappearedNumbers = function (nums) {
    const set = new Set(nums);

    let result = [];

    for (let i = 1; i <= nums.length; i++) {
        if (!set.has(i)) {
            result.push(i);
        }
    }
    return result;
};

const nums = [4, 3, 2, 7, 8, 2, 3, 1];
findDisappearedNumbers(nums);