// let s1 = "apple apple"
// let s2 = "banana"
let s1 = "this apple is sweet"
let s2 = "this apple is sour"
var uncommonFromSentences = function(s1, s2) {
    let words = (s1 + " " + s2).split(" ");
    let map = new Map()
    
    words.forEach((word) => {
        map.set(word, map.get(word) + 1 || 1)
    })

    console.log(map)

    result = []
    for (k of map.keys()) {
        if (map.get(k) === 1) {
            result.push(k)
        }
    }
    console.log(result)
    return result
};
uncommonFromSentences(s1,s2)