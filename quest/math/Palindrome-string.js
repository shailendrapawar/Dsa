var isPalindrome = function(x) {
 let str=x+""
  let size=(x+"").length-1
  let temp=""
  
  for( let i=size;i>=0;i--){
    temp+=str.charAt(i)
  }
  const result=Number.parseInt(str)
  console.log(result)
  return temp===str
};