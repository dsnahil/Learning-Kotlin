fun main() {
    print("Enter your Enrollment No: ")
    val eno: Long= readLine()!!.toLong()
    print("Enter your Name: ")
    val name: String= readLine()!!
    print("Enter your Branch: ")
    val branch: String= readLine()!!
    print("Enter your Class: ")
    val clss: String= readLine()!!
    print("Enter your College name: ")
    val cllg: String= readLine()!!
    print("Enter your University name: ")
    val uni: String= readLine()!!
    print("Enter your Age: ")
    val age: Int= readLine()!!.toInt()
    println("")
    println("")
    println("Student's Data")
    println("Your name: $eno")
    println("Your name: $name")
    println("Your name: $branch")
    println("Your name: $clss")
    println("Your name: $cllg")
    println("Your name: $uni")
    println("Your name: $age")
}