// 3541
// Input: s = "aAbBcC"
// Output: 2

function solve(s = "") {
    if (s?.trim()?.length == 0) {
        return 0;
    }
    s = s.toLowerCase();
    const set = ["a", "e", "i", "o", "u"];
    //make maps for  both
    let vMap = new Map();
    let cMap = new Map();

    for (const ch of s) {
        // console.log("char=>", ch);
        if (set.includes(ch)) {
            //its vowel
            vMap.set(ch, vMap.get(ch) + 1 || 1);
        } else {
            // consonant
            cMap.set(ch, cMap.get(ch) + 1 || 1);
        }
    }

    //track frequent element for both
    let vMax = {
        element: "a",
        count: 0,
    };

    let cMax = {
        element: "b",
        count: 0,
    };

    for (const [key, value] of vMap) {
        //set vowels
        if (value > vMax.count) {
            vMax.count = value;
        }
    }
    //for consonant
    for (const [key, value] of cMap) {
        //set vowels
        if (value > cMax.count) {
            cMax.count = value;
        }
    }
    console.log(vMax, cMax);
    return vMax.count + cMax.count;
}

let s = "successes";
solve(s);
