// Range
val range1 = 1..10
println(range1)
val range2 = 1 until 10 // -> 1 .. 9
println(range2)
val range3 = 'a'..'z'
println(range3)

// Progression
val range4 = 1..10 step 2
// (1,2,3,4,5,6,7,8,9,10)-> (1,3,5,7,9)
// (1,2,3,4,5,6,7,8,9)-> (1,3,5,7,9)
println(range4)
val range5 = 10 downTo 1 step 2
println(range5)
val range6 = (1..10).reversed() step 2
for(i in range6) print("$i ")


// Collection
val collection1 = listOf<Int>(1, 2, 3, 4, 5)

