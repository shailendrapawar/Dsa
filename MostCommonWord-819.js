let paragraph = "..Bob hit a ball, the hit BALL flew far after it was hit."
let banned = ["hit"]

var mostCommonWord = function (paragraph, banned) {
    const inValid = new Set(['!', '?', '\'', ',', ';', '.'])
    let wordArr = paragraph
        .toLowerCase()
        .replace(/[^a-z]/g, ' ')   // replace punctuation with space
        .split(/\s+/);
    // let=  wordArr=paragraph.split(" ")
    console.log(wordArr)
    let map = new Map()

    wordArr = wordArr.map((word) => {
        if (!banned.includes(word) && word != "") {
            if (map.has(word)) {
                map.set(word, map.get(word) + 1)
            } else {
                map.set(word, 1)
            }
        }
        return word
    })

    let pairs = [...map.entries()]

    let result = pairs[0]

    console.log(map)
    pairs.forEach((pair) => {
        if (pair[1] > result[1]) {
            result = pair;
        }
    })
    console.log(result[0])
};

//mapp words

mostCommonWord(paragraph, banned)