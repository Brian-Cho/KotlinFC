// break
for (i in 1..3){// i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) break //구문1
        else println("j : " + j) //구문2
    }
}
println("------------------------------")
// break + label
loop@for (i in 1..3){// i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) break@loop //구문1
        else println("j : " + j) //구문2
    }
}
println("continue------------------------------")
// continue
for (i in 1..3){ //i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) continue // 구문 1
        else println("j : " + j) // 구문2
    }
}
println("continue + label------------------------------")
// continue + label
loop@for (i in 1..3){ //i반복문
    println("i : " + i)
    for (j in 1..3){//j반복문
        if (j==2) continue@loop // 구문 1
        else println("j : " + j) // 구문2
    }
}

println("------------------------------")
// return
fun returnFunction():Unit{
    for (i in 1..3){ //i반복문
        println("i : " + i)
        for (j in 1..3){//j반복문
            if (j==2) return // 구문 1
            else println("j : " + j) // 구문2
        }
    }
}

returnFunction()

// foreach + label
// foreach 는 continue와 break 사용 불가
println("foreach------------------------------")
listOf(1,2,3).forEach loop@{
    if(it==2) return@loop
    else println(it)
}
