var createCounter = function(n) {
   let counter=0

   return()=>{
    let temp=counter;
    counter+=1;
    return n+temp
   }

};