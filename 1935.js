// 1935
function solve(text, brokenLetters) {
    const brokenSet = new Set(brokenLetters.split(""));
    text = text?.split(" ");
    let counter = text.length;
    for (const word of text) {
        let isAllowed = true;
        for (const ch of word) {
            if (brokenSet.has(ch)) {
                isAllowed = false;
                // means  word conains broken keyword
            }
        }
        if (!isAllowed) {
            counter -= 1;
        }
    }
    return counter;
}

let text = "leet code",
    brokenLetters = "lt";

solve(text, brokenLetters);