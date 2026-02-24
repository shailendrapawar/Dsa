3823
// Input: s = ")ebc#da@f("

// Output: "(fad@cb#e)"

function solve(s) {
    const specialRegex = /[^a-zA-Z0-9\s]/;
    console.log("start", s);
    s = s.split("");
    //first swap normal characters
    let start = 0;
    end = s.length - 1;

    while (start < end) {
        //increment both if they arent speacial char
        if (!specialRegex.test(s[start])) {
            start++;
            continue;
        }
        if (!specialRegex.test(s[end])) {
            end--;
            continue;
        }
        //menas both pointer are at correct placrs
        //swap
        const temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start++;
        end--;
    }

    //===========================
    start = 0;
    end = s.length - 1;
    while (start < end) {
        //increment both if they  speacial char
        if (specialRegex.test(s[start])) {
            start++;
            continue;
        }
        if (specialRegex.test(s[end])) {
            end--;
            continue;
        }
        //menas both pointer are at correct placrs
        //swap
        const temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start++;
        end--;
    }

    console.log("End", s.join(""));
}

let s = ")ebc#da@f(";

solve(s);