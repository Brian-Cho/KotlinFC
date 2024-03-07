//// 1 --------------------------------------
//fun TrueFalse(A1: Int, B1: Int){
//    if(A1 == B1) println("true")
//    else println("false")
//}
//TrueFalse(10,20)
//// 2 --------------------------------------
//var A2: Int = 10
//var B2: Int = 2*A2
//println(A2)
//println(B2)
//// 3 -------------------------------------- 함수로 안했음
//val A3: Int = 95
//when(A3){
//    in 90..100 -> println("A")
//    in 80..89  -> println("B")
//    in 70..79  -> println("C")
//    else -> println("F")
//}
//// 4 --------------------------------------
//fun ExamScore(A4: Int) = 5 * A4
//val Score: Int = ExamScore(5)
//println(Score)
//// 5 --------------------------------------
//fun PlusNull(A5: Int?, B5: Int?){
//    if (A5 == null && B5 == null){
//        println("0")
//    }
//    else if(A5 == null){
//        println(B5)
//    }
//    else if(B5 == null){
//        println(A5)
//    }
//    else{
//        println(A5+B5)
//    }
//}
//PlusNull(1,2)