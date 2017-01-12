/*
Write a code snippet that sets a to an array of n unique random integers 
between 0 (inclusive) and 10000 (exclusive).
*/
def arrayOfRandomNumners(n : Int) :Array[Int]={
	var v = Array[Int]()
	var x:Int = 0
	while(x<n){
		var q = scala.util.Random.nextInt(n) 
		if(!v.contains(q)){	
			v = v:+q
			x+=1
		 }	
	}
	return v
}

println(arrayOfRandomNumners(5).mkString(","))
