var countPartitions = function(nums) {
  function isEvenSumPartition(index){
    let leftSum=0;
        for(let i=0;i<index;i++){
      leftSum+=nums[i];
    }
    let rightSum=0;
     for(let j=index;j<nums.length;j++){
      rightSum+=nums[j];
    }

    if((leftSum-rightSum)%2==0){
      return true
    }
    return false
  }
  
  let counter=0
  
  for(let i=1;i<nums.length;i++){
    if(isEvenSumPartition(i)){
      counter++;var countPartitions = function(nums) {
  function isEvenSumPartition(index){
    let leftSum=0;
        for(let i=0;i<index;i++){
      leftSum+=nums[i];
    }
    let rightSum=0;
     for(let j=index;j<nums.length;j++){
      rightSum+=nums[j];
    }

    if((leftSum-rightSum)%2==0){
      return true
    }
    return false
  }
  
  let counter=0
  
  for(let i=1;i<nums.length;i++){
    if(isEvenSumPartition(i)){
      counter++;
    }
  }
  return counter
};
    }
  }
  return counter
};