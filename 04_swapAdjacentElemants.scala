/*
Write a loop that swaps adjacent elements of an array of integers. For example,
Array(1, 2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5) .
**/

var array = Array(1,2,3,4,5)

def swapAdjacentArrayElemants(array :Array[Int])={
	var index = 0
	var swaplen = if(array.size%2==0) array.size else (array.size -1)
	while(index < swaplen) {
		val temp = array(index)
		array.update(index,array(index+1))
		array.update(index+1,temp)
		index+=2;
	}
}

println(array.mkString("|"))
swapAdjacentArrayElemants(array)
println("init swap \n"+array.mkString("|"))