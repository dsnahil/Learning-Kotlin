fun main() {
    print("Enter number: ")
    val n = readLine()!!.toInt()
    println("Factorial of $n =  " + recursionFact(n))
    println("By Tailrec Keyword, Factorial of $n= " + fact(n))
}
fun recursionFact(n: Int): Int {
    if (n == 1 || n == 0) {
        return 1
    }
    return n * recursionFact(n - 1)
}
tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1) {
        temp
    } else {
        fact(n - 1, temp * n)
    }
}