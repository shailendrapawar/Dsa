// 1859
function solve(s) {
    let result = [];

    let sentence = s.split(" ");
    console.log("sentences==>", sentence);

    sentence?.map((item) => {
        const itemLength = item?.length;
        const order = item?.charAt(itemLength - 1);
        const word = item?.slice(0, item.length - 1);

        result[order - 1] = word;
    });

    console.log(result.join(" "));
}

let s = "is2 sentence4 This1 a3";

solve(s);