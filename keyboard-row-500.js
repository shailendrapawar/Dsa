/**
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function (words) {


    let row1 = ["q", "w", "e", "r", "t", "y", "u", "i", "o", "p"]
    let row2 = ["a", "s", "d", "f", "g", "h", "j", "k", "l"]
    let row3 = ["z", "x", "c", "v", "b", "n", "m"]

    let result = [];


    for (let word of words) {
        let temp = word
        word = word.toLowerCase()
        let helper = new Set()

        for (let char of word) {
            if (row1.includes(char)) {
                helper.add(1)
                continue
            }

            if (row2.includes(char)) {
                helper.add(2)
                continue
            }

            if (row3.includes(char)) {
                helper.add(3)
                continue
            }
        }

        if (helper.size == 1) {
            result.push(temp)
        }

    }
    return result

};