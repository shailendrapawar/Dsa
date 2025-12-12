var prefixCount = function (words, pref) {
    let results = [];
    for (word of words) {
        if (pref.length > word) {
            continue
        }
        let template = word.slice(0, pref.length)
        console.log("template==>", template)
        if (template == pref) {
            results.push(word)
        }
    }
    console.log(results)
    return results.length
};