// 1832
function solve(sentence) {
    const alphabet = "abcdefghijklmnopqrstuvwxyz";
    for (ch of alphabet) {
        if (!sentence.includes(ch)) {
            return false;
        }
    }
    return true;
}

let sentence = "thequickbrownfoxjumpsoverthelazydog";

solve(sentence);