3792
// Input: s = "abcd", k = 2

// Output: "bacd"

function solve(s, k) {
    let start = 0;
    let end = k - 1;
    s = s.split("");

    while (start < end) {
        const temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start++;
        end--;
    }
    console.log(s.join(""));
    return s.join("");
}

let s = "abcd",
    k = 2;
solve(s, k);