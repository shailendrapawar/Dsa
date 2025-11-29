var uniqueOccurrences = function(nums) {
      let map=new Map();
  
  for(let num of nums){
    if(map.has(num)){
      map.set(num,map.get(num)+1)
    }else{
      map.set(num,1)
    }
  }
  
  let keysSize=[...map.keys()].length
  let rMap= new Map()
  for(v of map.values()){
    rMap.set(v,1)
  }

  return rMap.size==keysSize
};