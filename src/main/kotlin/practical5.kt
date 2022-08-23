fun main()
{
    println("Enter Month no")
    val x= readLine()!!.toInt()
    when(x)
    {
        1->
            println("$x is January")
        2->
            println("$x is February")
        3->
            println("$x is March")
        4->
            println("$x is April")
        5->
            println("$x is May")
        6->
            println("$x is June")
         7->
            println("$x is July")
        8->
            println("$x is August")
        9->
            println("$x is September")
        10->
            println("$x is October")
        11->
            println("$x is November")
        12->
            println("$x is December")
         else->
            println("Invalid")
    }
}