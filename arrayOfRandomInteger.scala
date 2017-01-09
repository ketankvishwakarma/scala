/*
Write a code snippet that sets a to an array of n random integers between 0
(inclusive) and n (exclusive).
*/

def random_array(n : Int) : Array[Int]={
	Array.fill[Int](n){scala.util.Random.nextInt(n)}
}
println(random_array(5).mkString(","))