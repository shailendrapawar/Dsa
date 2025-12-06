var canConstruct = function(ransomNote, magazine) {
  //map all values in magazine
 const magazineMap=new Map();
  for(ch of magazine){
    console.log(ch)
    magazineMap.set(ch,magazineMap.get(ch)+1||1)
  }
  console.log(magazineMap)
  
  for(ch of ransomNote){
    if(magazineMap.has(ch)){
      if(magazineMap.get(ch)==0){
        return false;
      }else{
        magazineMap.set(ch,magazineMap.get(ch)-1)
      }
    }else{
      return false;
    }
  }
  
  console.log("can be made")
  return true
};