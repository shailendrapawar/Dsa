var expect = function (val) {
    return {
        toBe: (n) => {
            if (val === n) {
                return true
            }
            throw "Not Equal"
        },
        notToBe: (n) => {
            if (val !== n) {
                return true
            }
            throw "Equal"
        }
    }
};
