var first = true
var n = a.length
var i = 0
while(i<len){
   if(a(i) >=0) 
     i+=1
   else{
       if(first) {
	first = false; 
        i+=1
      }else {
	a.remove(i); 
	n -=1
      }
   }
}
