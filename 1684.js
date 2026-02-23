// 1684

function solve(allowed, words) {
    let counter = words.length;
    for (const word of words) {
        let isAllowed = true;
        for (const ch of word) {
            if (!allowed.includes(ch)) {
                isAllowed = false;
            }
        }

        if (!isAllowed) {
            counter -= 1;
        }
    }
    return counter;
}

let allowed = "cad";
let words = ["cc", "acd", "b", "ba", "bac", "bad", "ac", "d"];

solve(allowed, words);