682
// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]

// An integer x :=>  Record a new score of x.
// '+'.:==> Record a new score that is the sum of the previous two scores.
// 'D'.:=> Record a new score that is the double of the previous score.
// 'C'.:=> Invalidate the previous score, removing it from the record.

function solve(operations) {
    let result = [0];

    for (let i = 0; i < operations.length; i++) {
        switch (operations[i]) {
            case "+": {
                const curr = result[result.length - 1] + result[result.length - 2];
                result.push(curr);
                break;
            }
            case "D": {
                const curr = 2 * Number.parseInt(result[result.length - 1]);

                result.push(curr);
                break;
            }
            case "C": {
                result.pop();
                break;
            }

            default: {
                const curr = Number.parseInt(operations[i]);
                result.push(curr);
            }
        }
    }

    let finalScore = 0;

    // for (score of result) {
    //   finalScore += Number.parseInt(score);
    // }
    for (let i = 0; i < result.length; i++) {
        finalScore += Number.parseInt(result[i]);
    }

    console.log(finalScore);
    return finalScore;
}

let ops = ["5", "2", "C", "D", "+"];

solve(ops);