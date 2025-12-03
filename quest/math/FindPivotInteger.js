// let s1 = "apple apple"
// let s2 = "banana"
let n = 8
var pivotInteger = function(n) {
   for (let i = 1; i <= n; i++) {
        let left = 0;
        let right = 0;

        // sum 1 → i
        for (let b = 1; b <= i; b++) {
            left += b;
        }

        // sum i → n
        for (let f = i; f <= n; f++) {
            right += f;
        }

        if (left === right) {
          console.log(i)
            return i;
        }
    }

    return -1;

};
pivotInteger(n)