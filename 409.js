  let map=new Map();
  
  for(ch of s){
    map.set(ch,map.get(ch)+1||1)
  }
  
  let str=0
  let flag = true;
  
  for(entry of [...map]){
    const char=entry[0];
    const count=entry[1];

    if(count%2==0){

    str += count;
    }else if(flag){
        str += count;
        flag = false;
    }else{
        str += (count - 1);
    }
    
  }
    
  console.log("str",str)
  return str