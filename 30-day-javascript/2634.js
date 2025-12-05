var filter = function(arr, fn) {
    
    let result=[];
    for(let i=0;i<arr.length;i++){
        let val=fn(arr[i],i)
        if(val){
            result.push(arr[i])
        }
    }

    return result
    
};