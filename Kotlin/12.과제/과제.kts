//1. ------------------------------------------------------------------------------
fun rotPr(){
    for (i in 0 until 10){
        println("hello $i")
    }
}

//rotPr()
//2. ------------------------------------------------------------------------------
fun plusNumbers(){
    val numbers: String? = readLine()   // 입력받는 방법 -> String?으로 readLine()후 Int?에 변수?.toInt()로 변환*
    val number: Int? = numbers?.toInt() // numbers뒤에 물음표 안붙이면 only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    var pl: Int = 0
    if(number != null){
        for(i in 1..number){
            pl = pl + i
        }
        println(pl)
    }
    else{
        println("올바른 정수를 입력하세요")
    }
}

//plusNumbers()
//3. ------------------------------------------------------------------------------
fun plusSeven(){
    var sum: Int = 0
    for(i in 1..100 step 7){
        sum += i
    }
    println(sum)
}

//plusSeven()
//4. ------------------------------------------------------------------------------
fun plusSN(){
    val numbers4: String? = readLine()
    val number4: Int? = numbers4?.toInt()
    if (number4 != null){
        if (number4 < 100){
            for (i in number4..100){
                println(i)
            }
        }
        else{
            println("100보다 작은 숫자를 입력하세요")
        }
    }
    else{
        println("올바른 정수를 입력하세요")
    }
}

//plusSN()
//5. ------------------------------------------------------------------------------
fun TF(ex: List<Int>){
    val result = mutableListOf<Boolean>()
    for (i in ex.indices){
        if(ex[i] >= 80){
            result.add(true)
        }
        else{
            result.add(false)
        }
    }
    println(result)
}

//var examList = listOf<Int>(70,71,72,77,78,79,80,82,90,99)
//TF(examList)
//6. ------------------------------------------------------------------------------
fun sixPlus(){
    var number = mutableListOf<List<Int>>() // List안에 List 넣기 가능 <List<자료형>> 값 안넣어도 됨
    for (i in 1..5){
        number.add(listOf(i,6-i)) // 추가방식으로 안에 list 넣기
    }
    println(number)
}

//sixPlus()
//7. ------------------------------------------------------------------------------

//8. ------------------------------------------------------------------------------
fun abc(A: MutableList<String>,B: MutableList<String>,C: Int):List<MutableList<String>>?{ // list or null이므로 감싸짐
    if((A.size > C) && (B.size > C)){
        A.removeAt(C)              // 요소값이 아닌 인덱스를 기준으로 제거하기 때문에 removeAt
        B.removeAt(C)
        return listOf(A, B)
    }
    else{
        return null
    }
}

//val array1 = mutableListOf("A","B","C","D","E")
//val array2 = mutableListOf("A","B","C")
//val array3: Int = 4
//val result = abc(array1, array2, array3)
//print(result)

//9. ------------------------------------------------------------------------------
fun abc(num: Int){
    val lo = mutableListOf<Int>()
    for(i in 1..9){
        lo.add(num*i)
    }
    print(lo)
}
//abc(4)
//10. ------------------------------------------------------------------------------
