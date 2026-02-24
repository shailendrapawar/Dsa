// 3019
function solve(words, s) {
    let str = "";

    for (let i = 0; i < words.length; i++) {
        const w = words[i];
        str += w.charAt(0);
    }
    console.log(str);

    if (str?.equals(s)) {
        console.log("matching");
        return true;
    }
    console.log("no-matching");
    return false;
}

let words = ["never", "gonna", "give", "up", "on", "you"],
    s = "ngguoy";

solve(words, s);