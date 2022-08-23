println("Enter no to Check ODD or EVEN")
    val no:Int = readLine()!!.toInt()
    if (no % 2 ==0)
        println("$no is Even")
    else
        println("$no is Odd")