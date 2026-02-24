// 1967
function solve(patterns, word) {
    let counter = 0;

    for (let ch of patterns) {
        if (word.includes(ch)) {
            console.log(ch, "is inside");
            counter += 1;
        }
    }
    console.log(counter);
}

let patterns = ["a", "b", "c"],
    word = "aaaaabbbbb";

solve(patterns, word);