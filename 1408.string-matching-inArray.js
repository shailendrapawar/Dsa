var stringMatching = function(words) {
  let set= new Set();
  
  for( let i=0; i<words.length;i++){
    let word1=words[i];
    for(let j=0;j<words.length;j++){
      let word2=words[j];
      if(word2.includes(word1) && i!=j){
        set.add(word1)
      }
    }
  }
//   console.log([...set])
  return [...set]
};