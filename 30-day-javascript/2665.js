var createCounter = function (init) {

    let temp = init;

    return {
        increment: () => {

            return temp += 1;
        },
        decrement: () => {

            return temp -= 1;
        },
        reset: () => {
            temp = init
            return init
        }
    }

}