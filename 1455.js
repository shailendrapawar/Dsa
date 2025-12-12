var isPrefixOfWord = function (sentence, searchWord) {

    let words = sentence.split(" ");

    for (let i = 0; i < words.length; i++) {
        let word = words[i];

        // get prefix of same length as searchWord
        let prefix = word.slice(0, searchWord.length);

        if (prefix === searchWord) {
            return i + 1;   // 1-based index
        }
    }

    return -1;
};